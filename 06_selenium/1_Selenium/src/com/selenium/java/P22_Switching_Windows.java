package com.selenium.java;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P22_Switching_Windows {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("E:\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\HTML\\page1.html");
    Thread.sleep(3000);
    String parentWindowID = driver.getWindowHandle();
    String mTitle = driver.getTitle();
    System.out.println(mTitle + " :: " + parentWindowID);

    driver.findElement(By.linkText("Page 2")).click();
    Thread.sleep(3000);

    Set<String> allWIndowsID = driver.getWindowHandles(); // which gives ID of each new window/Tab
    int count = allWIndowsID.size();
    System.out.println(count);

    for (String windID : allWIndowsID) {
      driver.switchTo().window(windID); // it is switching to Parent then Child
      System.out.println(driver.getTitle() + " :: " + windID);
    }

    driver.findElement(By.linkText("Page 3")).click(); // Page3 opend in the same Page2 tab
    String page3WindowID = driver.getWindowHandle(); // so page2 and page3 tab id is same
    String p3Title = driver.getTitle();
    System.out.println("\n" + p3Title + " :: " + page3WindowID);
    Thread.sleep(3000);

    driver.close(); // will close active window i.e., Page2
    driver.switchTo().window(parentWindowID); // switching to Parent Page1 from Child Page2/3
    System.out.println(driver.getTitle()); // NoSuchWindowException as if active Page1 is closed and driver will not switch to previous window

    Thread.sleep(3000);
    driver.close(); // will close active window i.e., Page1
    driver.quit(); //  handleException
  }
}
