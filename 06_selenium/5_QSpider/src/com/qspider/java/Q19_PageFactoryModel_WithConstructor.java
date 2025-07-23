package com.qspider.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q19_PageFactoryModel_WithConstructor {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/"); 
    
    Q19_LoginPage l=new Q19_LoginPage(driver); 
    l.login("abc","xyz"); 
    Thread.sleep(3000); 
    l.login("admin","manager");
  }
}