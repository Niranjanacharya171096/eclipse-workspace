package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P21_Alert_Popups {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    driver.get("https://www.echoecho.com/javascript4.htm");
    Thread.sleep(3000);

    // 1. Alert Box
    driver.findElement(By.xpath("//input[@value='alert box']")).click();

    Alert alert1 = driver.switchTo().alert();
    //    System.out.println(driver.switchTo().activeElement());
    Thread.sleep(3000);

    //1. using Explicit wait:
    //    WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(60));
    //    Alert alert1 = wdw.until(ExpectedConditions.alertIsPresent());

    //2. using JavascriptExecutor(I)
    //    JavascriptExecutor jse = (JavascriptExecutor) driver;
    //    try {
    //      jse.executeScript("window.alert=function{};"); //to close
    //    } catch(Exception e) {    }

    alert1.accept();
    Thread.sleep(3000);

    // 2. Confirm Box
    driver.findElement(By.xpath("//input[@value='confirm box']")).click();

    Alert alert2 = driver.switchTo().alert();
    Thread.sleep(3000);

    alert2.dismiss();
    Thread.sleep(3000);

    // 3. Prompt Box
    driver.findElement(By.xpath("//input[@value='prompt box']")).click();

    Alert alert3 = driver.switchTo().alert();
    alert3.sendKeys("NIRANJAN");
    Thread.sleep(3000);

    alert3.accept();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[contains(text(), 'READ MORE')]")).click();
    Thread.sleep(3000);

    driver.quit();
  }
}