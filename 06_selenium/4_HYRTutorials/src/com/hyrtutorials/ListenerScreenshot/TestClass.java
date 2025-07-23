package com.hyrtutorials.ListenerScreenshot;

import static org.testng.Assert.assertEquals; 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass extends BaseTest{
  @Test(testName = "TestGoogle")
  public void TestGoogle() throws Exception {
    driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
    String expectedTitle = "HYR Tutorials - Google Search";
    String actualTitle = driver.getTitle();
    assertEquals(actualTitle, expectedTitle, "Title is mismatched");
  }

  @Test(testName = "TestActitime")
  public void TestActitime() throws Exception {
    driver.get("https://demo.actitime.com/");
    driver.findElement(By.id("username")).sendKeys("admin"); 
    driver.findElement(By.name("pwd")).sendKeys("manager123", Keys.ENTER); 
    Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).isDisplayed());
//    driver.findElement(By.id("loginButton")).click();
  }

  @Test(testName = "TestOrangeHRM")
  public void TestOrangeHRM() throws Exception {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
    Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
  }
}