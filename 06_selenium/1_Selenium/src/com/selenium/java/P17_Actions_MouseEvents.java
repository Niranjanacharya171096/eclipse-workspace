package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P17_Actions_MouseEvents {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.amazon.in");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    Actions actions = new Actions(driver);

    WebElement ele = driver.findElement(By.xpath("//span[text()='Smart choices for smart living | Shop Now']"));
    actions.scrollToElement(ele).perform();
    Thread.sleep(5000);

    actions.scrollByAmount(0, 300).perform();
    Thread.sleep(5000);
    ScrollOrigin scrollOrigin = ScrollOrigin.fromElement(ele);
    actions.scrollFromOrigin(scrollOrigin, 0, 1000).perform();

    WebElement acList = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
    actions.moveToElement(acList).perform(); //build() compiles Action class code and perform() executes it

    WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(30));
    WebElement yourAC = wdw.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Your Account']"))));
    actions.moveToElement(yourAC).click().build().perform();
    //or
    //    yourAC.click();

    Thread.sleep(5000);
    driver.quit();
  }
}