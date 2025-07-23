package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class P11_Locators_Advance_xPath1 {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();

    driver.manage().window().maximize();

    driver.get("E:\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\HTML\\textbox1.html");

    WebElement a = driver.findElement(By.xpath("/html/body/div[1]/input[1]")); //Absolute path
    a.sendKeys("AAAA");

    WebElement b = driver.findElement(By.xpath("//input[2]")); //Relative path
    b.sendKeys("BBBB");

    WebElement c = driver.findElement(By.xpath("//div[2]/input[1]")); //Relative path
    c.sendKeys("CCCC");

    WebElement d = driver.findElement(By.xpath("//div[2]/input[2]")); //Relative path
    d.sendKeys("DDDD");

    Thread.sleep(10000);
    driver.close();

  }
}
