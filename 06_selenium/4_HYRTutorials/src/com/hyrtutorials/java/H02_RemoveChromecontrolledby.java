package com.hyrtutorials.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class H02_RemoveChromecontrolledby {
  public static void main(String[] args) throws InterruptedException {
    ChromeOptions coptions = new ChromeOptions();
    //    coptions.setExperimentalOption("excludeSwitches", new String[] {"enable-autoation"});
    //    coptions.setExperimentalOption("excludeSwitches", Arrays.asList("enable-autoation"));
    //    coptions.setExperimentalOption("excludeSwitches", Collections.singleton("enable-autoation"));
    //    coptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-autoation"));

    List<String> eSwitches = new ArrayList<String>();
    eSwitches.add("enable-automation");
    coptions.setExperimentalOption("excludeSwitches", eSwitches);

    WebDriver driver = new ChromeDriver(coptions);
    driver.manage().window().maximize();

    String url = "https://www.google.com";
    driver.get(url);

    Thread.sleep(5000);
    driver.quit();
  }
}
