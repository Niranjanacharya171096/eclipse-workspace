package com.hyrtutorials.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class H06_Select_DropDown {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();

    driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
    Thread.sleep(3000);

    WebElement dropdown=driver.findElement(By.id("ide")); //multi-select

    Select sel = new Select(dropdown);

    sel.selectByIndex(0);
    Thread.sleep(3000);
    //    sel.selectByIndex(0); //if we try to reselect, doesn't deselect
    Thread.sleep(3000);

    sel.selectByValue("vs");
    Thread.sleep(3000);

    sel.selectByVisibleText("NetBeans");
    Thread.sleep(3000);

    List<WebElement> courseAvailable= sel.getOptions();
    System.out.println("courses Available::");
    for(WebElement we : courseAvailable )
      System.out.println(we.getText());

    List<WebElement> courseSelected= sel.getAllSelectedOptions();
    System.out.println("courses Selected::");
    for(WebElement we : courseSelected )
      System.out.println(we.getText());

    System.out.println("First Course selected:: "+sel.getFirstSelectedOption().getText());

    sel.deselectByIndex(0);
    Thread.sleep(3000);

    sel.deselectByValue("vs");
    sel.deselectByVisibleText("NetBeans");

    Thread.sleep(3000);
    driver.close();
  }
}
