package org.loveholidays.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class HomePage extends BasePage{
	
	private By manage = By.cssSelector("a[href='/manage/login.html#menu-bar']");
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	// Method used to assert the loveholidays home page title
	public void verifyPageTitle() {
		String pageTitle = "Loveholidays";
	    Assert.assertTrue(getPageTitle().contains(pageTitle));
	
	}

	public ManageSignInPage myBooking(){
		try{
		
		driver.findElement(manage).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("form#getBooking")));
		
				
		} catch(Exception e){
			                 e.printStackTrace();     }
		
		return new ManageSignInPage(driver);	  
	}
	
	
}
