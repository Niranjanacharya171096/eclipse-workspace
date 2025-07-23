package com.selenium.java;

import java.time.Duration; 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P24_Frames_EX2 {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    driver.get("E:\\Software Files\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\HTML\\MiddleName.html");

//    driver.switchTo().frame(0); // only 1 frame and index starts from 0
//    driver.switchTo().frame("newname");
    WebElement xpath = driver.findElement(By.xpath("//iframe[@name='newname1']"));
    driver.switchTo().frame(xpath);

    driver.findElement(By.id("fname")).sendKeys("Niranjan");
    Thread.sleep(3000);

    driver.switchTo().parentFrame();//or
//      driver.switchTo().defaultContent();
    driver.findElement(By.id("mname")).sendKeys("Acharya");

    Thread.sleep(3000);
    driver.quit(); 
  }
}
