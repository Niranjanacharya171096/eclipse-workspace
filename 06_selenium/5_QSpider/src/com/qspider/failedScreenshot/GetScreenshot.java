package com.qspider.failedScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshot extends MainTest {
  public static String capture(String screenshotName) throws IOException {
    System.out.println("GetScreenshot");

    File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File d = new File("./com.qspider.failedScreenshot/image1.png");
//    FileUtils.copyFile(s, d);
    FileHandler.copy(s, d);

    return screenshotName;
  }
}
