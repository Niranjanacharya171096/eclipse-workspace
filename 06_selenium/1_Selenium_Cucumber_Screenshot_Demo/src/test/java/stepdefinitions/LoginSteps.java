package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.screenshotUtil;

public class LoginSteps {
  @Given("the user is logged in")
  public void the_user_is_logged_in() {
    System.out.println("the user is logged in");
  }

  @When("the user navigates to the dashboard")
  public void the_user_navigates_to_the_dashboard() {
    System.out.println("the user navigates to the dashboard");
  }

  @Then("the dashboard should be visible")
  public void the_dashboard_should_be_visible() {
    System.out.println("the dashboard should be visible");
    screenshotUtil.takeScreenshot(null);
    //    Hooks.takeScreenshotForThenSteps(null);
  }
}
