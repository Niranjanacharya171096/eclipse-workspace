package com.hyrtutorials.testng;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class H23_Parameter {
  WebDriver driver;

  @Parameters({"browserName", "url"})
  @BeforeTest
  public void InitialiseBrowser(@Optional("chrome") String browserName, String url) {
    switch (browserName.toLowerCase()) {
    case "chrome":
      //      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      break;
    case "edge":
      //      WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
      break;
    case "firefox":
      //      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
      break;
    default:
      System.out.println("Browsername is invalid");
      break;
    }
    driver.manage().window().maximize();
    driver.get(url);

  }

  //  @Parameters("url")
  //  @Test
  //  public void LaunchApp(String url) {
  //    driver.get(url);
  //  }

  @Parameters({"username", "password"})
  @Test
  public void EnterLoginDetails(String userName, String password) {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.name("username")).sendKeys(userName);
    driver.findElement(By.name("password")).sendKeys(password, Keys.ENTER);
    //    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }

  @Test
  public void VerifyLogin() {
    WebElement element = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
    System.out.println(element.isDisplayed());
    System.out.println(element.getText().startsWith("Das"));
    assertTrue(element.isDisplayed());
    assertTrue(element.getText().startsWith("Das"));
  }

  @Test
  public void NavigateToMyInfo() {
    driver.findElement(By.xpath("//span[text()='My Info']")).click();
  }

  @Test
  public void VerifyMyInfo() {
    boolean actualValue = driver.findElement(By.xpath("//h6[text()='Personal Details']")).isDisplayed();
    assertTrue(actualValue);
  }

  @Parameters("sleepTime")
  @AfterTest
  public void TearDown(Long sleepTime) throws Exception {
    System.out.println(sleepTime);
    Thread.sleep(sleepTime);
    driver.quit();
  }
}