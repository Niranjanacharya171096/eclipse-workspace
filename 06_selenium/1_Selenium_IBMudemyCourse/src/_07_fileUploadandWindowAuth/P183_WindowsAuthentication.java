package _07_fileUploadandWindowAuth;

import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P183_WindowsAuthentication {
  private WebDriver driver;
  private String baseUrl;

  @BeforeClass
  public void beforeClass() throws MalformedURLException {
    // baseUrl = "http://engprod-charter.net";
    baseUrl = "http://rsyspedia.india.rsystems.com";
    driver = new FirefoxDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void handleAuthenticationon() throws AWTException, InterruptedException, IOException {
    Runtime.getRuntime()
    .exec("C:\\Users\\Anil Tomar\\workspace\\SeleniumWD2Tutorial\\scripts\\WindowsAuthentication.exe");
    driver.get(baseUrl);
  }

  @AfterClass
  public void afterClass() {
  }

}