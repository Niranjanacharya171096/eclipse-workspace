package com.qspider.scripts;

import java.time.Duration; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.XmlTest;

public class BaseTest {
  public WebDriver driver;

  @BeforeMethod
  public void preCondition(XmlTest x) {
    String browser = x.getParameter("browser");
    Reporter.log("Browser is:" + browser, true);
    
    if (browser.equals("GC"))
      driver = new ChromeDriver();
    else
      driver = new EdgeDriver();
    
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void postCondition() {
    driver.close();
  }
}
