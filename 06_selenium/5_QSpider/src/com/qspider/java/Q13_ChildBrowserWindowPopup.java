package com.qspider.java;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q13_ChildBrowserWindowPopup {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://secure.indeed.com/auth/");
    driver.findElement(By.id("login-google-button")).click();
    driver.findElement(By.id("apple-signin-button")).click();
    //    driver.findElement(By.id("login-facebook-button")).click();
    Thread.sleep(5000);

    Set<String> allWH = driver.getWindowHandles();
    System.out.println("List Of windows name :: ");
    for(String wh:allWH) {
      driver.switchTo().window(wh);
      String title = driver.getTitle();
      System.out.println(title);
    }
    System.out.println();

    //Close specific window
    System.out.println("Enter Specific window name :: ");
    Scanner sc = new Scanner(System.in);
    String winTitle = sc.nextLine();
    System.out.println("Closing :: "+ winTitle);

    // use // for(String wh:allWH) { // or iterate using Iterator
    Iterator<String> I = allWH.iterator();
    while(I.hasNext()) {
      String wh = I.next();
      driver.switchTo().window(wh);
      String title = driver.getTitle();
      System.out.println("Title :: " + title);
      if(winTitle.equals(title)) {
        System.out.println("\nClosed :: "+title);
        driver.close();
        break;
      } else {
        driver.switchTo().window(wh);
      }
    }
    Thread.sleep(5000);
    driver.quit();
  }
}
