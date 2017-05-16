package loveholidays_stepdef;

import org.loveholidays.pageobjects.BasePage;
import org.loveholidays.pageobjects.HomePage;
import org.loveholidays.pageobjects.ManageSignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoveHolidaysSteps {
	 
	  /**
	  * Page objects involved in the scenario are declared 
	  * in the step definition file
	   
	  * The tests use ChromeDriver only ( Chrome browser )  */
	
	  WebDriver driver;
	  BasePage basePage;
	  HomePage homePage;
	  ManageSignInPage mybookingPage;
	  
	  
	  @Before()
	  public void setUp(){
		  System.setProperty("webdriver.chrome.driver", "C://Users//Krishna//Downloads//chromedriver.exe");
		  driver = new ChromeDriver();
		  }
	    
	  
	  @After()
	  public void tearDown(){
		  driver.quit();
	  }
	  


@Given("^I am on the loveholidays homepage$")
public void i_am_on_the_loveholidays_homepage()  {
	  basePage = new BasePage(driver);
	  homePage = basePage.gotoHomePage();
	  homePage.verifyPageTitle();
}

@Given("^The user goes to Manage My Booking page$")
public void the_user_goes_to_Manage_My_Booking_page()  {
	mybookingPage = homePage.myBooking();
}

@And("^The user enters a reference number like \"([^\"]*)\"$")
public void the_user_enters_a_reference_number_like(String ref)  {
	mybookingPage.bookingReference(ref);
}

@Then("^An error message should be displayed containing the text - Your booking reference number starts with LVE or LOV and can be found on your booking summary$")
public void an_error_message_should_be_displayed_containing_the_text_Your_booking_reference_number_starts_with_LVE_or_LOV_and_can_be_found_on_your_booking_summary() {
	
	mybookingPage.validateReference1();
	
}

@When("^The user enters a reference number \"([^\"]*)\"$")
public void the_user_enters_a_reference_number(String ref) {
	mybookingPage.bookingReference(ref);
}

@And("^The user enters \"([^\"]*)\" in the passenger surname$")
public void the_user_enters_in_the_passenger_surname(String sur)  {
	mybookingPage.surname(sur);
}

@Then("^An error message should be displayed containing the text - Sorry this is not a valid booking reference\\. If you have booked within the last (\\d+) hours please wait until you receive your LOV or LVE reference number by email before logging in$")
public void an_error_message_should_be_displayed_containing_the_text_Sorry_this_is_not_a_valid_booking_reference_If_you_have_booked_within_the_last_hours_please_wait_until_you_receive_your_LOV_or_LVE_reference_number_by_email_before_logging_in(int arg1) {
	
	mybookingPage.validateReference2();
	
}


	  
}   
    