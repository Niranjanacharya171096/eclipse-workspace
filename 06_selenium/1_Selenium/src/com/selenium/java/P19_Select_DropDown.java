package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class P19_Select_DropDown {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();

    driver.navigate().to("https://www.shadi.com");
    driver.findElement(By.linkText("Join Now")).click();
    Thread.sleep(3000);

    //1. identify drop down using locator
    WebElement dropdown=driver.findElement(By.id("ddlEducation"));

    //2. create select class obj
    //3. pass the dropdown ref to Select class cons.
    Select sel = new Select(dropdown);

    /*4. use any one to select an option from drop down
     * selectByIndex();
     * selectByValue();
     * selectByVisibleText();
     */
    sel.selectByIndex(2);
    Thread.sleep(5000);
    sel.selectByIndex(2);

    sel.selectByValue("6");
    Thread.sleep(3000);

    sel.selectByVisibleText("Masters");

    Thread.sleep(3000);
    driver.close();
  }
}
