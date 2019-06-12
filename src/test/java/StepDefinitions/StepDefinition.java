package StepDefinitions;

import org.openqa.selenium.By;

import com.guru99.model.pages.AccountDashboardPage;
import com.guru99.model.pages.AccountLoginPage;
import com.guru99.model.pages.BasePage;
import com.guru99.model.pages.CreateAccountPage;
import com.guru99.model.tests.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseTest{
	
	CreateAccountPage cAP;
	
	@Given("^user is on Landingpage$")
	public void user_is_on_Landingpage() throws Throwable {
		startUpTest();
	    
	}

	@Given("^user clicks Create Account link$")
	public void user_clicks_Create_Account_link() throws Throwable {
		
		BasePage bP = new BasePage(driver);
		bP.clickMyAccountLink();
		AccountLoginPage aP = new AccountLoginPage(driver);
    	aP.clickCreateAnAccountButton();
	}

	@Given("^user enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		
		cAP = new CreateAccountPage(driver);
		cAP.setFirstName(arg1);
		cAP.setLastName(arg2);
		cAP.setEmailAddress(arg3);
		cAP.setPassword(arg4);
		cAP.setConfirmPassword(arg4);
	}
	    

	@When("^user clicks Register button$")
	public void user_clicks_Register_button() throws Throwable {
	   cAP.clickRegisterButton();
	}

	@Then("^Registeration Success message is displayed$")
	public void registeration_Success_message_is_displayed() throws Throwable {
		AccountDashboardPage aDP = new AccountDashboardPage(driver);
    	aDP.getRegisterationSuccessMessage();
	   
	}



}