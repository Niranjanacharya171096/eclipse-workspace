package com.hyrtutorials.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class H17_JSExecutor_TextBox {
  public static void main(String[] args) throws InterruptedException {
    RemoteWebDriver driver = new ChromeDriver(); //WebDriver
    driver.manage().window().maximize();
    RemoteWebDriver jse = driver;
    //    String url = "https://www.facebook.com";
    //    driver.get(url);

    //    JavascriptExecutor jse = (JavascriptExecutor) driver;

    jse.executeScript("window.location = 'https://www.facebook.com'");

    String email = "document.getElementById('email').value='niranjan@gmail.com'";
    jse.executeScript(email);

    WebElement element = driver.findElement(By.id("pass"));
    jse.executeScript("arguments[0].value='123456'",element);

    String text = (String) jse.executeScript("return document.getElementById('email').value");
    System.out.println(text);

    String c="document.getElementById('email').value=''";
    jse.executeScript(c);

    //    Thread.sleep(3000);
    //    driver.quit();
  }
}
