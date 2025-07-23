package _01_introduction;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P106_WindowSize {
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

    // Size of window
    long height = (Long) js.executeScript("return window.innerHeight;");
    long width = (Long) js.executeScript("return window.innerWidth;");

    System.out.println("Height is: " + height);
    System.out.println("Width is: " + width);
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep(2000);
    driver.quit();
  }

}
