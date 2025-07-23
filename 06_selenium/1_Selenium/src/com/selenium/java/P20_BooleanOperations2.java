package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P20_BooleanOperations2 {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://www.shadi.com");
    Thread.sleep(5000);

    driver.findElement(By.linkText("Join Now")).click();

    WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
    if(firstname.isEnabled())
      System.out.println("firstname is enabled and can be writtern");
    else
      System.out.println("firstname is disabled and cannot be writtern");

    WebElement female = driver.findElement(By.xpath("(//label[text()='Female'])[1]"));

    if(female.isDisplayed())
      System.out.println("Female is Displayed as Gender");
    else
      System.out.println("Female is not Displayed as Gender");

    female = driver.findElement(By.xpath("(//label[text()='Female'])[2]"));

    if(female.isSelected())
      System.out.println("Female is Selected in Looking for");
    else
      System.out.println("Female is not Selected in Looking for");

    Thread.sleep(5000);
    driver.quit();
  }
}