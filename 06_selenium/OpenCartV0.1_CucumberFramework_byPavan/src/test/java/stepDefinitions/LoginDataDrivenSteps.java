package stepDefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.ExcelDataReader;

public class LoginDataDrivenSteps {
  WebDriver driver;
  HomePage hp;
  LoginPage lp;
  MyAccountPage macc;

  List<HashMap<String, String>> datamap; // Data driven
  //  String[][] datamap; // Data driven

  @Given("the user navigates to login page")
  public void user_navigate_to_login_page() {
    DriverFactory.getLogger().info("Goto my account-->Click on Login.. ");
    hp = new HomePage(DriverFactory.getDriver());

    hp.clickMyAccount();
    hp.clickLogin();
  }

  @When("user enters email as {string} and password as {string}")
  public void user_enters_email_as_and_password_as(String email, String pwd) {
    DriverFactory.getLogger().info("Entering email and password.. ");

    lp = new LoginPage(DriverFactory.getDriver());
    lp.setEmail(email);
    lp.setPassword(pwd);
  }

  @When("the user clicks on the Login button")
  public void click_on_login_button() {
    lp.clickLogin();
    DriverFactory.getLogger().info("clicked on login button...");
  }

  @Then("the user should be redirected to the MyAccount Page")
  public void user_navigates_to_my_account_page() {
    macc = new MyAccountPage(DriverFactory.getDriver());
    boolean targetpage = macc.isMyAccountPageExists();

    Assert.assertEquals(targetpage, true);
  }

  // ******* Data Driven test **************
  @Then("the user should be redirected to the MyAccount Page by passing email and password with excel row {int}")
  public void check_user_navigates_to_my_account_page_by_passing_email_and_password_with_excel_data(int rows) {
    try {
      datamap = ExcelDataReader.excelDataReader(System.getProperty("user.dir") + "\\testData\\Opencart_LoginData.xlsx", "Sheet1");
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("============ExcelDataReader============");
    int index = rows-1;//Integer.parseInt(rows) - 1; //if rows are in String in feature
    String email = datamap.get(index).get("username");
    String pwd = datamap.get(index).get("password");
    String exp_res = datamap.get(index).get("result");

    //    String email = datamap[index][0];
    //    String pwd = datamap[index][1];
    //    String exp_res = datamap[index][2];

    System.out.println("Email="+email + " " +pwd+ " "+exp_res);
    lp = new LoginPage(DriverFactory.getDriver());
    lp.setEmail(email);
    lp.setPassword(pwd);

    lp.clickLogin();
    macc = new MyAccountPage(DriverFactory.getDriver());
    /*Data is valid --> logged in success - test pass - logout
          --> logged in failed - test fail */
    try {
      boolean targetpage = macc.isMyAccountPageExists();
      System.out.println("target page: " + targetpage);
      if (exp_res.equalsIgnoreCase("Valid")) {
        if (targetpage == true) {
          MyAccountPage myaccpage = new MyAccountPage(DriverFactory.getDriver());
          myaccpage.clickLogout();
          Assert.assertTrue(true);
        } else {
          Assert.assertTrue(false);
        }
      }
      /*Data is Invalid --> logged in success - test fail - logout
            --> logged in failed - test pass */
      if (exp_res.equalsIgnoreCase("Invalid")) {
        if (targetpage == true) {
          macc.clickLogout();
          Assert.assertTrue(false);
        } else {
          Assert.assertTrue(true);
        }
      }
    } catch (Exception e) {
      Assert.assertTrue(false);
    }
  }
}
