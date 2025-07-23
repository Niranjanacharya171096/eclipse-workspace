package com.selenium.threadsafety;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class parallelTestingWithThreadSafety {
  private static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
  WebDriver driver;

  private void setDriver(WebDriver driver) {
    tdriver.set(driver);
  }

  private WebDriver getDriver() {
    return driver;
  }

  @Test
  public void DriverTest1() {
    driver = new ChromeDriver();

    setDriver(driver);
    driver = getDriver();

    driver.get("https://www.google.com/");
    System.out.println("Title :: "+driver.getTitle());
    driver.quit();
  }

  @Test
  public void DriverTest2() {
    driver = new EdgeDriver();

    setDriver(driver);
    driver = getDriver();

    driver.get("https://www.bing.com/");
    System.out.println("Title :: "+driver.getTitle());
    driver.quit();
  }

  @AfterClass
  void tearDown() {
    tdriver.remove();
  }
}
