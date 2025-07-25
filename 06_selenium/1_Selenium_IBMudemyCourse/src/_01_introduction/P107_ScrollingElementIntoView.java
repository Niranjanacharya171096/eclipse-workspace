package _01_introduction;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P107_ScrollingElementIntoView {
  private WebDriver driver;
  private JavascriptExecutor js;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void testJavaScriptExecution() throws Exception {
    // Navigation
    js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
    Thread.sleep(3000);

    // Scroll Down
    js.executeScript("window.scrollBy(0, 1900);");
    Thread.sleep(2000);

    // Scroll Up
    js.executeScript("window.scrollBy(0, -1900);");
    Thread.sleep(2000);

    // Scroll Element Into View
    WebElement element = driver.findElement(By.id("mousehover"));
    js.executeScript("arguments[0].scrollIntoView(true);", element);
    Thread.sleep(2000);
    js.executeScript("window.scrollBy(0, -190);");
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep(3000);
    driver.quit();
  }
}