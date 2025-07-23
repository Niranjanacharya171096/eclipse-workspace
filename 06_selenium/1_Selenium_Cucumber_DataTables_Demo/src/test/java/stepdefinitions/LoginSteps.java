package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

  @Given("user on BAHMNI welcome page")
  public void user_on_bahmni_welcome_page() {
    System.out.println("====user on BAHMNI welcome page====");
  }

  @Given("user finds {string} option")
  public void user_finds_option(String string) {
    System.out.println("user finds "+string+" option");
  }

  @When("user clicks Clinical Service option")
  public void user_clicks_clinical_service_option() {
    System.out.println("user clicks Clinical Service option");
  }

  @Then("page should navigate to Login Page")
  public void page_should_navigate_to_login_page() {
    System.out.println("page should navigate to Login Page");
  }

  @Given("user on BAHMNI login page")
  public void user_on_bahmni_login_page() {
    System.out.println("user on BAHMNI login page");
  }

  @And("user enters username1 and password1")
  public void user_enters_username1_and_password1() {
    System.out.println("user enters username1 and password1");
  }

  @When("user clicks on Login")
  public void user_clicks_on_login() {
    System.out.println("user clicks on Login");
  }

  @Then("page should navigate to dashboard Page")
  public void page_should_navigate_to_dashboard_page() {
    System.out.println("page should navigate to dashboard Page");
  }

  @And("user enters username2 {string} and password2 {string}")
  public void user_enters_username2_and_password2(String string1, String string2) {
    System.out.println("user enters username2 "+string1+" and password2 "+string2);
  }

  @Then("page should navigate to {string} Page")
  public void page_should_navigate_to_page(String string) {
    System.out.println("page should navigate to "+string+" Page");
  }

  @And("user enters username8 and password8")
  //  @Given("^user enters username8 (\\w+) and password8 (\\w+)$")
  public void user_enters_username8_and_password8(DataTable table) {
    Map<String, String> data = table.asMap(String.class, String.class);
    System.out.println(data.toString());
    System.out.println("user enters username8 "+data.get("username")+" and password8 "+data.get("password"));
  }

  @And("user enters username9 and password9")
  public void user_enters_username9_and_password9(DataTable table) {
    List<Map<String, String>> data = table.asMaps();
    System.out.println(data.toString());
    System.out.println("user enters username9 "+data.get(0).get("username")+" and password9 "+data.get(0).get("password"));
  }

  //  @And("user enters username3 {word} and password3 {word}")
  //  @And("^user enters username3 ([^ ]+) and password3 ([^ ]+)$")
  //  @And("^user enters username3 (\\w+) and password3 (\\w+)$")
  @And("^user enters username3 ([^\"]*) and password3 ([^\"]*)$")
  public void user_enters_username3_and_password3(String string1, String string2) {
    System.out.println("user enters username3 "+string1+" and password3 "+string2);
  }

  @And("user enters username4 and password4")
  public void user_enters_username4_and_password4(DataTable dataTable) {
    List<List<String>> data = dataTable.cells();
    System.out.println(data.toString());
    System.out.println("user enters username4 "+data.get(0).get(0)+" and password3 "+data.get(0).get(1));
  }

  @And("user enters username5 and password5")
  public void user_enters_username5_and_password5(DataTable dataTable) {
    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
    System.out.println(data.toString());
    System.out.println("user enters username5 "+data.get(0).get("username")+" and password5 "+data.get(0).get("password"));
    System.out.println("user enters username5 "+data.get(1).get("username")+" and password5 "+data.get(1).get("password"));
  }

  @And("user enters username6 and password6")
  public void user_enters_username6_and_password6(DataTable dataTable) {
    List<Map<String, String>> datat = dataTable.asMaps(String.class, String.class);
    System.out.println(datat.toString());
    for (Map<String, String> data : dataTable.asMaps(String.class, String.class)){
      System.out.println("user enters username6 "+data.get("username")+" and password6 "+data.get("password"));
    }
  }

  @And("user enters username7 and password7")
  public void user_enters_username7_and_password7(DataTable dataTable) {
    List<Credentials> creds = dataTable.asList(Credentials.class);
    System.out.println(dataTable.asLists());
    for (Credentials cred : creds){
      System.out.println("user enters username7 "+cred.getUsername()+" and password7 "+cred.getPassword()); //not working
    }
  }
  //  @Given("the following employees:")
  //  public void employees(DataTable table) {
  //    List<Employee> employeeList = table.asList(Employee.class);
  //    System.out.println(table.asLists());
  //    System.out.println(employeeList.toString());
  //
  //    for (Employee emp : employeeList) {
  //      System.out.println(emp.getName() + " - " + emp.getDepartment() +" "+ emp.getSalary());
  //    }
  //  }
}

