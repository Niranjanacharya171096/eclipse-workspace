package _01_introduction;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P094_ImplicitWaitDemo {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://letskodeit.teachable.com/";

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  }

  @Test()
  public void test() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.linkText("Login")).click();

    driver.findElement(By.id("user_email")).sendKeys("test");
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep(3000);
    driver.quit();
  }
}
