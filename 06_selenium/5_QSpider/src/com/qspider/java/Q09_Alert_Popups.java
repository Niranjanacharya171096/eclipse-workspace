package com.qspider.java;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q09_Alert_Popups {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://demo.guru99.com/test/delete_customer.php");

    driver.findElement(By.name("cusid")).sendKeys("53920");
    driver.findElement(By.name("submit")).submit();

    // Switching to Alert
    Alert alert = driver.switchTo().alert();

    // Capturing alert message.
    String alertMessage= alert.getText();

    // Displaying alert message
    System.out.println(alertMessage);
    Thread.sleep(5000);

    // Accepting alert
    alert.accept();

    //after alert is closed control will be transferred back to page
    //    alert.dismiss(); // we get NoAlertPresentException

    Thread.sleep(3000);
    driver.close();
  }
}