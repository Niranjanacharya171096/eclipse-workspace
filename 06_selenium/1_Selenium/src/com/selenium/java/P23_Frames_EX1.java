package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P23_Frames_EX1 {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    driver.get("E:\\Software Files\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\HTML\\MiddleName.html");

    driver.findElement(By.id("mname")).sendKeys("Acharya");
    Thread.sleep(3000);

    // driver.switchTo().frame(0); // only 1 frame and index starts from 0
    // driver.switchTo().frame("newname1");
    // WebElement xpath = driver.findElement(By.xpath("//iframe[@name='newname1']"));
    // driver.switchTo().frame(xpath);
    // or

    WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(60));
    wdw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

    driver.findElement(By.id("fname")).sendKeys("Niranjan");

    Thread.sleep(3000);
    driver.quit();
  }
}