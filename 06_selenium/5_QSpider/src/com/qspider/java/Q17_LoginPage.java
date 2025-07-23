package com.qspider.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Q17_LoginPage {
  WebDriver driver;
  //  private WebElement unTextBox;
  By uname = By.name("username");

  public Q17_LoginPage(WebDriver driver) {
    this.driver = driver;
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //    unTextBox=driver.findElement(By.name("username"));
  }

  public void setUserName() {
    //    unTextBox
    driver.findElement(uname).sendKeys("Admin");
  }
}
