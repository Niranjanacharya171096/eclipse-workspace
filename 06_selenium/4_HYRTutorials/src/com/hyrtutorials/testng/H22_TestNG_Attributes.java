package com.hyrtutorials.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class H22_TestNG_Attributes {

  @Test(invocationCount = 3)
  public void testmethod1() throws Exception {
    //    WebDriverManager.chromedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.get("https://randomuser.me/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[@data-label = 'name']")).click();
    System.out.println("User name: " + driver.findElement(By.id("user_value")).getText());

    driver.findElement(By.xpath("//li[@data-label = 'email']")).click();
    System.out.println("Email address: " + driver.findElement(By.id("user_value")).getText());
    driver.quit();
  }

  @Test(invocationCount = 3, invocationTimeOut = 10000)
  public void testmethod2() throws Exception {
    //    WebDriverManager.chromedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.get("https://randomuser.me/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[@data-label = 'name']")).click();
    System.out.println("User name: " + driver.findElement(By.id("user_value")).getText());

    driver.findElement(By.xpath("//li[@data-label = 'email']")).click();
    System.out.println("Email address: " + driver.findElement(By.id("user_value")).getText());
    driver.quit();
  }

  @Test(invocationCount = 4, threadPoolSize = 2)
  public void testmethod3() throws Exception {
    //    WebDriverManager.chromedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.get("https://randomuser.me/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[@data-label = 'name']")).click();
    System.out.println("User name: " + driver.findElement(By.id("user_value")).getText());

    driver.findElement(By.xpath("//li[@data-label = 'email']")).click();
    System.out.println("Email address: " + driver.findElement(By.id("user_value")).getText());
    driver.quit();
  }
}
