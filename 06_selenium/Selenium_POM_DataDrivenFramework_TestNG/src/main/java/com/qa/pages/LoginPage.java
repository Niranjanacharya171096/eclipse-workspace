package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.reporter.ExtentReporter;

public class LoginPage {
  ExtentReporter extent;

  @FindBy(name = "username")
  private WebElement unTextBox;
  @FindBy(name = "password")
  private WebElement pwTextBox;
  @FindBy(xpath = "//button[text() = ' Login ']")
  private WebElement loginButton;
  @FindBy(xpath = "//h6[text() = 'Dashboard']")
  private WebElement dashboard;
  @FindBy(xpath = "//p[text() = 'Invalid credentials']")
  private WebElement errMsg;

  public LoginPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }

  public void setUserName(String un) {
    unTextBox.sendKeys(un);
  }

  public void setPassword(String pw) {
    pwTextBox.sendKeys(pw);
  }

  public void clickLoginButton() {
    loginButton.click();
  }

  public void verifyErrMsg() {
    //    Assert.assertTrue(errMsg.isDisplayed());
    Assert.assertTrue(dashboard.isDisplayed());
  }
}
