package com.qspider.java;
//Q21_PageFactoryModel_ListElements
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q21_ListElements {
  @FindBy(xpath="//input[@class='bcCheckBox']")
  private List<WebElement> allChkBox;
  
  public Q21_ListElements(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }
  
  public void selectAllChkBox() {
    int count=allChkBox.size();
    for(int i=0;i<count;i++)
      allChkBox.get(i).click();
  }
}