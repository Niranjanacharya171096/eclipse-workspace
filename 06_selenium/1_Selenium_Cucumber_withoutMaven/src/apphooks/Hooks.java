package apphooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
  @Before
  public void beforeScenario() {
    System.out.println("This will run before the Scenario");
  }

  @After
  public void afterScenario() {
    System.out.println("This will run after the Scenario");
  }

  @BeforeStep
  public void beforeStep() {
    System.out.println("This will run before the each Step");
  }

  @AfterStep
  public void afterStep() {
    System.out.println("This will run after the each Step");
  }
}
