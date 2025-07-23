package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.guru99Bank.driverfactory.DriverFactory;
import com.guru99Bank.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSD {
  private WebDriver driver = DriverFactory.getDriver();
  private LoginPage loginPage = new LoginPage(driver);

  //  @Before()
  //  public void launchBrowser() {
  //    DriverFactory driverFactory = new DriverFactory();
  //    driver = driverFactory.initDriver();
  //  }
  //
  //  @After()
  //  public void quitBrowser() throws InterruptedException {
  //    Thread.sleep(5000);
  //    driver.quit();
  //  }

  @Given("I am on login page")
  public void i_am_on_login_page() {
    driver.get("http://www.demo.guru99.com/V4/");
  }

  @And("I enter UserID {string}")
  public void i_enter_user_id(String string) {
    loginPage.enterUserID(string);
  }

  @And("I enter Password {string}")
  public void i_enter_password(String string) {
    loginPage.enterPassword(string);
  }

  @When("I click on Login button")
  public void i_click_on_login_button() {
    loginPage.clickOnLogin();
  }

  @Then("I should be on {string} Welcome Page")
  public void i_should_be_on_welcome_page(String string) throws InterruptedException {
    String url = loginPage.navigateManagerhomepage();
    Assert.assertTrue(url.contains(string));
  }
}
