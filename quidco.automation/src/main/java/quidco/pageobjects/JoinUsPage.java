package quidco.pageobjects;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import io.appium.java_client.ios.IOSDriver;

public class JoinUsPage extends BaseHomePage{

	private By fname = By.name("firstname");
	private By lname = By.name("lastname");
	private By email_address = By.name("emailaddress");
	private By pass_word = By.name("password");
	private By joinUs = By.name("JoinUsLink");
	private By myAccount = By.name("userAccountName");
	
	public JoinUsPage(IOSDriver driver) {
		super(driver);
		
	}
	
	public void firstName(String first_name){
		driver.findElement(fname).sendKeys(first_name);
	}
	
	public void lastName(String last_name){
		driver.findElement(lname).sendKeys(last_name);
	}
	
	public void eMail(String email){
		driver.findElement(email_address).sendKeys(email);
	}
	
	public void passWord(String pass){
		driver.findElement(pass_word).sendKeys(pass);
	}
	
	// AccountPage returned for the user joined in
	public AccountPage joinUs(){
		driver.findElement(joinUs).click();
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
