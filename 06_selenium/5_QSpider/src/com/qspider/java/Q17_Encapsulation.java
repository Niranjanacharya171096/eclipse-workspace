package com.qspider.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q17_Encapsulation {
  public static void main(String[] args) {
    WebDriver driver=new ChromeDriver(); 
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
    Q17_LoginPage l=new Q17_LoginPage(driver); 
    l.setUserName();
  }
}
