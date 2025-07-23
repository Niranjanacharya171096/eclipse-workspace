package com.selenium.java;
//P32_PageFactory_Model is a main program 

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P32_Login {
  WebDriver driver;
  
  public P32_Login(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(name="username")
  WebElement username;
  
  @FindBy(name="password")
  WebElement password;

  @FindBy(xpath="//button[text()=' Login ']")
  WebElement login;
  
  public void onClickUsername() {
    username.sendKeys("Admin");
  }
  public void onClickPassword() {
    password.sendKeys("admin123");
  }
  public void onClickLogin() {
    login.click();
  }
}
