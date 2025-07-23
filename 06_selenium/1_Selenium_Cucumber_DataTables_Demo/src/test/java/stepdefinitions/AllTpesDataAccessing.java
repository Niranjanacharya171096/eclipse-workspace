package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllTpesDataAccessing {
  // Scenario: Different data

  // @Given("^I have \\(?(\\d+)\\)? items in my cart$")
  @Given("^I have \\(?([0-9]+)\\)? items in my cart$")
  // @Given("I have \\(?{int}\\)? items in my cart") //cant mix both regex and
  // cucumber expression
  public void i_have_items_in_my_cart(Integer int1) {
    System.out.println(int1);
  }

  // @And("^the balance is ([0-9]*\\.?[0-9]+)$")
  // @And("^the balance is (\\d*\\.\\d+)$")
  @And("the balance is {double}")
  public void the_balance_is(Double balance) {
    System.out.println(balance);
  }

  // @Given("the setting is {string}")
  @Given("^the setting is \"(true|false)\"$")
  public void the_setting_is(boolean enabled) {
    System.out.println(enabled);
  }

  @Given("^the setting is: (true|false)$")
  public void the_setting_is_(boolean enabled) {
    System.out.println(enabled);
  }

  @Given("^the flag is: (?i)(true|false)$")
  public void flag_is(boolean flag) {
    System.out.println("Flag value: " + flag);
  }

  @And("^the user agreed: (yes|no)$")
  public void user_agreed(String answer) {
    boolean agreed = answer.equalsIgnoreCase("yes");
    System.out.println("User agreed: " + agreed);
  }

  // @When("I login with username {string} and password {string}")
  @When("^I login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
  public void i_login_with_username_and_password(String string1, String string2) {
    System.out.println(string1 + " " + string2);
  }

  // @Then("I see the message {string}")
  @Then("^I see the message \"([^\"]*)\"$")
  public void i_see_the_message(String string) {
    System.out.println(string);
  }

  @Then("^I should see the welcome message(?: \"([^\"]*)\")?$")
  public void check_optional_message(String message) {
    System.out.println(message);
  }

  @Then("^I should be redirected(?: to the (.*))?$")
  public void i_should_be_redirected_to_the_dashboard(String destination) {
    if (destination != null) {
      System.out.println("Redirected to: " + destination);
    } else {
      System.out.println("Redirected to: " + destination);
    }
  }

  @When("^I login as \"(admin|user|guest)\"$")
  public void i_login_as(String role) {
    System.out.println(role);
  }

  @When("the user get the following message:")
  public void the_user_get_the_following_message(String docString) {
    System.out.println(docString);
  }

  // Scenario: DataTable access
  @Given("the following fruits:")
  public void the_following_fruits(DataTable dataTable) {
    List<String> fruits = dataTable.asList();

    for (String fruit : fruits) {
      System.out.println("Fruit: " + fruit);
    }
  }

  @Given("the following numbers:")
  public void the_following_numbers(DataTable dataTable) {
    List<Integer> numbers = dataTable.asList(Integer.class);
    System.out.println(numbers); // [1, 2, 3]
  }

  @Given("the following fruits and colors:")
  public void fruits(DataTable table) {
    List<List<String>> data = table.asLists();
    for (List<String> row : data) {
      System.out.println("Fruit: " + row.get(0) + ", Color: " + row.get(1));
    }
  }

  @Given("the user details:")
  public void single_user(DataTable table) {
    Map<String, String> user = table.asMap();
    System.out.println("Name: " + user.get("name"));
    System.out.println("Email: " + user.get("email"));
    System.out.println("Age: " + user.get("age"));
  }

  @Given("the user data:")
  public void user_data(DataTable table) {
    List<Map<String, String>> users = table.asMaps();
    for (Map<String, String> user : users) {
      System.out.println(user.get("name") + " - " + user.get("email"));
    }
  }

  @Given("the user details and email:")
  public void user_details_and_email(DataTable table) {
    List<Map<String, String>> users = table.asMaps();
    for (Map<String, String> user : users) {
      System.out.println(user.get("name") + " - " + user.get("email"));
    }
  }

  @Given("the following users exist?:")
  public void user_exist(DataTable table) {
    List<Map<String, String>> users = table.asMaps();
    for (Map<String, String> user : users) {
      System.out.println(user.get("name") + " - " + user.get("email"));
    }
  }

  @Given("the following employees:")
  public void employees(DataTable table) {
    List<Employee> employeeList = table.asList(Employee.class);
    for (Employee emp : employeeList) {
      System.out.println(emp.getName() + " - " + emp.getDepartment());
    }
  }

  @Given("raw table data:")
  public void raw_data(DataTable table) {
    for (List<String> row : table.cells()) {
      System.out.println(String.join(", ", row));
    }
  }

  //  data accessing using placeholders
}
