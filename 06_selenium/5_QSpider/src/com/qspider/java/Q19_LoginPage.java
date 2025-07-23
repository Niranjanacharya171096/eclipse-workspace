package com.qspider.java;
//Q19_PageFactoryModel_WithConstructor

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q19_LoginPage {
  @FindBy(id="username") 
  private WebElement unTextBox; 
  @FindBy(name="pwd")
  private WebElement pwTextBox;
  @FindBy(id="loginButton")
  private WebElement loginButton;
  
  public Q19_LoginPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }
  
  public void login(String un, String pw) {
    unTextBox.sendKeys(un); 
    pwTextBox.sendKeys(pw);
    loginButton.click();
  }
}
