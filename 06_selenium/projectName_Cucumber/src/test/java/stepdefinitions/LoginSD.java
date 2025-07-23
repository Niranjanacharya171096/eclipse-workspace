package stepdefinitions;

import org.testng.Assert; 

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class LoginSD {
  private static String title;
  private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
  
  @Given("user is on login page")
  public void user_is_on_login_page() {
    System.out.println("Driver :: " + DriverFactory.getDriver());
    DriverFactory.getDriver().get("https://www.facebook.com");
  }

  @When("user gets the title of the page")
  public void user_gets_the_title_of_the_page() {
    title = loginPage.getLoginPageTitle();
    System.out.println("Page title is: " + title);
  }

  @Then("page title should be {string}")
  public void page_title_should_be(String expectedTitleName) {
    Assert.assertTrue(title.contains(expectedTitleName));
  }
}