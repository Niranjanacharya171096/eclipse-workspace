package _01_introduction;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P114_SwitchAlert {
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
  public void test1() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.id("name")).sendKeys("Anil");
    driver.findElement(By.id("alertbtn")).click();
    Thread.sleep(3000);
    Alert alert = driver.switchTo().alert();
    alert.accept();
  }

  @Test
  public void test2() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.id("name")).sendKeys("Anil");
    driver.findElement(By.id("confirmbtn")).click();
    Thread.sleep(3000);
    Alert alert = driver.switchTo().alert();
    alert.accept();
    // alert.dismiss();
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep(2000);
    driver.quit();
  }
}
