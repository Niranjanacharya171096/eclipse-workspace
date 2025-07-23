package com.qspider.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q21_PageFactoryModel_ListElements {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.hyrtutorials.com/p/basic-controls.html"); 
    
    Q21_ListElements l=new Q21_ListElements(driver); 
    l.selectAllChkBox();
    //deselects all l.selectAllChkBox();
  }
}
