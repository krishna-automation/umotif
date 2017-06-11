package quidco.pageobjects;


import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;

public class BaseHomePage {
	/**
	 * This is the Base page for all the PageObjects involved
	 * Variables are defined here and accessed by the inherited pages
	 * 
	 */
	protected IOSDriver driver;
	protected By joinOrsign = By.name("joinusorsignin"); // You can use the appropriate locator ( say xpath ). I've used By.name here for test purposes
	protected By joinus = By.name("joinus");             // as the locators here are dummy - just for test purposes
	protected By joinsignbutton = By.xpath("dummy xpath for the Join Us Sign In button on the home page");
	
	public BaseHomePage(IOSDriver driver) {
		   this.driver = driver;
	}
	
	// Quidco 'Join Us or Sign In'  page object returned from Home Page
	public JoinOrSignPage joinOrsignPage(){
		driver.findElement(joinOrsign).click();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(7, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.withMessage("Timed out");
		wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver arg0) {
					return driver.findElement(joinus);
				                             			}
				} );
					
		return new JoinOrSignPage(driver);
	}

	
	public void verifyQuidco(){
		
		Assert.assertTrue(driver.findElement(joinsignbutton).isDisplayed());
	}

}
