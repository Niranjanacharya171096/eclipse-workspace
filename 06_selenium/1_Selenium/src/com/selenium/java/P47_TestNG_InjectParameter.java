package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P47_TestNG_InjectParameter {
  @Test
  @Parameters({"url","username","password"})
  public void positiveTestCase(String url, String username, String password) {
    System.out.println(url +"\n"+ username + "\n" + password);
    
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get(url);
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    
    driver.close();
  }
}