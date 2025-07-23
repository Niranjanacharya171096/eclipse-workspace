package com.selenium.threadsafety;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parallelTestingWithoutThreadSafety {
  WebDriver driver;

  @Test
  public void DriverTest1() {
    driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    System.out.println("Title :: "+driver.getTitle());
    driver.quit();
  }

  @Test
  public void DriverTest2() {
    driver = new EdgeDriver();
    driver.get("https://www.bing.com/");
    System.out.println("Title :: "+driver.getTitle());
    driver.quit();
  }
}
