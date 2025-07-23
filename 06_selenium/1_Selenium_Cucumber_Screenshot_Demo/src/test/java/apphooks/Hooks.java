package apphooks;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
  @AfterStep
  public static void takeScreenshotForThenSteps(Scenario scenario) {
    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    scenario.attach(screenshot, "image/png", "Then Step Screenshot");

    System.out.println("TakesScreenshot - "+scenario.getName());
    //    }
  }
}
