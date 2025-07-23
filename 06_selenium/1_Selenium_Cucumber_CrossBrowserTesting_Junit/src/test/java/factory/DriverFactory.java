package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
  private static WebDriver driver;

  public static WebDriver initDriver() {
    String browser = System.getProperty("browser", "chrome");

    switch (browser.toLowerCase()) {
    case "chrome":
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      break;
    case "firefox":
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
      break;
    case "edge":
      WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
      break;
    default:
      throw new IllegalArgumentException("Unsupported browser: " + browser);
    }

    driver.manage().window().maximize();
    return driver;
  }

  public static WebDriver getDriver() {
    return driver;
  }

  public static void quitDriver() {
    if (driver != null) {
      driver.quit();
    }
  }
}
