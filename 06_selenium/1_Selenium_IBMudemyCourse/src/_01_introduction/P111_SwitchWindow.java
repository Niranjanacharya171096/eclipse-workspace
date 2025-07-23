package _01_introduction;

import java.time.Duration;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P111_SwitchWindow {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://letskodeit.teachable.com/pages/practice";

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get(baseUrl);
  }

  @Test
  public void test() throws InterruptedException {
    // Get the handle
    String parentHandle = driver.getWindowHandle();
    System.out.println("Parent Handle: " + parentHandle);

    // Find Open Window button
    WebElement openWindow = driver.findElement(By.id("openwindow"));
    openWindow.click();

    // Get all handles
    Set<String> handles = driver.getWindowHandles();

    // Switching between handles
    for (String handle : handles) {
      System.out.println(handle);
      if (!handle.equals(parentHandle)) {
        driver.switchTo().window(handle);
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.id("search-courses"));
        searchBox.sendKeys("python");
        Thread.sleep(2000);
        driver.close();
        break;
      }
    }
    // Switch back to the parent window
    driver.switchTo().window(parentHandle);
    driver.findElement(By.id("name")).sendKeys("Test Successful");
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep(2000);
    driver.quit();
  }
}
