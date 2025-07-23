package com.selenium.java;
//if xpath is dynamic
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P29_KeywordDriven_Framework {
  public static void main(String[] args) throws InterruptedException, IOException {
    FileInputStream fis = new FileInputStream("E:\\Software Files\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\com\\selenium\\properties\\keyworddriven.properties");
    Properties p = new Properties();
    p.load(fis);
    
    String usernamepath = p.getProperty("usernamepath");
    String passwordpath = p.getProperty("passwordpath");
    String loginpath = p.getProperty("loginpath");

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  
    driver.findElement(By.xpath(usernamepath)).sendKeys("Admin");
    driver.findElement(By.xpath(passwordpath)).sendKeys("admin123");
    driver.findElement(By.xpath(loginpath)).click();
    
    Thread.sleep(5000);
    driver.quit(); 
  }
}