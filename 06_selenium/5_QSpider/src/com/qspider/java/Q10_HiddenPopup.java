package com.qspider.java;

import java.time.Duration;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10_HiddenPopup {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver(); 
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("http://www.yatra.com/"); 
    driver.findElement(By.xpath("(//section[@class=\"calendarComponent\"])[1]")).click();
//    driver.findElement(By.xpath("//td[@title='Thursday, 27 July 2023']")).click();
    driver.findElement(By.xpath("//td[@class='depart-daybox']/preceding-sibling::td[1]")).click();

    Thread.sleep(3000);    
    driver.close();
  }
}