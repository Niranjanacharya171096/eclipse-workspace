package com.selenium.maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.P46_Home;
import pages.P46_Login;

public class P46_PageFactoryModel_Test {
  @Test
  public void positiveCredential() throws InterruptedException{
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    P46_Login l = new P46_Login(driver);
    l.onClickUsername();
    l.onClickPassword();
    l.onClickLogin();

    P46_Home h = new P46_Home(driver);
    h.onClickOrangeHRMLink();

    Thread.sleep(5000);
    driver.quit();
  }
}