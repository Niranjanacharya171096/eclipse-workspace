package com.qspider.java;
//Q20_PageFactoryModel_WithoutConstructor
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q20_LoginPage {
  @FindBy(id="username") 
  private WebElement unTextBox; 
  @FindBy(name="pwd")
  private WebElement pwTextBox;
  @FindBy(id="loginButton")
  private WebElement loginButton;

  public void login(String un, String pw) {
    unTextBox.sendKeys(un); 
    pwTextBox.sendKeys(pw);
    loginButton.click();
  }
}
