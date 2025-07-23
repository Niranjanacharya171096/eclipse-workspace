package com.selenium.java;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P50_TestNG_MultipleBrowsers {
  WebDriver driver;
  
  @BeforeMethod
  @Parameters({"browser"})
  public void selectBrowser(String browser) {
    if (browser.equalsIgnoreCase("chrome")) {
      driver = new ChromeDriver();
    } else {
      driver = new EdgeDriver();
    }
  }
  
  @Test
  public void testCase() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    long id = Thread.currentThread().getId();
    System.out.println("Thread id :" + id);

    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    
    Thread.sleep(5000);
    driver.close();
  }
}