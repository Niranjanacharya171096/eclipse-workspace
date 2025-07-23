package com.selenium.java;

import org.openqa.selenium.edge.EdgeDriver;

public class P01_MSEdgelaunch {
  public static void main(String[] args) {
    //    System.setProperty("webdriver.msedgedriver.driver", "E:\\selenium jar\\msedgedriver.exe");
    EdgeDriver edriver = new EdgeDriver();
    edriver.get("https://www.google.com/"); // as soon as it opens, the cursor will be in Search box

    edriver.switchTo().activeElement().sendKeys("admin@gmail.com");
    edriver.close();
    edriver.quit();
    System.out.println("end");
  }
}
