package com.qspider.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q08_BasicControls {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver(); 
    driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
//Q59
    WebElement fn=driver.findElement(By.id("firstName"));
    String printText=fn.getAttribute("name"); 
    System.out.println(printText);
//Q60    
    fn.sendKeys("Niranjan");
    System.out.println(fn.getAttribute("value"));
    fn.clear();
    fn.sendKeys("Sayeed");
//Q61
    Thread.sleep(3000);    
    fn.sendKeys(Keys.CONTROL+"a");
    fn.sendKeys(Keys.DELETE);
//Q62
    fn.sendKeys("Niranjan Acharya");
    String st=fn.getAttribute("value");
    int count=st.length(); 
    for(int i=1;i<=count;i++) 
      fn.sendKeys(Keys.BACK_SPACE);
//Q63
    fn=driver.findElement(By.id("firstName"));
    fn.sendKeys("Sayeedulla Khan S");
    fn.sendKeys(Keys.CONTROL+"a"); 
    fn.sendKeys(Keys.CONTROL+"c");
    WebElement ln=driver.findElement(By.id("lastName")); 
    ln.clear();
    ln.sendKeys(Keys.CONTROL+"v");
//Q64
    WebElement link=driver.findElement(By.xpath("//a[@id='navigateHome']"));
    String text = link.getText(); 
    System.out.println(text);
//Q65
    Point p1=fn.getLocation();
    int x1=p1.getX();
    System.out.println("X of FirstName (in pixels) :: "+x1); 
    System.out.println("Y of FirstName (in pixels) :: "+p1.getY());
//Q66
    Point p2=ln.getLocation();
    int x2=p2.getX();
    System.out.println("X value of LastName textbox :: "+x2);
    System.out.println("Y value of LastName textbox :: "+p2.getY());

    if(x2-x1<=0)
      System.out.println("FirstName and LastName textbox aligned horizontally");
    else
      System.out.println("Not alligned Horizontally");
//Q67
    Dimension dim1 = fn.getSize();
    int w1 = dim1.getWidth();
    int h1 = dim1.getHeight();
    System.out.println("Width of the FirstName textbox :: "+w1);
    System.out.println("Height of the FirstName textbox :: "+h1); 
//Q68
    Dimension dim2=ln.getSize();
    int w2=dim2.getWidth();
    int h2 = dim2.getHeight();
    System.out.println("Width of the LastName textbox :: "+w2);
    System.out.println("Height of the LastName textbox :: "+h2); 
    if(w1==w2)
      System.out.println("Width of FirstName textbox and LastName textbox is same");
    else 
      System.out.println("Width of email textbox & LastName textbox is not same");
//Q69
    WebElement rb=driver.findElement(By.id("registerbtn")); 
    Dimension dim3=rb.getSize();
    int h3=dim3.getHeight();
    System.out.println("Height of Register button: "+h3);
    if(h1-h2==0&&h2-h3==0&&h3-h1==0) 
      System.out.println("Height of FirstName, LastName and register button is same");
    else
      System.out.println("Height of FirstName, LastName and register button is not the same");
//Q70
    String str = fn.getAttribute("value");
    if(str.length()==0) 
      System.out.println("Textbox present in FirstName is empty");
    else 
      System.out.println("Textbox present in FirstName is not empty");
//Q71
    WebElement radbtn=driver.findElement(By.id("malerb"));
    if(radbtn.isSelected()) 
      System.out.println("Male Radio button is selected");
    else
      System.out.println("Male Radio button is deselected");

    WebElement chkbox=driver.findElement(By.id("englishchbx"));
    if(chkbox.isSelected()) 
      System.out.println("English Checkbox is selected");
    else
      System.out.println("English Checkbox is deselected");
//Q72
    if(rb.isEnabled()) 
      System.out.println("Register button is enabled");
    else 
      System.out.println("Register button is disabled");
//Q73
    WebElement logo=driver.findElement(By.id("headerleft"));
    if(logo.isDisplayed()) 
      System.out.println("Logo is displayed");
    else 
      System.out.println("Log is not displayed");
//Q74
    rb.sendKeys(Keys.ENTER);
//Q75
    String fontSize = fn.getCssValue("font-size");
    System.out.println("FirstName font size :: "+fontSize);
//Q76
    System.out.println("FirstName font color :: "+fn.getCssValue("color"));
    
    Thread.sleep(3000);    
    driver.close();
  }
}