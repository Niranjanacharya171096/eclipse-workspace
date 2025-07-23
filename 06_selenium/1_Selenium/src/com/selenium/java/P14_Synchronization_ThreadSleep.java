package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_Synchronization_ThreadSleep {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.shadi.com");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.linkText("Join Now")).click();
    
    WebElement firstname = driver.findElement(By.id("first_name"));
    Thread.sleep(3000);
    firstname.sendKeys("Niranjan");
  }
}
