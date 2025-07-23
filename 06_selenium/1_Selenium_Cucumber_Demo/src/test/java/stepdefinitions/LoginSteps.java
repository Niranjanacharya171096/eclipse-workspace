package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

  @Given("user on the Login Page")
  public void user_on_the_login_page() {
    System.out.println("LOGIN PAGE");
  }

  @When("^user enters user name with Admin$")
  public void user_name() {
    System.out.println("USER NAME");
  }

  @And("^user enters password with admin123$")
  public void password() {
    System.out.println("PASSWORD");
  }

  @And("^user click login button$")
  public void login() {
    System.out.println("LOGIN BUTTON");
  }

  @Then("^user should see Orange Home page$")
  public void Orange_Home_page() {
    System.out.println("ORANGE HOME PAGE");
  }
}