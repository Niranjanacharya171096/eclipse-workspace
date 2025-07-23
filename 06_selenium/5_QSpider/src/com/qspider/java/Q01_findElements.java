package com.qspider.java;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01_findElements {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("E:\\eclipse-workspace\\06_selenium\\5_QSpider\\src\\HTML\\Page1.html");
    List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
    int count = allLinks.size();
    System.out.println("Total Number of links: "+count);
    //    WebElement link = allLinks.get(0);
    //    String text = link.getText();
    //    System.out.println(text);

    for(int i=0;i<allLinks.size();i++) {
      WebElement link = allLinks.get(i);
      String text = link.getText();
      //      String text = allLinks.get(i).getText();
      System.out.println(text);
    }
    //or
    for(WebElement link:allLinks) {
      System.out.print(link.getText() + " :: ");
      String url = link.getAttribute("href");
      System.out.println(url);
    }

    List<WebElement> allchkbox = driver.findElements(By.xpath("//input"));
    count = allchkbox.size();
    System.out.println("Total no. of checkboxes: "+count);
    //select all check boxes from top to bottom
    for(int i=0;i<count;i++) {
      WebElement chkbox = allchkbox.get(i);
      chkbox.click();
    }
    Thread.sleep(3000);

    //deselect all checkboxes from bottom to top
    for(int i=count-1;i>=0;i--) {
      allchkbox.get(i).click();
    }

    List<WebElement> allCells = driver.findElements(By.xpath("//td"));
    count=allCells.size();
    System.out.println("Total Number of Table Cells: "+count);

    int sum=0;
    int total=0;
    for(int i=0;i<count;i++) {
      String text = allCells.get(i).getText();
      System.out.println(text);
      if(StringUtils.isNumeric(text)) {
        System.out.println("Numbers :: " + text);
        int x = Integer.parseInt(text);
        total=total+x;
      }

      try {
        int x = Integer.parseInt(text);
        System.out.println(x); //prints only numbers
        sum=sum+x;
      } catch(NumberFormatException e) {
        System.out.println(text); //Prints only strings
      }
    }
    System.out.println("total is: "+total);
    System.out.println("Sum is: "+sum);

    Thread.sleep(3000);
    driver.close();
  }
}