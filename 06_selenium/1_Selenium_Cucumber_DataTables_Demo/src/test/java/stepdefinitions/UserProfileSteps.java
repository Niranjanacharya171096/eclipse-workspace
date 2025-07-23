package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserProfileSteps {

  private final Map<String, Map<String, String>> userDatabase = new HashMap<>();
  private int loginAttemptLimit;
  private boolean emailNotifications;
  private boolean twoFactorAuth;
  private String systemMessage;

  @Given("^the user \"([^\"]*)\" exists with the following details:$")
  public void user_exists_with_details(String username, DataTable table) {

    Map<String, String> details = new HashMap<>();
    for (Map.Entry<String, String> entry : table.asMap().entrySet()) {
      details.put(entry.getKey(), entry.getValue());
    }
    userDatabase.put(username, details);
    System.out.println("USER DETAILS: "+userDatabase.toString());
  }

  @When("^I update the login attempt limit to (\\d+)$")
  public void update_login_limit(int limit) {
    this.loginAttemptLimit = limit;
    System.out.println("LOGIN ATTEMPT LIMIT: "+loginAttemptLimit);
  }

  @When("^I set email notifications to \"(true|false)\"$")
  public void set_email_notifications(String value) {
    this.emailNotifications = Boolean.parseBoolean(value);
    System.out.println("EMAIL NOTIFICATION ENABLED? "+emailNotifications);
  }

  @When("^I enable TwoFA: (true|false)$")
  public void enable_twoFA(boolean twoFA) {
    this.twoFactorAuth = twoFA;
    System.out.println("TWO FACTOR AUTHENTICATION ENABLED? "+twoFactorAuth);
  }

  @Then("^I should see the message \"([^\"]*)\"$")
  public void check_message(String message) {
    this.systemMessage = message;
    System.out.println("SYSTEM MESSAGE: " + message);
  }

  @Then("^the user \"([^\"]*)\" should have role \"(admin|user|guest)\"$")
  public void check_user_role(String username, String expectedRole) {
    Map<String, String> user = userDatabase.get(username);
    assert user != null;
    System.out.println("USER ROLE: "+user.get("role"));
    assert user.get("role").equals(expectedRole);
  }

  @Then("^the user \"([^\"]*)\" should be (active|inactive)$")
  public void check_user_active_status(String username, String status) {
    Map<String, String> user = userDatabase.get(username);
    boolean expectedActive = status.equals("active");
    boolean actualActive = Boolean.parseBoolean(user.get("active"));
    System.out.println("USER IS ACTIVE? "+actualActive);
    assert actualActive == expectedActive;
  }
}
