package com.pages;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

public class LoginPage {
  private WebDriver driver;

  //By class locators
  private By emailID = By.xpath("//input[@id='email']");
  private By password = By.xpath("//input[@id='pass']");
  private By loginButton = By.xpath("//input[@id='u_0_5_iT']");
  private By forgottenPwd = By.xpath("//a[contains(text(),'Forgotten password?')]");
  private By signUp = By.xpath("//a[contains(text(),'Create new account')]");

  //constructors
  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  //page actions (functionalities)
  public String getLoginPageTitle() {
    return driver.getTitle();
  }

//  public boolean isForgottenPwdExist() {
//    return driver.findElement(forgottenPwd).isDisplayed();
//  }
//
//  public boolean isSignUpExist() {
//    return driver.findElement(signUp).isDisplayed();
//  }
//
//  public void enterUserName(String username) {
//    driver.findElement(emailID).sendKeys(username);;
//  }
//
//  public void enterPassword(String pwd) {
//    driver.findElement(emailID).sendKeys(pwd);
//  }
//
//  public void clickLogin() {
//    driver.findElement(loginButton).click();
//  }
}
