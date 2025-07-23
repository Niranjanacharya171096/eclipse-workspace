package com.selenium.java;
//P31_PageObject_Model is a main program 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P31_Login {
  WebDriver driver;
  
  public P31_Login(WebDriver driver) {
    this.driver = driver;
  }
  
  public void onClickUsername() {
    driver.findElement(By.name("username")).sendKeys("Admin");
  }
  public void onClickPassword() {
    driver.findElement(By.name("password")).sendKeys("admin123");
  }
  public void onClickLogin() {
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
  }
}
