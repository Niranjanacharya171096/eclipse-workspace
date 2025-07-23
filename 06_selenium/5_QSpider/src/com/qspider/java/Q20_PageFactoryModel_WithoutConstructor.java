package com.qspider.java;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Q20_PageFactoryModel_WithoutConstructor {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/"); 
    
    Q20_LoginPage l=new Q20_LoginPage(); 
    PageFactory.initElements(driver, l);

    l.login("admin","manager");
  }
}