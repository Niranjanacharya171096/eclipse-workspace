package com.selenium.java;
//P31_PageObject_Model is a main program 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P31_Home {
  WebDriver driver;
  
  public P31_Home(WebDriver driver) {
    this.driver = driver;
  }
  
  public void onClickOrangeHRMLink() {
    driver.findElement(By.xpath("//a[@class='oxd-brand']")).click();
  }
}
