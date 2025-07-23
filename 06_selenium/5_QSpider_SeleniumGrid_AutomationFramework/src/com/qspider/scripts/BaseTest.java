package com.qspider.scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.XmlTest;

public class BaseTest {
  public WebDriver driver;

  @BeforeMethod
  public void preCondition(XmlTest x) throws MalformedURLException {
    //    String browser = x.getParameter("browser");
    //    Reporter.log("Browser is:" + browser, true);

    //    if (browser.equals("GC")) {
    //      System.setProperty("webdriver.chrome.driver","./exefiles/chrome.exe");
    //      ChromeOptions options = new ChromeOptions();
    //      options.setCapability("platform", Platform.WINDOWS);
    //
    //      driver=new RemoteWebDriver(new URL("http://192.168.7.105:4444/wd/hub"), options);
    ////      new URL("http://192.168.1.100:4444/wd/hub"), options
    //    }
    //    else {
    System.setProperty("webdriver.msedge.driver","./exefiles/msedgedriver.exe");
    EdgeOptions options = new EdgeOptions();
    options.setCapability("platform", Platform.WINDOWS);

    //      driver=new RemoteWebDriver(options);
    driver=new RemoteWebDriver(new URL("http://192.168.0.110:4444/wd/hub"), options);
    not running
    //      }
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void postCondition() {
    driver.close();
  }
}
