package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

public class HomePage {

  private WebDriver driver;

  // 1. By locators
  private By Readmore = By.cssSelector(
      "div.before_footer_fix:nth-child(14) div.container:nth-child(2) div.row.content_below_main div.col-sm-9.col-md-9.col-lg-9.resc_xs div.tab-content div.tab-pane.active div.login_blog_card:nth-child(1) div.row div.col-md-12.col-lg-12.col-sm-12.col-xs-12.custom-fonts div.col-md-10.col-lg-10.col-sm-12.col-xs-12.blogin_upper_content div.col-md-12.col-lg-12.col-sm-12.col-xs-12.blogin_upper_content:nth-child(2) > a.blog_card_link");
  private By December = By.xpath("//a[contains(text(),'December 2020 (1)')]");

  // 2 Constructors of the page class
  public HomePage(WebDriver driver) {
    this.driver = driver;
  }

  // 3. page actions
  public String getLoginPageTitle() {
    return driver.getTitle();
  }

  public void ClickOnReadmore() {
    driver.findElement(Readmore).click();
  }

  public void ClickOnDecember() {
    driver.findElement(December).click();
  }
}