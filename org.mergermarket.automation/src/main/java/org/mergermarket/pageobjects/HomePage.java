package org.mergermarket.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class HomePage extends BasePage{
	
	private By search_box = By.cssSelector("input#twotabsearchtextbox");
	private By click_search = By.cssSelector("input.nav-input");
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	// Method used to assert the amazon home page title
	public void verifyPageTitle() {
		String pageTitle = "Amazon.com";
	    Assert.assertTrue(getPageTitle().contains(pageTitle));
	
	}

	public SearchPage search(String search_text){
		try{
		
		driver.findElement(search_box).sendKeys(search_text);
		driver.findElement(click_search).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul#s-results-list-atf")));
		
				
		} catch(Exception e){
			                 e.printStackTrace();     }
		
		return new SearchPage(driver);	  
	}
	
	
}
