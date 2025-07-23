package com.hyrtutorials.testng;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class H22_HardSoftAssertions {
  @Test
  public void TestGoogle() throws Exception {
    //    WebDriverManager.chromedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
    String expectedTitle = "HYR Tutorials - Google Searchh";
    String actualTitle = driver.getTitle();
    assertEquals(actualTitle, expectedTitle, "Title is mismatched");
    Thread.sleep(5000);
    driver.quit();
  }

  @Test
  public void TestOrangeHRM() throws Exception {
    //    WebDriverManager.chromedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin", Keys.ENTER);
    Thread.sleep(5000);

    SoftAssert softAssert = new SoftAssert();
    //Title Assertion
    String actualTitle = driver.getTitle();
    String expectedTitle = "OrangeHRM";
    softAssert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");

    //URL Assertion
    String actualUrl = driver.getCurrentUrl();
    String expectedUrl = "https://opensource-demo.orangehrmlive.com/";
    softAssert.assertEquals(actualUrl, expectedUrl, "URL is mismatched");

    //Text Assertion
    String actualText = driver.findElement(By.name("username")).getAttribute("value");
    String expectedText = "ad";
    softAssert.assertEquals(actualText, expectedText, "Username text is mismatched");

    //Border Assertion
    String actualBorder = driver.findElement(By.name("username")).getCssValue("border");
    String expectedBorder = "1px solid rgb(232,234,239)"; //convert Hex to RGB #e8eaef
    softAssert.assertEquals(actualBorder, expectedBorder, "Username border is mismatched");

    //ErrorMessage Assertion
    String actualErrorMessage = driver.findElement(By.xpath("//div[@class='orangehrm-login-error']/div/div/p")).getText();
    String expectedErrorMessage = "Invalid Credentials";
    softAssert.assertEquals(actualErrorMessage, expectedErrorMessage, "Username error message is mismatched");

    driver.quit();
    softAssert.assertAll(); //throws all exceptions at the end
  }
}