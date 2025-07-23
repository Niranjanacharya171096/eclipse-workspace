package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P43_TestNG_DataProvider {
  WebDriver driver;

  @DataProvider(parallel= true, name = "authentication") //any name can be given
  public Object[][] dataProvider() {
    Object[][] obj = new Object[2][2];
    //positive data
    obj[0][0]="Admin";
    obj[0][1]="admin123";
    //negative data
    obj[1][0]="Admin1";
    obj[1][1]="admin1234";

    return obj;
  }

  @Test(dataProvider = "authentication")
  public void testCase(String username, String password) throws InterruptedException {
    driver = new EdgeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    System.out.println(username+"\n"+password);
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();

    Thread.sleep(5000);
    driver.close();
  }
}