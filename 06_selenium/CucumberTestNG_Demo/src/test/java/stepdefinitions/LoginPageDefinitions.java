package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {
  WebDriver driver=null;
  //  public final static int TIMEOUT = 10;

  @Given("User is on HRMLogin page")
  public void loginTest() {
    System.out.println("Inside Step - browser is open");

    //    ChromeOptions options = new ChromeOptions();
    //    options.addArguments("--remote-allow-origins=*");
    //
    //    WebDriverManager.chromedriver().setup();
    //    //    System.setProperty("webdriver.edge.driver", "E:\\selenium jar\\msedgedriver.exe");
    //    driver = new ChromeDriver(options);
    //
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //    driver.manage().window().maximize();
    //
    //    String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    //    System.out.println(url);
    //    driver.get(url);
    System.out.println("loginTest");
  }

  @When("User enters username as {string} and password as {string}")
  public void goToHomePage(String userName, String passWord) {
    // login to application
    //    driver.findElement(By.name("username")).sendKeys(userName);
    //    driver.findElement(By.name("password")).sendKeys(passWord);
    //    driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
    // go the next page
    System.out.println("goToHomePage");
  }

  @Then("User should be able to login sucessfully and new page open")
  public void verifyLogin() {
    //    String homePageHeading = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")).getText();
    //    //Verify new page - HomePage
    //    Assert.assertEquals(homePageHeading,"Employee Information");
    System.out.println("verifyLogin");
  }

  @Then("User should be able to see error message {string}")
  public void verifyErrorMessage(String expectedErrorMessage) {
    //    String actualErrorMessage = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
    //    // Verify Error Message
    //    Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    System.out.println("verifyErrorMessage");
  }
}