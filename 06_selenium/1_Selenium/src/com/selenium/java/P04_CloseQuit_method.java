package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_CloseQuit_method {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("E:\\Software Files\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\HTML\\page1.html");
    Thread.sleep(5000);

    driver.findElement(By.linkText("Page 2")).click();

    Thread.sleep(5000);
    driver.close(); // closes active window i.e., Page1. though Page 2 is opened but driver is not
    // switched to Page2

    // System.out.println(driver.getTitle()); // NoSuchWindowException as active
    // Page1 is closed and driver doesn't switch automatically to previous window
    // Thread.sleep(5000);

    // driver.quit(); // SocketException: if we use both close() and quit() and
    // there is no window to close
  }
}
