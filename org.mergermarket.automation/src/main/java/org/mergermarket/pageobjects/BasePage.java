package org.mergermarket.pageobjects;


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
	protected By content = By.cssSelector("div#nav-xshop-container");
		
		
	public BasePage(WebDriver driver) {
		   this.driver = driver;
	}
	
	
	public HomePage gotoHomePage(){
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		WebDriverWait wait = new WebDriverWait(driver,7);
		wait.until(ExpectedConditions.visibilityOfElementLocated(content));
		return new HomePage(driver);
	}

		
}  