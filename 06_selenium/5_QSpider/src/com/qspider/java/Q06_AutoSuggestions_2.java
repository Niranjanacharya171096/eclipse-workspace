package com.qspider.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q06_AutoSuggestions_2 {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.redbus.in/");

    WebElement textbox = driver.findElement(By.id("src"));
    textbox.clear();
    textbox.sendKeys("Bang");
    Thread.sleep(2000);

    List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li//text[@class='placeHolderMainText']"));
    int count = allOptions.size();
    System.out.println("No. of autosuggestions :: " + count);
    System.out.println("List of autosuggstions :: ");
    for (int i = 0; i < count; i++) {
      String text = allOptions.get(i).getText();
      System.out.println(text);
    }
    try {
      textbox.sendKeys(Keys.ARROW_DOWN);
      textbox.sendKeys(Keys.ENTER);
    } catch (Exception e) {
      System.out.println(e);
    }

    Thread.sleep(3000);
    driver.close();
  }
}
