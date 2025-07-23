package com.qspider.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12_FileDownloadPopup {
  public static void main(String[] args) throws InterruptedException {
    //    FirefoxProfile profile=new FirefoxProfile();
    //    //    if file is .zip never display popup download it directly
    //    String key="browser.helperApps.neverAsk.saveToDisk";
    //    String value="application/zip";
    //    profile.setPreference(key,value);
    //    //    open firefox with above setting
    //
    //    FirefoxOptions options = new FirefoxOptions();
    //    options.setProfile(profile);
    //    WebDriver driver=new FirefoxDriver(options);

    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

    driver.get("http://docs.seleniumhq.org/download/");

    //    driver.findElement(By.xpath("(//p[text()='Java']/../p)[2]/a")).click(); //ElementClickInterceptedException
    WebElement javaEle = driver.findElement(By.xpath("(//p[text()='Java']/../p)[2]/a"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", javaEle);

    Thread.sleep(5000);
    driver.close();
  }
}