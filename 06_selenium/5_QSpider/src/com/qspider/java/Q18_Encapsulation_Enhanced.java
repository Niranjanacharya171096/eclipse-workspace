package com.qspider.java;

import java.time.Duration;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Q18_Encapsulation_Enhanced {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver(); 
    driver.get("https://practicetestautomation.com/practice-test-login/"); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    Q18_LoginPage l=new Q18_LoginPage(driver); 
    l.login("Admin12","admin1234");
    //if we don't refresh we get exception
    driver.navigate().refresh();
    l=new Q18_LoginPage(driver); 
    l.login("student","Password123");
  }
}