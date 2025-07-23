package com.qspider.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q07_Actions_MouseHoverDropDown {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    WebElement companies = driver.findElement(By.xpath("//div[text()='Companies']"));
    Actions actions=new Actions(driver);
    actions.moveToElement(companies).build().perform();

    WebElement calculator = driver.findElement(By.xpath("//div[text()='Salary Calculator']"));
    calculator.click();

    Thread.sleep(5000);
    driver.quit();
  }
}
