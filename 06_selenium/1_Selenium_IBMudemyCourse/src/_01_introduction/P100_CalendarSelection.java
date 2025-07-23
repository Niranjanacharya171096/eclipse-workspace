package _01_introduction;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P100_CalendarSelection {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "http://www.expedia.com/";

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  // @Test
  public void test1() throws Exception {
    driver.get(baseUrl);
    // Click flights tab
    driver.findElement(By.xpath("//a[@aria-controls='wizard-flight-pwa']")).click();
    // Find departing field and click it
    WebElement departingField = driver.findElement(By.id("d1-btn"));
    departingField.click();
    Thread.sleep(3000);
    // Find the departure date to be selected and click it
    WebElement departureDateToSelect = driver
        .findElement(By.xpath("(//div[@data-stid='date-picker-month']//button[@data-day='30'])[1]"));
    departureDateToSelect.click();
    // Find the return date to be selected and click it
    WebElement returnDateToSelect = driver
        .findElement(By.xpath("(//div[@data-stid='date-picker-month']//button[@data-day='30'])[2]"));
    returnDateToSelect.click();
    // Wait to see the click action before clicking Done button
    Thread.sleep(3000);
    WebElement doneButton = driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']"));
    doneButton.click();
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep(3000);
    driver.quit();
  }
}