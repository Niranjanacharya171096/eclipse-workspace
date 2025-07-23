package parallel;

import org.junit.Assert;

import io.cucumber.java.en.Given;

public class StepDefs {

  @Given("Step from {string} in {string} feature file")
  public void step(String scenario, String file) {
    System.out.format("Thread ID - %2d - %s in %s feature file.\n", Thread.currentThread().getId(), scenario, file);
    Assert.assertEquals(0, 0);
  }
}