package com.hyrtutorials.java;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class H07_Boostrap_DropDown1 {
  public static void main(String[] args) throws IOException, InterruptedException {
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); //default is 0s

    String url = "https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_6";
    driver.get(url);
    Thread.sleep(2000);

    driver.findElement(By.xpath("//button[@type='button']")).click();
    System.out.println("Button clicked");
    List<WebElement> options = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
    System.out.println(options.size());

    for (WebElement option : options) {
      String optionText = option.getText();
      System.out.println(optionText);
      if (optionText.equals("HTML")) {
        option.click();
        System.out.println("clicked");
        break;
      }
    }
    Thread.sleep(5000);
    driver.close();
  }
}
