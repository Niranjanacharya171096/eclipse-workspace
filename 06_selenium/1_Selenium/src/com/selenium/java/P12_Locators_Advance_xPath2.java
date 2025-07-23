package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class P12_Locators_Advance_xPath2 {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();

    driver.manage().window().maximize();

    driver.get("E:\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\HTML\\textbox2.html");

    WebElement un = driver.findElement(By.xpath("/html/body/input[1]")); //Absolute path
    un.sendKeys("admin");

    WebElement pwd = driver.findElement(By.xpath("//input[2]")); //Relative path
    pwd.sendKeys("admin123");

    Thread.sleep(5000);
    driver.close();
  }
}
