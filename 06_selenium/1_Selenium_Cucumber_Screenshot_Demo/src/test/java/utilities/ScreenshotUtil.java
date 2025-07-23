package utilities;

import io.cucumber.java.Scenario;

public class ScreenshotUtil {
  public static void takeScreenshot(Scenario scenario, WebDriver driver) {
    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    scenario.attach(screenshot, "image/png", "Then Step Screenshot");
  }
}
