package com.hyrtutorials.java;

import java.time.Duration; 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H11_Switching_Windows {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
    Thread.sleep(5000);

    //Store the ID of the parent window
    String parentWindow = driver.getWindowHandle();
    System.out.println("Parent Window :: "+parentWindow);
    String mTitle=driver.getTitle();
    System.out.println("Parent Window Title:: "+mTitle);

    driver.findElement(By.id("newWindowBtn")).click();
    driver.findElement(By.id("newTabBtn")).click();    
    driver.findElement(By.id("newWindowsBtn")).click();
    driver.findElement(By.id("newTabsBtn")).click();    
    driver.findElement(By.id("newWindowBtn")).click();
    driver.findElement(By.id("newTabsWindowsBtn")).click();

    //Loop through until we find a new window handle
    Set<String> handles=driver.getWindowHandles();
    int count=handles.size();
    System.out.println(count);

    for (String windowHandle : handles) {
      if(!windowHandle.equals(parentWindow)) {
//or  if(!parentWindow.contentEquals(windowHandle)) {
        driver.switchTo().window(windowHandle);
        System.out.println(driver.getTitle() +" :: "+windowHandle);
        Thread.sleep(3000);
        driver.close();
      }
    }

    driver.switchTo().window(parentWindow);
    driver.findElement(By.id("name")).sendKeys("Sayeed");  

    Thread.sleep(5000);
    driver.quit(); 
  }
}
