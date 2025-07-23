package com.hyrtutorials.java;

import java.io.File; 
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class H13_StoreScreenshot_FileHandler {
  public static void CaptureScreenshot(WebDriver driver, String fileName) throws IOException {
//    TakesScreenshot screenShot = (TakesScreenshot) driver;
    File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(file, new File("./Screenshot/"+fileName));
  }
}
