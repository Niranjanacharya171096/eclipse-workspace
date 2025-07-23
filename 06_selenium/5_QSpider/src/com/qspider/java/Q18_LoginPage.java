package com.qspider.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Q18_LoginPage {
  private WebElement unTextBox; 
  private WebElement pwTextBox; 
  private WebElement loginButton; 
  public Q18_LoginPage(WebDriver driver) {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    unTextBox=driver.findElement(By.name("username")); 
    pwTextBox=driver.findElement(By.name("password")); 
    loginButton=driver.findElement(By.xpath("//button[text()='Submit']"));
  }
  public void login(String un, String pw) {
    unTextBox.sendKeys(un); 
    pwTextBox.sendKeys(pw); 
    loginButton.click();
  }
}