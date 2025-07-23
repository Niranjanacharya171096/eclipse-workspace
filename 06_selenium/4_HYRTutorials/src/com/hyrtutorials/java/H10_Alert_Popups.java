package com.hyrtutorials.java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H10_Alert_Popups {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
    Thread.sleep(3000);

    // 1. Alert Box
    driver.findElement(By.id("alertBox")).click();
    Alert simpleAlert = driver.switchTo().alert();
    String text = simpleAlert.getText();
    System.out.println(text);
    Thread.sleep(3000); 
    simpleAlert.accept();

    //2. Confirm Box 
    driver.findElement(By.id("confirmBox")).click(); 
    Alert confirmAlert = driver.switchTo().alert(); 
    text = confirmAlert.getText();
    System.out.println(text); 
    Thread.sleep(3000); 
    confirmAlert.dismiss();

    //3. Prompt Box 
    driver.findElement(By.id("promptBox")).click(); 
    Alert promptAlert = driver.switchTo().alert();
    promptAlert.sendKeys("Hello Tester"); 
    Thread.sleep(3000);
    promptAlert.accept();

    Thread.sleep(3000); 
    driver.quit();
  }
}