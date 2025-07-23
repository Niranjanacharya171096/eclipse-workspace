package com.qspider.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Q16_JavaScript {
  public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();

    JavascriptExecutor jse = (JavascriptExecutor) driver;    
//or//    RemoteWebDriver rwd=(RemoteWebDriver) driver;
    jse.executeScript("alert('HELLO')"); //use rwd.
  }
}
