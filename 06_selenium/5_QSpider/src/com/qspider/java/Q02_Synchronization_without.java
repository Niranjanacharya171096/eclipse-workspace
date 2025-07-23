package com.qspider.java;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02_Synchronization_without {
  public static void main(String[] args) {
    WebDriver driver=new ChromeDriver(); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("http://demo.actitime.com"); 
    driver.findElement(By.id("username")).sendKeys("admin"); 
    driver.findElement(By.name("pwd")).sendKeys("manager"); 
    driver.findElement(By.id("loginButton")).click();
    while(true) {
      try{
        driver.findElement(By.id("logoutLink")).click();
        break;
      } catch(NoSuchElementException e){
        System.out.println("Bye");
      }
    }
  }
}
