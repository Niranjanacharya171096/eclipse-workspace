package _01_introduction;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class P121_KeyPressDemo3 {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.gecko.driver", "/Users/atomar/Documents/workspace_personal/libs/geckodriver");
    driver = new FirefoxDriver();
    baseUrl = "https://letskodeit.teachable.com/p/practice";

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void testKeyPress() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(3000);

    Actions action = new Actions(driver);
    action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
  }

  @After
  public void tearDown() throws Exception {
    // driver.quit();
  }
}