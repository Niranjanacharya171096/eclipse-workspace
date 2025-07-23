package com.selenium.java;
//P32_PageFactory_Model is a main program

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P33_StartStop {
  WebDriver driver;

  public P33_StartStop(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindAll({@FindBy(xpath="//button[text()='Start']"), @FindBy(xpath="//button[text()='Stop']")})
  WebElement startstop;

  @FindBy(id="resetButton")
  WebElement reset;

  public void onClickStart() {
    startstop.click();
  }

  public void onClickStop() {
    startstop.click();
  }

  public void onClickReset() {
    reset.click();
  }
}
