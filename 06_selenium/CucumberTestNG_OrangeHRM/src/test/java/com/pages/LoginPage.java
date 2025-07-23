package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  // locators and Constructor and Page actions
  private WebDriver driver;

  private By userName = By.name("username");
  private By passWord = By.name("password");
  private By loginButton = By.xpath("//button[@type='submit']");
  private By forgotPwdLink = By.xpath("//p[starts-with(normalize-space(), 'Forgot')]");

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public String getLoginPageTitle() {
    return driver.getTitle();
  }

  public void enterUserName(String username) {
    driver.findElement(userName).sendKeys(username);
  }

  public void enterPassword(String password) {
    driver.findElement(passWord).sendKeys(password);
  }

  public void clickOnLogin() {
    driver.findElement(loginButton).click();
  }


  public boolean isForgotPwdLinkExist() {
    return driver.findElement(forgotPwdLink).isDisplayed();
  }
}
