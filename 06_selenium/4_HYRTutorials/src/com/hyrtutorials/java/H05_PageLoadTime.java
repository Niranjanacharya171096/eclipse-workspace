package com.hyrtutorials.java;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H05_PageLoadTime {
  public static void main(String[] args) throws IOException, InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    //TimeoutException if duration is 20
    try {
      String url = "https://www.hyrtutorials.com/p/frames-practice.html";
      driver.get(url);
    } catch (Exception e) {
      System.out.println(e);
    }
    Thread.sleep(5000);
    driver.close();
  }
}