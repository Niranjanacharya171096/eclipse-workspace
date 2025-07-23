package com.hyrtutorials.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H25_ExcelDataReceiver {
  @Test(dataProvider = "loginData", dataProviderClass = H25_ExcelDataSupplier.class)
  public void TestLogin(String username, String password) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    System.out.println(username+" "+password);

    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());

    Thread.sleep(5000);
    driver.quit();
  }
}