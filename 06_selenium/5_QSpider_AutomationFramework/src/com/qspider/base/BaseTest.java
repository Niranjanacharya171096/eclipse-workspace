package com.qspider.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
  public WebDriver driver;

  @BeforeMethod
  public void preCondition() {
    driver = new ChromeDriver();
    driver.get("https://demo.actitime.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void postCondition() {
    driver.close();
  }
}
