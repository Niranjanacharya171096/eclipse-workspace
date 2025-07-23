package com.hyrtutorials.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class H16_JSExecutor_ScrollOperations {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();

    String url = "https://www.hyrtutorials.com/";
    driver.get(url);

    JavascriptExecutor jse = (JavascriptExecutor) driver;

    jse.executeScript("window.scrollBy(0,1500)");
    System.out.println("window.scrollBy(0,1500)");
    Thread.sleep(3000);

    jse.executeScript("window.scrollTo(0,1000)");
    System.out.println("window.scrollTo(0,1000)");
    Thread.sleep(3000);

    jse.executeScript("window.scrollBy(0,-500)");
    System.out.println("window.scrollBy(0,-500)");
    Thread.sleep(3000);

    jse.executeScript("window.scrollTo(0,200)");
    System.out.println("window.scrollTo(0,200)");
    Thread.sleep(3000);

    jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    System.out.println("window.scrollTo(0,document.body.scrollHeight)");
    Thread.sleep(3000);

    WebElement element = driver.findElement(By.xpath("//a[text()='Java Tutorials']"));
    int x = element.getLocation().x;
    int y = element.getLocation().y;
    jse.executeScript("window.scrollTo(arguments[0],arguments[1])", x, y);
    System.out.println("window.scrollTo(arguments[0],arguments[1]))");
    Thread.sleep(3000);

    jse.executeScript("arguments[0].scrollIntoView()", element);
    System.out.println("arguments[0].scrollIntoView()");

    Thread.sleep(3000);
    driver.quit();
  }
}