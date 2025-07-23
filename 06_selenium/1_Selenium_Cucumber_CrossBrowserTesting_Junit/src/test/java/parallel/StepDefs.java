package parallel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;

public class StepDefs {
  WebDriver driver = DriverFactory.getDriver();

  @Given("Step from {string} in {string} feature file")
  public void step(String scenario, String file) {
    driver.get("https://www.google.com/");

    System.out.format("Thread ID - %2d - %s in %s feature file.\n", Thread.currentThread().getId(), scenario, file);
    Assert.assertEquals(0, 0);
  }
}