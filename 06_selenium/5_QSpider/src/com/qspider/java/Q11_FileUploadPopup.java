package com.qspider.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q11_FileUploadPopup {
  public static void main(String[] args) throws InterruptedException, AWTException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://the-internet.herokuapp.com/upload");
    // 1. using sendKeys()
    // driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\NIRANJAN\\selenium.txt");

    Thread.sleep(5000);
    // 2. using Robot class
    // driver.findElement(By.id("file-upload")).click(); // getting InvalidArgumentException
    Actions actions = new Actions(driver);

    WebElement uploadPhotoBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));
    actions.moveToElement(uploadPhotoBtn).click().perform();

    // copy the path to clipboard
    StringSelection filePathSelection = new StringSelection("C:\\Users\\NIRANJAN\\selenium.txt");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection, null);

    Thread.sleep(3000);
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(3000);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);

    driver.findElement(By.id("file-submit")).submit();

    if (driver.getPageSource().contains("File Uploaded!"))
      System.out.println("file uploaded");
    else
      System.out.println("file not uploaded");

    Thread.sleep(5000);
    driver.close();
  }
}