package factory;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigPropertiesReader;

public class DriverFactory {

  static WebDriver driver;
  static Properties prop;
  static Logger logger;
  public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

  public static WebDriver initializeDriver() throws IOException {
    prop = ConfigPropertiesReader.getProperties();
    String executionEnv = prop.getProperty("execution_env");
    String browser = prop.getProperty("browser").toLowerCase();
    String os = prop.getProperty("os").toLowerCase();

    if (executionEnv.equalsIgnoreCase("remote")) {
      DesiredCapabilities capabilities = new DesiredCapabilities();

      // os
      switch (os) {
      case "windows":
        capabilities.setPlatform(Platform.WINDOWS);
        break;
      case "mac":
        capabilities.setPlatform(Platform.MAC);
        break;
      case "linux":
        capabilities.setPlatform(Platform.LINUX);
        break;
      default:
        System.out.println("No matching OS");
        return null;
      }

      // browser
      switch (browser) {
      case "chrome":
        capabilities.setBrowserName("chrome");
        break;
      case "edge":
        capabilities.setBrowserName("MicrosoftEdge");
        break;
      case "firefox":
        capabilities.setBrowserName("firefox");
        break;
      default:
        System.out.println("No matching browser");
        return null;
      }

      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

    } else if (executionEnv.equalsIgnoreCase("local")) {
      switch (browser.toLowerCase()) {
      case "chrome":
        driver = new ChromeDriver();
        break;
      case "edge":
        WebDriverManager.edgedriver().clearResolutionCache().driverVersion("134.0.3124.93").setup();
        tlDriver.set(new EdgeDriver());
        break;
      case "firefox":
        driver = new FirefoxDriver();
        break;
      default:
        System.out.println("No matching browser");
        driver = null;
      }
    }

    getDriver().manage().deleteAllCookies();
    getDriver().manage().window().maximize();
    //    getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    return getDriver();
  }

  public static synchronized WebDriver getDriver() {
    return tlDriver.get();
  }

  public static Logger getLogger() {
    logger = LogManager.getLogger(); // Log4j
    return logger;
  }

  public static String randomeString() {
    String generatedString = RandomStringUtils.randomAlphabetic(5);
    return generatedString;
  }

  public static String randomeNumber() {
    String generatedString = RandomStringUtils.randomNumeric(10);
    return generatedString;
  }

  public static String randomAlphaNumeric() {
    String str = RandomStringUtils.randomAlphabetic(5);
    String num = RandomStringUtils.randomNumeric(10);
    return str + num;
  }
}
