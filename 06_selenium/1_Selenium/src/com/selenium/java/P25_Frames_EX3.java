package com.selenium.java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P25_Frames_EX3 {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("E:\\Software Files\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\HTML\\LastName.html");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    List<WebElement> countFrames = driver.findElements(By.tagName("iframe"));
    int size = countFrames.size();
    System.out.println(size); //2

    WebElement xpath = driver.findElement(By.xpath("//iframe[@name='newname1']"));
    driver.switchTo().frame(xpath);
    driver.findElement(By.name("fname")).sendKeys("FIRSTNAME");
    Thread.sleep(5000);

    driver.switchTo().defaultContent();

    xpath = driver.findElement(By.xpath("//iframe[@name='newname2']"));
    driver.switchTo().frame(xpath);
    driver.findElement(By.id("mname")).sendKeys("MIDDLENAME");
    xpath = driver.findElement(By.xpath("//iframe[@name='newname1']"));
    driver.switchTo().frame(xpath);
    driver.findElement(By.name("fname")).sendKeys("FIRSTNAME 2");

    //  driver.switchTo().parentFrame(); //goes to MiddleNam.html
    //  driver.switchTo().parentFrame(); //goes to LastName.html
    //or
    driver.switchTo().defaultContent(); //goes to LastName.html
    //  driver.navigate().refresh(); //clears all previous data and driver switch to main page
    driver.findElement(By.name("lname")).sendKeys("LASTNAME");

    //    Thread.sleep(3000);
    //    driver.quit();
  }
}