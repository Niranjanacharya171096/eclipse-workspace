package com.selenium.java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class P13_FindAllLinks {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://in.bookmyshow.com/explore/home/");
    Thread.sleep(5000);

    List<WebElement> allLinks = driver.findElements(By.tagName("a")); //fetches all links

    int size = allLinks.size();
    System.out.println(size);

    int visibleLinkCount = 0;
    int hiddenLinkCount = 0;
    for(WebElement link: allLinks) {
      //if the link is displayed, then print the text of the link
      if(link.isDisplayed()) {
        visibleLinkCount++;
        System.out.println(visibleLinkCount+" --> "+link.getText());
      } else {
        hiddenLinkCount++;
      }
    }
    System.out.println("Total number of visible links:" + visibleLinkCount);
    System.out.println("Total number of hidden links:" + hiddenLinkCount);

    Thread.sleep(5000);
    driver.quit();
  }
}
