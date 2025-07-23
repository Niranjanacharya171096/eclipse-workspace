package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09_Locators_Basic {
  public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://www.facebook.com");
    
    By b=By.id("email"); 
    WebElement email = driver.findElement(b);
    email.sendKeys("sayeed@gmail.com");
    Thread.sleep(3000);

    driver.findElement(By.name("email")).sendKeys("9916044351");
    Thread.sleep(3000);

    //for email, class=inputtext _55r1 _6luy. use only first word
    driver.findElement(By.className("inputtext")).sendKeys("niranjan@gmail.com");
    //for password, class=inputtext _55r1 _6luy _9npi --> ambiguity
    Thread.sleep(3000);

    driver.findElement(By.linkText("Forgotten password?")).click();
    Thread.sleep(3000);
    driver.findElement(By.tagName("input")).sendKeys("8073357023"); //searched first input
    Thread.sleep(3000);
    driver.findElement(By.partialLinkText("For")).click(); //Forgotten account?
    
    Thread.sleep(3000);
    driver.quit();
  }
}
