package com.qspider.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q05_AutoSuggestions_1 {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.google.com");

    driver.findElement(By.id("APjFqb")).sendKeys("selenium");
    Thread.sleep(5000);

    String xp="//div[contains(@class,'wM6W7d')]/span[contains(text(),'selenium')]";
    List<WebElement> allAutoSuggestions = driver.findElements(By.xpath(xp));
    int count=allAutoSuggestions.size();
    System.out.println("No of autosuggesions:"+count);

    System.out.println("\nList of Autosuggestions..");
    int position=0;
    for(int i=0;i<count;i++){
      WebElement suggestion = allAutoSuggestions.get(i);
      String text=suggestion.getText();
      System.out.println(text);
      if(text.equalsIgnoreCase("selenium ide for chrome"))
        position=i; // suggestion.click(); break;
    }
    allAutoSuggestions.get(position).click();

    Thread.sleep(3000);
    driver.close();
  }
}
