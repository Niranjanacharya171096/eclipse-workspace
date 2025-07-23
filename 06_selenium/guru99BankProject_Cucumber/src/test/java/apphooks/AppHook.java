package apphooks;

import org.openqa.selenium.WebDriver;

import com.guru99Bank.driverfactory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHook {
  private WebDriver driver;
  private DriverFactory driverFactory;

  @Before()
  public void launchBrowser() {
    DriverFactory driverFactory = new DriverFactory();
    driver = driverFactory.initDriver();
  }

  @After()
  public void quitBrowser() throws InterruptedException {
    Thread.sleep(5000);
    driver.quit();
  }
}
