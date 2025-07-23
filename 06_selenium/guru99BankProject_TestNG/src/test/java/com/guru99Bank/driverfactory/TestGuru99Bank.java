package com.guru99Bank.driverfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.guru99Bank.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGuru99Bank {
  private static WebDriver driver;

  @BeforeMethod
  public void initDriver() {
    WebDriverManager.firefoxdriver().setup();
    //    String key = "webdriver.gecko.driver";
    //    String value = "E:\\selenium jar\\geckodriver.exe";
    //    System.setProperty(key, value);
    driver = new FirefoxDriver();
    driver.get("http://www.demo.guru99.com/V4/");

    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void LoginScenario() {
    LoginPage loginpage = new LoginPage(driver);
    loginpage.enterUserID();
    loginpage.enterPassword();
    loginpage.clickOnLogin();

    SoftAssert softAssert = new SoftAssert();
    String actualUrl = driver.getCurrentUrl();
    String expectedUrl = "https://www.demo.guru99.com/V4/manager/Managerhomepage.php";
    softAssert.assertEquals(actualUrl, expectedUrl, "URL is mismatched");
  }

  @AfterMethod
  public void quit() {
    driver.quit();
  }
}
