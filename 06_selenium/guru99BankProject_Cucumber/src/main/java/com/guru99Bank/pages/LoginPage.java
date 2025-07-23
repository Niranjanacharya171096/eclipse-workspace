package com.guru99Bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  private WebDriver driver;

  private By userID = By.xpath("//input[@name='uid']");
  private By password = By.xpath("//input[@type='password']");
  private By login = By.xpath("//input[@type='submit']");

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public void enterUserID(String userID) {
    driver.findElement(this.userID).sendKeys(userID);
  }

  public void enterPassword(String password) {
    driver.findElement(this.password).sendKeys(password);
  }

  public void clickOnLogin() {
    driver.findElement(this.login).click();
  }

  public String navigateManagerhomepage() throws InterruptedException {
    Thread.sleep(5000);
    String currentURL = driver.getCurrentUrl();
    return currentURL;
  }
}
