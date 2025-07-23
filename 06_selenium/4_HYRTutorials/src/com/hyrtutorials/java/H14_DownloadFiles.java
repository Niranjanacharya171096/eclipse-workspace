package com.hyrtutorials.java;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class H14_DownloadFiles {
  public static void main(String[] args) throws InterruptedException {
    String fileType = "PDF";
    String downloadPath = "E:\\Software Files\\eclipse-workspace\\06_selenium\\4_HYRTutorials\\DownloadedFiles";

    // for chrome and edge Options are same but not for FireFox
    //    EdgeOptions options = new EdgeOptions();
    //    HashMap<String, Object> prefs = new HashMap<String, Object>();
    //    prefs.put("plugins.always_open_pdf_externally", true);
    //    prefs.put("download.default_directory", downloadPath);
    //    options.setExperimentalOption("prefs", prefs);
    //
    //    // WebDriverManager.edgedriver().setup();
    //    WebDriver driver = new EdgeDriver(options);

    //Firefox
    //    WebDriverManager.firefoxdriver().setup();
    FirefoxOptions options = new FirefoxOptions();
    FirefoxProfile profile = new FirefoxProfile();
    profile.setPreference("pdfjs.disabled", true);
    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf,application/doc,application/ms-doc,application/msword,application/vnd.openxmlformats-officedocument.wordprocessingml.document");
    profile.setPreference("browser.download.dir", downloadPath);
    profile.setPreference("browser.download.folderList", 2);
    options.setProfile(profile);
    WebDriver driver = new FirefoxDriver(options);

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    String url = "https://file-examples.com/";//index.php/sample-documents-download/sample-pdf-download/";
    driver.get(url);
    Thread.sleep(5000);

    driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();

    // ad handler
    //    WebElement element1 = driver.findElement(By.xpath("/html/ins/div/iframe[contains(@name,'aswift')]"));
    //    driver.switchTo().frame(element1);
    //
    //    WebElement element2 = driver.findElement(By.xpath("//iframe[@id='ad_iframe']"));
    //    driver.switchTo().frame(element2);
    //    driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();

    // List<WebElement> element3 = driver.findElements(By.xpath("//div[@id='dismiss-button']"));
    // System.out.println(element3.size());
    // if(element3.size() > 0) {
    // System.out.println("X");
    // ((WebElement) element3).click();
    // } else {
    // System.out.println("close");
    // driver.findElement(By.xpath("//span[text()='Close']")).click();
    // }
    //
    // System.out.println("ad closed");

    //    driver.switchTo().defaultContent();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//td[text()='" + fileType + "']/following-sibling::td[2]/a")).click();
    System.out.println("PDF");
    driver.findElement(By.xpath("//td[contains(text(),'150')][contains(text(),'kB')]//following-sibling::td[4]/a")).click();
    System.out.println("Downloaded");
    Thread.sleep(5000);

    //check if file got downloaded
    String fileName = "file-sample_150kB.pdf";

    File downloadedFile = new File(downloadPath + File.separator + fileName);
    System.out.println(downloadedFile + " " + downloadedFile.exists());
    if (downloadedFile.exists()) {
      System.out.println("File downloaded successfully!");
    } else {
      System.out.println("File not found. Download might have failed.");
    }

    Thread.sleep(5000);
    driver.quit();
  }
}