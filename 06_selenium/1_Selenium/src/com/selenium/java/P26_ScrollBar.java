package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P26_ScrollBar {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");

    Thread.sleep(5000);
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0, 300)", "");
    
    driver.findElement(By.xpath("//a[text()='Help']")).click();
    
    Thread.sleep(5000);
    driver.quit(); 
  }
}