package mergermarket_stepdef;

import org.mergermarket.pageobjects.BasePage;
import org.mergermarket.pageobjects.CartItemPage;
import org.mergermarket.pageobjects.HomePage;
import org.mergermarket.pageobjects.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MergerMarketSteps {
	 
	  /**
	  * Page objects involved in the scenario are declared 
	  * in the step definition file
	   
	  * The tests will be run on Chrome browser or Firefox browser as per the tag in the feature file / runner )  */
	
	  WebDriver driver;
	  BasePage basePage;
	  HomePage homePage;
	  SearchPage searchPage;
	  CartItemPage cartItemPage;
	  
	  
	  @Before("@Chrome")
	  public void setUpChrome(){
		 System.setProperty("webdriver.chrome.driver", "C://Users//Krishna//Downloads//chromedriver.exe");
		  driver = new ChromeDriver();
		  
	  }
	  
	  @Before("@Firefox")
	  public void setUp(){
		 System.setProperty("webdriver.gecko.driver", "C://Users//Krishna//Downloads//geckodriver.exe");
		 driver = new FirefoxDriver();
	  
	  } 
	    
	  
	  @After()
	  public void tearDown(){
		  driver.quit();
	  }
	  
	  @Given("^I am on the amazon homepage$")
	  public void i_am_on_the_amazon_homepage() {
		  basePage = new BasePage(driver);
		  homePage = basePage.gotoHomePage();
		  homePage.verifyPageTitle();
	      
	  }

	  @And("^I search for \"([^\"]*)\" on the search bar to view the iPhone results$")
	  public void i_search_for_on_the_search_bar_to_view_the_iPhone_results(String text) {
	      
		  searchPage = homePage.search(text);
		  searchPage.verifySearch();
	  }

	  @And("^I sort the results by price \\(low to high\\)$")
	  public void i_sort_the_results_by_price_low_to_high() {
	      
		   searchPage.sortLowtoHigh();
	      
	  }

	  @When("^I add the cheapest item in the list to the basket$")
	  public void i_add_the_cheapest_item_in_the_list_to_the_basket() {
		  cartItemPage = searchPage.cartItem();
	      
	  }

	  @Then("^I see the item has been added to the basket$")
	  public void i_see_the_item_has_been_added_to_the_basket() {
		  cartItemPage.addToCart();
	      
	  }

	  
}   
    