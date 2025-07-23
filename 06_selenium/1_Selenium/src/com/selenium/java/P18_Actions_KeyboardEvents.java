package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P18_Actions_KeyboardEvents {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.google.com/");

    WebElement search = driver.findElement(By.name("q"));

    //without Actions(C)
    search.sendKeys(Keys.SHIFT+"Selenium");
    Thread.sleep(3000);
    //    search.submit(); //UnsupportedOperationException if we can't do submit Operation

    Actions actions = new Actions(driver);
    //    actions.moveToElement(search).click();
    //    actions.keyDown(Keys.SHIFT).sendKeys("bjshub").pause(2000);
    //    actions.keyUp(Keys.SHIFT).sendKeys(Keys.ENTER); //.keyDown(Keys.ENTER)
    //    actions.build().perform();

    actions.moveToElement(search).click().keyDown(Keys.SHIFT)
    .sendKeys("bjshub").pause(2000)
    .keyUp(Keys.SHIFT).sendKeys(Keys.ENTER)
    .build().perform();

    Thread.sleep(5000);
    driver.quit();
  }
}