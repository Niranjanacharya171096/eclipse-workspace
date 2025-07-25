package stepdefinitions;

//import org.testng.Assert;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {
  private static String title;
  private LoginPage login = new LoginPage(DriverFactory.getDriver());

  @Given("user is on login page")
  public void user_is_on_login_page() {
    DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @When("user gets the title of the page")
  public void user_gets_the_title_of_the_page() {
    title = login.getLoginPageTitle();
    System.out.println("Page title is: " + title);
  }

  @Then("page title should be {string}")
  public void page_title_should_be(String expectedTitleName) {
    //    expectedTitleName="sss";
    Assert.assertTrue(title.contains(expectedTitleName));
  }

  @Then("forgot your password link should be displayed")
  public void forgot_your_password_link_should_be_displayed() {
    Assert.assertTrue(login.isForgotPwdLinkExist());
  }

  @When("user enters username {string}")
  public void user_enters_username(String username) {
    login.enterUserName(username);
  }

  @When("user enters password {string}")
  public void user_enters_password(String password) {
    login.enterPassword(password);
  }

  @And("user clicks on login button")
  public void user_clicks_on_login_button() {
    login.clickOnLogin();
  }

  @Then("user gets the title of the home page")
  public void user_gets_the_title_of_the_home_page() {
    title = login.getLoginPageTitle();
    System.out.println("Page title is: " + title);
  }
}