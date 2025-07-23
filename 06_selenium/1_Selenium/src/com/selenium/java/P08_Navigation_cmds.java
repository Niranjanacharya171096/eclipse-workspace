package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P08_Navigation_cmds {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement firstname =
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));


    driver.get("http://www.google.com");
    Thread.sleep(2000);

    //    driver.get("https://www.facebook.com");
    driver.navigate().to("https://www.facebook.com");
    Thread.sleep(5000);

    driver.navigate().back();
    Thread.sleep(5000);

    driver.navigate().refresh();
    Thread.sleep(5000);

    driver.navigate().forward();
    Thread.sleep(10000);

    driver.close();
  }
}
