package quidco.pageobjects;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import io.appium.java_client.ios.IOSDriver;

public class JoinOrSignPage extends BaseHomePage{
	
	private By clickJoin = By.xpath("Dummy xpath of Join Us button"); // You can use xpath or By.name or any appropriate locator
	private By clickSign = By.xpath("Dummy xpath of Sign In button");
	private By join_us = By.xpath("Dummy xpath of Join Us button of Join In Page");
	private By sign_in = By.xpath("Dummy xpath of Sign In of Sign In page");
	
	public JoinOrSignPage(IOSDriver driver) {
		super(driver);
		
	} 
	
	
	
	//  JoinUsPage page object returned where Join Us operations are carried out
	public JoinUsPage clickJoinUs(){
				
		driver.findElement(clickJoin).click();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(7, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.withMessage("Timed out");
		wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver arg0) {
					return driver.findElement(join_us);
				                             			}
				} );
		
		return new JoinUsPage(driver);	  
	}

//  SignInPage page object returned where Sign In operations are carried out
	public SignInPage clickSignIn(){
				
		driver.findElement(clickSign).click();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(7, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.withMessage("Timed out");
		wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver arg0) {
					return driver.findElement(sign_in);
				                             			}
				} );
		
		return new SignInPage(driver);	  
	}
	

}