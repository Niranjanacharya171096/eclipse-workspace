package com.hyrtutorials.java;

import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H19_JSExecutor_HighlightElements {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String url = "https://www.facebook.com/";
    driver.get(url);
   
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("document.getElementById('email').setAttribute('style', 'border:2px solid red; background:yellow')");
    Thread.sleep(3000);
//    jse.executeScript("document.getElementById('email').style.border='2px solid green'");
    jse.executeScript("document.getElementById('email').setAttribute('style', 'border:2px solid green')");
    Thread.sleep(3000);
    jse.executeScript("document.getElementById('email').setAttribute('style', 'background:blue')");
    Thread.sleep(3000);  
    WebElement element = driver.findElement(By.id("email"));
    jse.executeScript("arguments[0].setAttribute('style', 'border:2px solid orange; background:pink')", element);
    Thread.sleep(3000);
    jse.executeScript("document.getElementById('email').setAttribute('style', 'border:; background:')");
    Thread.sleep(3000);
    driver.quit(); 
  }
}
