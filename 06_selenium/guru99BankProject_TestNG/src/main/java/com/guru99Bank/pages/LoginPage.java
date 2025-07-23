package com.guru99Bank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  private WebDriver driver;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//input[@name='uid']")
  WebElement userID;

  public void enterUserID() {
    userID.sendKeys("mngr529171");
  }

  @FindBy(xpath = "//input[@name='password']")
  WebElement password;

  public void enterPassword() {
    (this.password).sendKeys("ehErAhU");
  }

  @FindBy(xpath = "//input[@type='submit']")
  WebElement login;

  public void clickOnLogin() {
    login.click();
  }
}
