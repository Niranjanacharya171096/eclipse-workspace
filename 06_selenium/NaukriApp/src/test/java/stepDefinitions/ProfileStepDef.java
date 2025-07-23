package stepDefinitions;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObjects.LoginPageObj;
import pageObjects.ProfilePageObj;

public class ProfileStepDef {
	
	WebDriver driver;
	LoginPageObj lp;
	ProfilePageObj pp;
	WebDriverWait wait=new WebDriverWait(Base.getDriver(),Duration.ofSeconds(15));
	
	@Given("I navigate to Naukri Application")
	public void i_navigate_to_naukri_application() {
		Allure.description("I navigate to Naukri Application");
		lp=new LoginPageObj(Base.getDriver());
		lp.selectLogin();
		
	}

	@Given("enter the credentials")
	public void enter_the_credentials() {
		Allure.description("enter the credentialss");
		lp.enterCredentials("XXXX", "XXXX");
		lp.selectLoginButton();
	}
	@Given("I naviagte to my profile")
	public void i_naviagte_to_my_profile() {
		Allure.description("I naviagte to my profile");
		pp=new ProfilePageObj(Base.getDriver());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("View")));
	    pp.clickViewProfile();
	    //pp.closeChat();
	}
	@Given("Click on carrer profile")
	public void click_on_carrer_profile() throws InterruptedException {
		Allure.description("Click on carrer profile");
	    pp.clickCarrerProfile();
	    Thread.sleep(3000);
	    pp.editCarrerProfile();
	    boolean res=pp.verifyFormIsPresent();
	    assertTrue(res);
	}
	@When("I click on {string}, select\\/deslect a {string}")
	public void i_click_on_select_deslect_a(String string, String string2) throws InterruptedException {
		Allure.description("I click on Preffered Location, select or deslect a location");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("locationSugg")));
		Thread.sleep(4000);
		pp.clickForLocation();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Chennai']/i")));
	    boolean isSelected=pp.isLocationSelected();
	    if(isSelected)
	    {
	    	pp.addLocation();
	    	System.out.print("Added Chennai to location prefernce");
	    }
	    else
	    {
	    	pp.addLocation();
	    	System.out.print("Removed Chennai to location prefernce");
	    }
	    pp.clickLocationLabel();
	}
	@When("clcik on save button")
	public void clcik_on_save_button() {
		Allure.description("click on save button");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("saveDesiredProfile")));
		pp.clickcpSaveButton();
	}
	@Then("I should see profile updated as {string}")
	public void i_should_see_message(String exp_text) {
		//Allure.description("I should see profile updated as Updated Today");
	    String msg=pp.verifyProfileUpdateStatus();
	    assertTrue(msg.contains(exp_text));
	}
	@When("Click on {string} in resume")
	public void click_on_in_resume(String string) {
		//Allure.description("Click on update in resume");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Update']")));
	    pp.clickUpdateLink();
	}

	@When("I click on resume that has to be uploaded")
	public void i_click_on_resume_that_has_to_be_uploaded() {
		Allure.description("I click on resume that has to be uploaded");
	    pp.uploadResume();
	}

	@Then("Resume should br uploaded successfully")
	public void resume_should_br_uploaded_successfully() {
		Allure.description("Resume should br uploaded successfully");
	    String name=pp.validateResumeName();
	    assertTrue(name.contains("MResume.pdf"));
	    
	}
}
