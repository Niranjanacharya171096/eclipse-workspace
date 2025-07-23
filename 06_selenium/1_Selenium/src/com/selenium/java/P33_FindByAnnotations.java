package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P33_FindByAnnotations {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("E:\\Software Files\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\HTML\\startstop.html");

    P33_StartStop h = new P33_StartStop(driver);
    h.onClickStart();
    Thread.sleep(1000);
    h.onClickStop();
    Thread.sleep(5000);
    h.onClickReset();
  }
}