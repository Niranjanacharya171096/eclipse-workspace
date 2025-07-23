package com.selenium.java;

import org.openqa.selenium.edge.EdgeDriver;

public class P03_Driver_GetOperations {
  public static void main(String[] args) throws InterruptedException {
    EdgeDriver edriver = new EdgeDriver();

    edriver.manage().window().maximize();

    //oper Gmail
    edriver.get("https:\\www.gmail.com");

    String currentUrl = edriver.getCurrentUrl();
    System.out.println("currentUrl :: "+currentUrl);

    String expectedtitle = "Gmail";
    String actualtitle = edriver.getTitle();
    System.out.println("actualtitle :: "+actualtitle);

    if (expectedtitle.equalsIgnoreCase(actualtitle)) {
      System.out.println("Same");
    } else {
      System.out.println("Not Same");
    }

    // Gmail Page source
    String pageSource = edriver.getPageSource();
    System.out.println(pageSource);

    //keep it open for 5s
    Thread.sleep(5000);

    //close the browser
    edriver.close();
  }
}