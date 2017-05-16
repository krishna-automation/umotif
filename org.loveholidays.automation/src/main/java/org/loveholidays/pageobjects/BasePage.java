package org.loveholidays.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	/**
	 * This is the Base page for all the PageObjects involved
	 * Variables defined here can be accessed by the inherited pages
	 * 
	 */
	
	protected WebDriver driver;
	protected By intro = By.cssSelector("div#page-content");
		
		
	public BasePage(WebDriver driver) {
		   this.driver = driver;
	}
	
	
	public HomePage gotoHomePage(){
		driver.manage().window().maximize();
		driver.get("https://www.loveholidays.com");
		WebDriverWait wait = new WebDriverWait(driver,7);
		wait.until(ExpectedConditions.visibilityOfElementLocated(intro));
		return new HomePage(driver);
	}

		
}  