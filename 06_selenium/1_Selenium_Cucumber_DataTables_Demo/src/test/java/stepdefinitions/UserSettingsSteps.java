package stepdefinitions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSettingsSteps {

  private Map<String, Map<String, String>> userDatabase = new HashMap<>();
  private int loginAttemptLimit;
  private boolean emailNotifications;
  private boolean twoFactorAuth;
  private String systemMessage;

  @Given("^the following users exist:$")
  public void users_exist(DataTable table) {
    List<Map<String, String>> users = table.asMaps();
    for (Map<String, String> user : users) {
      userDatabase.put(user.get("username"), user);
    }
    System.out.println("USER DETAILS: "+userDatabase.toString());
  }

  @When("^I set the login attempt limit to (\\d+)$")
  public void set_login_attempt_limit(int limit) {
    this.loginAttemptLimit = limit;
    System.out.println("LOGIN ATTEMPT LIMIT: "+loginAttemptLimit);
  }

  @When("^I enable email notifications: \"(true|false)\"$")
  public void enable_email_notifications(String value) {
    this.emailNotifications = Boolean.parseBoolean(value);
    System.out.println("EMAIL NOTIFICATION ENABLED? "+emailNotifications);
  }

  @And("^I enable 2FA: (true|false)$")
  public void enable_two_factor_auth(boolean enabled) {
    this.twoFactorAuth = enabled;
    System.out.println("TWO FACTOR AUTHENTICATION ENABLED? "+twoFactorAuth);
  }

  @Then("^the system should show the message \"([^\"]*)\"$")
  public void verify_system_message(String message) {
    this.systemMessage = message; // Simulating assignment
    System.out.println("SYSTEM MESSAGE: " + message);
  }

  @Then("^the role of \"([^\"]*)\" should be \"(admin|user|guest)\"$")
  public void check_user_role(String username, String expectedRole) {
    Map<String, String> user = userDatabase.get(username);
    assert user != null;
    System.out.println("USER ROLE: "+user.get("role"));
    assert user.get("role").equals(expectedRole);
  }

  @Then("^the user \"([^\"]*)\" should not exist$")
  public void user_should_not_exist(String username) {
    System.out.println(username+" EXIST? "+userDatabase.containsKey(username));
    assert !userDatabase.containsKey(username);
  }
}
