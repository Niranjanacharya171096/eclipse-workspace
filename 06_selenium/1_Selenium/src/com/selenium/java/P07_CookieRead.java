package com.selenium.java;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P07_CookieRead{
  public static void main(String[] args) throws InterruptedException{
    WebDriver driver;
    //    System.setProperty("webdriver.chrome.driver","Chrome_driver_path");
    driver=new EdgeDriver();
    driver.manage().deleteAllCookies(); //delete all cookies on browser
    Thread.sleep(7000);

    driver.get("https://www.facebook.com"); //Enter Email id and Password if you are already Registered user
    driver.findElement(By.name("email")).sendKeys("8970049483");
    driver.findElement(By.name("pass")).sendKeys("FerrariDeadpool@09");
    driver.findElement(By.name("login")).submit();
    // Create a file to store Login Information
    File file = new File("Cookiefile.data");
    try{
      // Delete old file if already exists
      file.delete();
      file.createNewFile();
      FileWriter fileWrite = new FileWriter(file);
      BufferedWriter Bwritecookie = new BufferedWriter(fileWrite); //Getting the cookie information
      for(Cookie ck : driver.manage().getCookies()) {
        Bwritecookie.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
        Bwritecookie.newLine();
      }
      Bwritecookie.close();
      fileWrite.close();
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}