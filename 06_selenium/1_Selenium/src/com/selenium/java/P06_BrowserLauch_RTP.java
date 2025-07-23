package com.selenium.java;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P06_BrowserLauch_RTP {
  public static void main(String[] args) {
    System.out.println("Enter the Browser name:");
    Scanner sc = new Scanner(System.in);
    String browser = sc.next();
    //we can use
    WebDriver driver;
    if (browser.equalsIgnoreCase("Chrome")) {
      driver = new ChromeDriver();
      test(driver);
      // ChromeDriver cdriver = new ChromeDriver(); test(cdriver);
    } else {
      driver = new EdgeDriver();
      test(driver);
      // EdgeDriver edriver=new EdgeDriver(); test(edriver);
    }
  }

  private static void test(WebDriver driver) {
    driver.get("https://www.gmail.com");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
  }
}
