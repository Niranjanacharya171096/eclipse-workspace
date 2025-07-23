package com.qspider.java;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q14_WindowPopup_EX2 {
  public static void main(String[] args) throws IOException, InterruptedException, AWTException {

    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //    driver.get("https://nervgh.github.io/pages/angular-file-upload/examples/simple/");
    driver.get("https://the-internet.herokuapp.com/upload");
    Actions actions = new Actions(driver);

    WebElement uploadPhotoBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));
    actions.moveToElement(uploadPhotoBtn).click().perform();

    Thread.sleep(3000);
    //InvalidArgumentException
    //    WebElement upload = driver.findElement(By.xpath("(//input[@uploader='uploader'])[2]"));
    //    System.out.println(upload);
    //    upload.sendKeys(Keys.ENTER); //click();
    //    WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
    //    wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input)[2]"))).click();
    //    JavascriptExecutor jse = (JavascriptExecutor) driver;
    //    jse.executeScript("arguments[0].click();", upload);
    //    System.out.println(jse.executeScript("arguments[0].click();", upload));
    Runtime.getRuntime().exec("E:\\AutoIT scripts\\fileUploadScript.exe"); not working
    //    driver.quit();
  }
}
