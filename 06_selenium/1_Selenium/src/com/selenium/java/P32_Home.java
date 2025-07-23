package com.selenium.java;
//P32_PageFactory_Model is a main program

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P32_Home {
  WebDriver driver;

  public P32_Home(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath="//a[@class='oxd-brand']")
  WebElement homepage;

  public void onClickOrangeHRMLink() {
    homepage.click();
  }
}
