package com.selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P15_Synchronization_Implicitwait {
  public static void main(String[] args) {

    WebDriver driver = new EdgeDriver();

    driver.get("https://www.shadi.com");

    //Using Class ByLinkText
    //    ByLinkText lt = new ByLinkText("Join Now");
    //    driver.findElement(lt).click();

    //Using Abstract Class By
    driver.findElement(By.linkText("Join Now")).click();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.findElement(By.id("first_name")).sendKeys("Niranjan");
    driver.findElement(By.id("last_name")).sendKeys("Acharya");

    //    driver.close();
  }
}
