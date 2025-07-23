package com.qspider.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
  public WebDriver driver;

  @BeforeMethod
  public void preCondition() {
    driver = new EdgeDriver();
    driver.get("https://demo.actitime.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void postCondition() {
    driver.close();
  }
}
