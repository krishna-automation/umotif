package quidco.pageobjects;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import io.appium.java_client.ios.IOSDriver;

public class SignInPage extends BaseHomePage{
	
	private By email_address = By.name("Emailaddress");// Dummy Names as per the Sign In page
	private By pass_word = By.name("Password");
	private By signIn = By.name("SignInLink");
	private By myAccount = By.name("userAccountName");
	
		
	public SignInPage(IOSDriver driver) {
		super(driver);
		
	}
	
	public void eMailAddress(String email){
		driver.findElement(email_address).sendKeys(email);
	}
	
	public void password(String pass){
		driver.findElement(pass_word).sendKeys(pass);
	}
	
	// AccountPage returned for the user signed in
	public AccountPage signIn(){
		
		driver.findElement(signIn).click();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(7, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.withMessage("Timed out");
		wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver arg0) {
					return driver.findElement(myAccount);
				                             			}
				} );
		
		
		
		return new AccountPage(driver);
	}
	
	
}
