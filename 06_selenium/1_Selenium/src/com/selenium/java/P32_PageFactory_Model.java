package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P32_PageFactory_Model {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    P32_Login l = new P32_Login(driver);
    l.onClickUsername();
    l.onClickPassword();
    l.onClickLogin();
    
    P32_Home h = new P32_Home(driver);
    h.onClickOrangeHRMLink();

    Thread.sleep(5000);
    driver.quit(); 
  }
}