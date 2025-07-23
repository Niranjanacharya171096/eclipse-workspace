package com.selenium.java;
//if input value is Dynamic
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P28_DataDriven_Framework {
  public static void main(String[] args) throws InterruptedException, IOException {
    FileInputStream fis = new FileInputStream("E:\\Software Files\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\com\\selenium\\properties\\datadriven.properties");
    Properties p = new Properties();
    p.load(fis);
    
    String url = p.getProperty("url");
    String username = p.getProperty("username");
    String password = p.getProperty("password");

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get(url);
  
    driver.findElement(By.name("username")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    
    Thread.sleep(5000);
    driver.quit(); 
  }
}