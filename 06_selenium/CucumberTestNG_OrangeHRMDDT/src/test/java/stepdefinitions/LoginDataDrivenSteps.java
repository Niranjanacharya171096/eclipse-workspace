package stepdefinitions;

import java.io.IOException;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.utilities.ExcelDataReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDataDrivenSteps {
  String[][] datamap; // Data driven
  //List<HashMap<String, String>> datamap; // Data driven

  private LoginPage lp = new LoginPage(DriverFactory.getDriver());

  @Given("the user navigates to login page")
  public void user_navigate_to_login_page() {
    DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  // ******* Data Driven test **************
  @And("the user enters username and password from sheet {string} and rows {int}")
  public void the_user_enters_username_and_password_from_sheet_and_rows(String sheetName, Integer rows) {
    try {
      datamap = ExcelDataReader.excelDataReader(System.getProperty("user.dir") + "\\testData\\OrangeHRM_LoginData.xlsx", sheetName);
    } catch (IOException e) {
      e.printStackTrace();
    }

    int index = rows-1;//Integer.parseInt(rows) - 1; //if rows are in String in feature
    String username = datamap[index][0];
    String password = datamap[index][1];
    //    String email = datamap.get(index).get("username");
    //    String pwd = datamap.get(index).get("password");
    System.out.println("UN :: "+username+" PWD :: "+password);

    lp.enterUserName(username);
    lp.enterPassword(password);
  }

  @When("user clicks on Login")
  public void user_clicks_on_login() {
    lp.clickOnLogin();
  }

  @Then("user should get expected result in the rows {int}")
  public void user_should_get_expected_result_in_the_rows(Integer rows) {
    int index = rows-1;//Integer.parseInt(rows) - 1; //if rows are in String in feature

    String exp_res = datamap[index][2];
    //    String exp_res = datamap.get(index).get("res");

    if (exp_res.equalsIgnoreCase("Invalid")) {
      System.out.println("INVALID");
    } else {
      System.out.println("VALID");
    }
  }
}