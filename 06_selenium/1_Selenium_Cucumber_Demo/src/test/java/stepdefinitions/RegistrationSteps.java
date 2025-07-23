package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistrationSteps {
  @Given("user on the Registration Page")
  public void user_on_the_registration_page() {
    System.out.println("REGISTRATION PAGE");
  }

  @When("user confirms password with admin123")
  public void user_confirms_password_with_admin123() {
    System.out.println("CONFIRMS PASSWORD");
  }

  @When("user click registration button")
  public void user_click_registration_button() {
    System.out.println("REGISTRATION BUTTON");
  }
}
