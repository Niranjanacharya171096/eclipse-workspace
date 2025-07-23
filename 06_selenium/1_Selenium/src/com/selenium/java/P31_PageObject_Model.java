package com.selenium.java;

import java.time.Duration; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P31_PageObject_Model {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    P31_Login l = new P31_Login(driver);
    l.onClickUsername();
    l.onClickPassword();
    l.onClickLogin();
    
    P31_Home h = new P31_Home(driver);
    h.onClickOrangeHRMLink();

    Thread.sleep(5000);
    driver.quit(); 
  }
}