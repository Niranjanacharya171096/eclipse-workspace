package com.qspider.java;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q15_WindowPopup_EX2 {
  public static void main(String[] args) throws IOException, InterruptedException {
    WebDriver driver=new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("http://docs.seleniumhq.org/download/");
    WebElement rel=driver.findElement(By.xpath("//a[text()='releases']"));

    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", rel);
    driver.findElement(By.xpath("//span[text()='Selenium 4.10.0']")).click();
    Thread.sleep(5000);

    driver.findElement(By.xpath("//a[text()='IEDriverServer_Win32_4.10.0.zip']")).click();
    //in Settings > Downloads > enable: Ask where to save each file before downloading
    Thread.sleep(5000);
    Runtime.getRuntime().exec("E:\\AutoIT scripts\\script2.exe");
  }
}