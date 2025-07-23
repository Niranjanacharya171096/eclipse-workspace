package com.hyrtutorials.ExtentReport;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest{
  @Test(testName = "TestGoogle", groups = {"smoke"})
  public void TestGoogle() throws Exception {
    driver.get("https://www.google.com/");
    extentTest.info("Navigated to Url");
    driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
    extentTest.info("Entered text in search box");
    String expectedTitle = "HYR Tutorials - Google Search";
    String actualTitle = driver.getTitle();
    assertEquals(actualTitle, expectedTitle, "Title is mismatched");
    extentTest.pass("Assertion is passed for webpage title");
  }

  @Test(testName = "TestActitime", groups = {"smoke","regression"})
  public void TestActitime() throws Exception {
    driver.get("https://demo.actitime.com/");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager123", Keys.ENTER);
    Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).isDisplayed());
    //    driver.findElement(By.id("loginButton")).click();
  }

  @Test(testName = "TestOrangeHRM", groups = {"sanity"})
  public void TestOrangeHRM() throws Exception {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
    Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
  }
}