package com.qspider.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q04_Select_Dropdown {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();
    driver.get("E:\\eclipse-workspace\\06_selenium\\5_QSpider\\src\\HTML\\Dropdown.html");

    WebElement listBox = driver.findElement(By.name("country"));

    Select sel = new Select(listBox);
    List<WebElement> allOptions = sel.getOptions();
    //Q50
    System.out.println("Enter option to search:");
    Scanner sc = new Scanner(System.in);
    String eText = sc.next();
    int found=0;

    for(int i=0;i<allOptions.size();i++) { //for(WebElement option:allOptions) {
      String atext = allOptions.get(i).getText(); // = option.getText();
      if(atext.equalsIgnoreCase(eText)) found++;
    }
    if(found==0) System.out.println(eText+" is not found"); //No matching
    else if(found==1) System.out.println(eText+" is found"); //matching found
    else System.out.println(eText+ " is duplicate.");
    //Q51
    ArrayList<String> allText = new ArrayList<String>();
    for(int i=0;i<allOptions.size();i++) {
      String text = allOptions.get(i).getText();
      allText.add(text);
    }
    Collections.sort(allText);
    System.out.println("\nSorted ListBox :: ");
    for(String text:allText)
      System.out.println(text);
    //Q52
    //    HashSet<String> allValues = new HashSet<String>();
    TreeSet<String> allValues = new TreeSet<String>();
    boolean flag = false;
    for(int i=0;i<allOptions.size();i++) {
      String text = allOptions.get(i).getText();
      if(!allValues.add(text)) {//==false) {
        //returns false if text is already in the HashSet/TreeSet
        System.out.println("\n"+text+" is duplicate");
        flag = true;
      }
    }
    if(flag) System.out.println("list box has duplicate values");
    else System.out.println("list box has duplicate values");
    //Q53
    System.out.println("\nPrint unique :: "+allValues);
    for(Object obj:allValues)
      System.out.println(obj);
    //Q54
    HashMap<String, Integer> hashMapObj = new HashMap<String, Integer>();
    for(WebElement option:allOptions) {
      String text = option.getText();
      if (hashMapObj.containsKey(text)) {
        Integer value = hashMapObj.get(text);
        value++;
        hashMapObj.put(text, value);
      }else{
        hashMapObj.put(text, 1);
      }
    }
    System.out.println(hashMapObj);
    Set<String> allKeys = hashMapObj.keySet();
    for (String key: allKeys) {
      Integer value = hashMapObj.get(key);
      System.out.println(key +" -->"+ value);
      if (value>1) {
        System.out.println("Occurance of " + key + " is:" + value);
      }
    }

    //Q47
    List<WebElement> alllistBox = driver.findElements(By.name("country"));
    System.out.println("\nhow many list box? :: "+alllistBox.size());//2
    int count = 1;
    for(WebElement listbox : alllistBox) {
      System.out.println("LIST BOX :: " + count);
      sel=new Select(listbox);
      //Q46
      boolean isMultiple = sel.isMultiple();
      //returns true if listbox is multi-select else false - if listbox is single select
      System.out.println("\nisMultiple :: "+isMultiple);
      //Q48
      List<WebElement> countries = sel.getOptions();
      System.out.println("Countries Available :: ");
      for(WebElement we : countries)
        System.out.println(we.getText());

      //selects specific option
      sel.selectByVisibleText("United Kingdom");
      Thread.sleep(3000);
      sel.selectByIndex(3);
      Thread.sleep(3000);
      sel.selectByValue("CAN");
      Thread.sleep(3000);
      //Q49
      List<WebElement> countrySelected = sel.getAllSelectedOptions();
      System.out.println("Country Selected :: ");
      for(WebElement we : countrySelected)
        System.out.println(we.getText());

      System.out.println("First Course selected:: "+sel.getFirstSelectedOption().getText());

      if(isMultiple) {
        //sel.deselectAll() deselect all options only for multiselect listbox
        sel.deselectByVisibleText("United Kingdom");
        sel.deselectByIndex(3);
        sel.deselectByValue("CAN");
      }
    }
    driver.close();
  }
}
