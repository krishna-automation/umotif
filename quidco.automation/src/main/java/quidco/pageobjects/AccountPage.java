package quidco.pageobjects;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;

public class AccountPage extends BaseHomePage{

	public AccountPage(IOSDriver driver) {
		super(driver);
		
	}
	
	// Verify the user joined in or signed in 
	public void verifyAccount(){
		
		Assert.assertTrue(driver.findElement(By.name("Account Activity")).isDisplayed());		
	}

}
