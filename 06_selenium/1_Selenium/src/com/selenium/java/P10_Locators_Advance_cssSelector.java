package com.selenium.java;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_Locators_Advance_cssSelector {
  public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
    
    driver.findElement(By.cssSelector("input#firstName")).sendKeys("Niranjan"); 
    driver.findElement(By.cssSelector("input.gender")).sendKeys("Male");
    driver.findElement(By.cssSelector("input[name='lname']")).sendKeys("Acharya"); 
    driver.findElement(By.cssSelector("input.city[placeholder='City']")).sendKeys("Udupi");
    driver.findElement(By.cssSelector("input[placeholder^='Enter your sec']")).sendKeys("who is my Best Friend");
    driver.findElement(By.cssSelector("input[placeholder$='swer']")).sendKeys("Bunny");
    driver.findElement(By.cssSelector("input[placeholder*='pers']")).sendKeys("8073357023");

//Simple Selectors
    driver.findElement(By.cssSelector("input")).sendKeys("Sayeed"); //first input
    driver.findElement(By.cssSelector("#lastName")).sendKeys("Khan");
    driver.findElement(By.cssSelector(".gender")).sendKeys("Boy");
    System.out.println(driver.findElement(By.cssSelector("*")).getText());
    
//Attribute selectors
    driver.findElement(By.cssSelector("input[placeholder]")).sendKeys("Bunny");
//    driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Buddy");
    driver.findElement(By.cssSelector("input[placeholder~='question']")).sendKeys("?????");
//    driver.findElement(By.cssSelector("input[placeholder*='en']")).sendKeys("");
    System.out.println(driver.findElement(By.cssSelector("p[class|='my']")).getText());
//    System.out.println(driver.findElement(By.cssSelector("p[class^='my']")).getText());
//    System.out.println(driver.findElement(By.cssSelector("p[class$='lass']")).getText());
    
//Combinator selectors
    driver.findElement(By.cssSelector(".container select")).click();
    driver.findElement(By.cssSelector(".container > div > select")).click();
    driver.findElement(By.cssSelector("input[placeholder='Verify your personal details']+select")).click();
    driver.findElement(By.cssSelector("input[placeholder='Verify your personal details']~input")).click();
    
//Conditions in CSS Selectors
    System.out.println(driver.findElement(By.cssSelector("input[class='button'][type='button']")).getAccessibleName());
    System.out.println(driver.findElement(By.cssSelector("button, input[type='button'], input[type='submit']")).getText());
    System.out.println(driver.findElement(By.cssSelector("input.button:not([type='button'])")).getAccessibleName());

//Pseudo Classes in CSS Selectors
    System.out.println(driver.findElement(By.cssSelector(".container>:first-child")).getAccessibleName());
    System.out.println(driver.findElement(By.cssSelector(".container>:last-child")).getText());
    System.out.println(driver.findElement(By.cssSelector(".container>:nth-child(2)")).getAccessibleName());
    System.out.println(driver.findElement(By.cssSelector(".container>br:first-of-type")).getTagName());
    System.out.println(driver.findElement(By.cssSelector(".container>br:last-of-type")).getTagName());
    System.out.println(driver.findElement(By.cssSelector(".container>br:nth-of-type(2)")).getTagName());

    Thread.sleep(3000);
    driver.close();
  }
}
