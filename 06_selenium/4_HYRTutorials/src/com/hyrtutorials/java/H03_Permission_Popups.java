package com.hyrtutorials.java;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class H03_Permission_Popups {
  public static void main(String[] args) throws InterruptedException {
    HashMap<String, Object> contentSettings = new HashMap<String, Object>();
    HashMap<String, Object> profile = new HashMap<String, Object>();
    HashMap<String, Object> prefs = new HashMap<String, Object>();

    // SET CHROME OPTIONS
    // 0 - Default, 1 - Allow, 2 - Block
    contentSettings.put("geolocation", 1);
    contentSettings.put("notifications", 2);
    profile.put("managed_default_content_settings", contentSettings);
    prefs.put("profile", profile);

    ChromeOptions coptions = new ChromeOptions();
    coptions.setExperimentalOption("prefs", prefs);

    // coptions.addArguments("--disable-geolocation");
    // coptions.addArguments("disable-notifications");
    // coptions.addArguments("disable-media-stream");

    WebDriver driver = new ChromeDriver(coptions);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); //default is 0s

    String url = "https://whatmylocation.com/";
    // https://www.cleartrip.com/
    // https://web-push-book.gauntface.com/d...
    // https://mictests.com/
    // https://webcamtests.com/

    driver.get(url);

    Thread.sleep(5000);
    driver.quit();
  }
}