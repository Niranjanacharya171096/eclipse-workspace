package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P16_Synchronization_Explicitwait {
  public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://www.shadi.com");
    driver.findElement(By.linkText("Join Now")).click();

    WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement firstname = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));

    firstname.sendKeys("Niranjan");

    //    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
    //    wait.
    //    FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
    //    wait.
  }
}
