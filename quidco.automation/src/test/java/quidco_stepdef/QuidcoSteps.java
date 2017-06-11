package quidco_stepdef;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import quidco.pageobjects.JoinUsPage;
import quidco.pageobjects.BaseHomePage;
import quidco.pageobjects.SignInPage;
import quidco.pageobjects.AccountPage;
import quidco.pageobjects.JoinOrSignPage;



public class QuidcoSteps {
	 
	/**
	 * Page objects involved in the scenario are declared 
	   in the step definition file
	  
	*/
	  IOSDriver driver;
	  BaseHomePage basePage;
	  JoinOrSignPage joinsignPage;
	  JoinUsPage joinUsPage;
	  AccountPage accountPage;
	  SignInPage signInPage;
	  
	  
	  
	  @Before
	  public void setUp() throws Exception{
		
		    DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("platformVersion", "10.1"); // iOS version you planned for the tests
			capabilities.setCapability("deviceName", "iPhone 6"); // iOS device / simulator you planned for the tests
			capabilities.setCapability("app", "/quidco/quidcoiOStesting/quidco.app"); // Your app path 
			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	  }
	  
	  @After
	  public void tearDown() throws Exception{
		  driver.quit();
	  }
	  
	  /**
	   * The following Given and When are the background steps
	   * 
	   */
	
	  @Given("^I am on the Quidco homepage$")
	  public void i_am_on_the_Quidco_homepage()  {
		  basePage = new BaseHomePage(driver);
		  basePage.verifyQuidco();	  	      
	  }

	  @When("^I click Join Us or Sign In$")
	  public void i_click_Join_Us_or_Sign_In()  {
		  joinsignPage = basePage.joinOrsignPage();
	      
	  }

	  // Join Us 
	  @And("^I click Join Us on the Quidco page$")
	  public void i_click_Join_Us_on_the_Quidco_page()  {
	      
		  joinUsPage = joinsignPage.clickJoinUs();
	  }

	  @And("^I Enter \"([^\"]*)\" - my first name$")
	  public void i_Enter_my_first_name(String fname)  {
		  joinUsPage.firstName(fname);
	      
	  }

	  @And("^I Enter \"([^\"]*)\" -  my last name$")
	  public void i_Enter_my_last_name(String lname)  {
	      
		  joinUsPage.lastName(lname);
	  }

	  @And("^I Enter \"([^\"]*)\" - my email address$")
	  public void i_Enter_my_email_address(String email)  {
	      
		  joinUsPage.eMail(email);
	  }

	  @And("^I Enter \"([^\"]*)\" - my password$")
	  public void i_Enter_my_password(String pass)  {
		  joinUsPage.passWord(pass);
	      
	  }
	  
	  @When("^I click Join Us$")
	  public void i_click_Join_Us()  {
	      
		  accountPage = joinUsPage.joinUs();
	  }

	  @Then("^I am successfully logged in to my Quidco Account page$")
	  public void i_am_successfully_logged_in_to_my_Quidco_Account_page()  {
	      
		  accountPage.verifyAccount();
	  }

	  // Sign In
	  @And("^I click Sign In on the Quidco page$")
	  public void i_click_Sign_In_on_the_Quidco_page()  {
	      
		  signInPage = joinsignPage.clickSignIn();
	  }
	  
	  @And("^I Enter \"([^\"]*)\" - my Email address$")
	  public void i_Enter_my_Email_address(String email)  {
	      
		  signInPage.eMailAddress(email);
	  }

	  @And("^I Enter \"([^\"]*)\" - my Password$")
	  public void i_Enter_my_Password(String pass)  {
		  signInPage.password(pass);
	      
	  }
	  
	  @When("^I click Sign In$")
	  public void i_click_Sign_In()  {
		  accountPage = signInPage.signIn();
	      
	  }

	  @Then("^I am successfully logged in to my Quidco Account page with my credentials$")
	  public void i_am_successfully_logged_in_to_my_Quidco_Account_page_with_my_credentials()  {
	      
		  accountPage.verifyAccount();
	  }


}
