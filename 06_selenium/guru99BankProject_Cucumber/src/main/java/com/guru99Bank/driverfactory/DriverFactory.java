package com.guru99Bank.driverfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
  private static WebDriver driver;

  public WebDriver initDriver() {
    // WebDriverManager.firefoxdriver().setup();
    String key = "webdriver.gecko.driver";
    String value = "E:\\selenium jar\\geckodriver.exe";
    System.setProperty(key, value);
    driver = new FirefoxDriver();

    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // return driver;

    return getDriver();
  }

  public static synchronized WebDriver getDriver() {
    return driver;
  }
}
