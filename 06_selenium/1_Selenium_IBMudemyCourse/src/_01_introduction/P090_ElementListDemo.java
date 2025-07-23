package _01_introduction;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P090_ElementListDemo {

  private WebDriver driver;
  private String baseUrl;
  private P090_GenericMethods gm;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://letskodeit.teachable.com/pages/practice";
    gm = new P090_GenericMethods(driver);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void testMethod() throws Exception {
    driver.get(baseUrl);

    List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");

    int size = elementList.size();
    System.out.println("Size of the element list is: " + size);

  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep(2000);
    // driver.quit();
  }
}
