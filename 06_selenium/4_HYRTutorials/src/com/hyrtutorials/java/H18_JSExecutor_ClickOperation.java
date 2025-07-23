package com.hyrtutorials.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class H18_JSExecutor_ClickOperation {
  public static void main(String[] args) throws InterruptedException {
    //    WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();

    String url = "https://www.hyrtutorials.com/p/basic-controls.html";
    driver.get(url);

    JavascriptExecutor jse = (JavascriptExecutor) driver;
    String female = "document.getElementById('femalerb').click()";
    System.out.println(jse.executeScript(female));

    Thread.sleep(5000);

    WebElement male = driver.findElement(By.id("malerb"));
    System.out.println(jse.executeScript("arguments[0].click()", male));

    String checkBoxElements = "return document.getElementsByName('language')";
    List checkboxes= (List) jse.executeScript(checkBoxElements);
    for(Object obj : checkboxes) {
      jse.executeScript("arguments[0].click()", obj);
    }
    jse.executeScript("document.getElementById('registerbtn').click()");

    Thread.sleep(5000);

    WebElement link = driver.findElement(By.xpath("//a[text()='Click here to navigate to the home page']"));
    jse.executeScript("arguments[0].click()", link);

    Thread.sleep(5000);
    driver.quit();
  }
}
