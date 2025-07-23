package com.qa.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeFailedScreenshot {
  public static String screenshotsSubFolderName;

  public static String captureScreenshot(WebDriver driver, String fileName) throws InterruptedException {
    if(screenshotsSubFolderName == null) {
      LocalDateTime myDateObj = LocalDateTime.now();
      DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
      screenshotsSubFolderName = myDateObj.format(myFormatObj);
    }
    Thread.sleep(5000);

    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
    File destFile = new File("./failedScreenshot/"+ screenshotsSubFolderName+"/"+fileName);
    try {
      FileUtils.copyFile(sourceFile, destFile);
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Screenshot saved successfully");
    return destFile.getAbsolutePath();
  }
}
