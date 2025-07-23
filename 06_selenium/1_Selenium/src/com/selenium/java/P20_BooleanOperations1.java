package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class P20_BooleanOperations1 {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("E:\\eclipse-workspace\\06_selenium\\1_Selenium\\src\\HTML\\login.html");
    Thread.sleep(5000);

    WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
    LoginButton(loginButton);

    WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));

    if (userName.isDisplayed())
      System.out.println("userName is Displayed");
    else
      System.out.println("userName is not Displayed");

    System.out.println("userName is Enabled? :: " + userName.isEnabled());
    //    userName.sendKeys("Mahesh"); //ElementNotInteractableException: as userName is disabled,
    //it can be achieved usingJavascript
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("arguments[0].value='Mahesh'", userName);

    loginButton.click();
    System.out.println("Clicked");

    WebElement termsCondition = driver.findElement(By.xpath("//input[@type='checkbox']"));
    TermsCondition(termsCondition);
    Thread.sleep(5000);

    termsCondition.click();
    TermsCondition(termsCondition);

    LoginButton(loginButton);

    Thread.sleep(5000);
    driver.quit();
  }

  public static void LoginButton(WebElement loginButton) {
    if (loginButton.isEnabled())
      System.out.println("loginButton is enabled and can be clicked");
    else
      System.out.println("loginButton is disabled and cannot be clicked");
  }

  public static void TermsCondition(WebElement termsCondition) {
    if (termsCondition.isSelected())
      System.out.println("termsCondition is Selected");
    else
      System.out.println("termsCondition is not Selected");
  }
}