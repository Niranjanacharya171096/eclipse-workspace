package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
  @Given("^user on the Login Page$")
  public void Login_Page() {
    System.out.println("Login Page");
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
    System.out.println("LOGIN");
  }

  @Then("^user should see Orange Home page$")
  public void Orange_Home_page() {
    System.out.println("Orange Home page");
  }
}
