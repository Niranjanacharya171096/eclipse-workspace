package com.selenium.java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class P13_SelectCountryCheckboxFromWebTable {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://cosmocode.io/automation-practice-webtable/");
    Thread.sleep(5000);

    //1st way
    List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr")); // fetches all rows

    for (WebElement row : rows) {
      String countryName = row.findElement(By.xpath("td[2]")).getText();
      //      System.out.println(countryName);
      if (countryName.equalsIgnoreCase("India")) {
        row.findElement(By.xpath("td[1]//input[@type='checkbox']")).click();
      }
    }

    Thread.sleep(5000);
    //2nd way
    List<WebElement> countries = driver.findElements(By.xpath("//tbody/tr/td[2]")); // fetches all countries from Country column
    for (WebElement country : countries) {
      String countryName = country.getText();
      //      System.out.println(countryName);
      if (countryName.equalsIgnoreCase("India")) {
        country.findElement(By.xpath("preceding-sibling::td//input[@type='checkbox']")).click();
      }
    }

    Thread.sleep(5000);
    driver.quit();
  }
}
