package com.selenium.java;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P07_BrowserOperations {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();

    //maximize the window
    driver.manage().window().maximize();
    Thread.sleep(5000);

    //delete all cookies
    driver.manage().deleteAllCookies();

    //Resize the browser
    Dimension dim = driver.manage().window().getSize();
    System.out.println(dim.width + " " + dim.height);

    Dimension newDim = new Dimension(dim.width/2, dim.height/2);
    System.out.println(newDim.width + " " + newDim.height);

    driver.manage().window().setSize(newDim);

    Thread.sleep(3000);

    //Move the browser
    Point pt = new Point(300, 200);
    driver.manage().window().setPosition(pt);
    Thread.sleep(3000);

    //keep it open for 5s
    Thread.sleep(5000);

    //close the browser
    driver.close();
  }
}