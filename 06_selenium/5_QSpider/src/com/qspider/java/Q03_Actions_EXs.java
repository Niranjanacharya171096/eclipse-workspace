package com.qspider.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q03_Actions_EXs {
  public static void main(String[] args) throws InterruptedException, AWTException {

    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    Actions actions=new Actions(driver);

    //Q85
    driver.get("http://www.istqb.in");
    WebElement menu = driver.findElement(By.xpath("//span[text()='FOUNDATION']"));
    actions.moveToElement(menu).perform(); WebElement
    submenu1=driver.findElement(By.xpath("//a[contains(text(),'CORPORATE EXAMS')]"));
    actions.moveToElement(submenu1).perform();
    WebElement submenu2 = driver.findElement(By.xpath("//a[contains(text(),'ONLINE EXAMS')]"));
    actions.moveToElement(submenu2).click().perform();
    driver.findElement(By.xpath("//input[@name='Submit']")).click();
    //driver.navigate().refresh(); does not work; //Use Alert(C) to handle UnhandledAlertException

    //Q86
    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    WebElement rightClick1=driver.findElement(By.xpath("//span[text()='right click me']")); //use keys to press option
    actions.contextClick(rightClick1).perform();
    Thread.sleep(5000);
    actions.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();
    Thread.sleep(5000);
    //driver.navigate().refresh(); does not work; //Use Alert(C) to handle UnhandledAlertException

    WebElement rightClick2=driver.findElement(By.xpath("//a[text()='Agile Project']"));
    actions.contextClick(rightClick2).perform();
    // actions.keyDown(Keys.SHIFT).sendKeys("T").keyUp(Keys.SHIFT).perform(); //this does not work as we are trying to click Browser Context Menu Options hence use Robot(C)
    Robot r = new Robot(); //press 'w' from the keyboard for opening in a new window
    r.keyPress(KeyEvent.VK_T);
    r.keyRelease(KeyEvent.VK_T);
    Thread.sleep(5000);

    WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
    actions.doubleClick(doubleClick).perform();
    //driver.navigate().refresh(); does not work; //Use Alert(C) to handle UnhandledAlertException

    //Q87
    driver.get("https://demo.guru99.com/test/drag_drop.html");
    WebElement source=driver.findElement(By.xpath("//*[@id='credit2']/a"));
    WebElement target=driver.findElement(By.xpath("//*[@id='bank']/li"));
    actions.dragAndDrop(source, target).perform();

    Thread.sleep(5000);
    driver.quit();
  }
}
