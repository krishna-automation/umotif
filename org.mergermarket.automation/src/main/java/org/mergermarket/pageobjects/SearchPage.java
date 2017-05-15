package org.mergermarket.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchPage extends BasePage{
    
	private By price = By.cssSelector("span.a-color-base.sx-zero-spacing");
	
	
	public SearchPage(WebDriver driver) {
		super(driver);
		
	}

	public void verifySearch(){
		
	try{
		List<WebElement> results = driver.findElements(price);
	for(int i=0;i<5;i++){
			
			Float first_five = Float.parseFloat(results.get(i).getAttribute("aria-label").substring(1));
			Assert.assertTrue(first_five>0, "Price is not greater than $0.0");
		             		}
	
	    }catch(Exception e){
	    	                e.printStackTrace();
	                        }
	}
	
	public SearchPage sortLowtoHigh(){
		
		Select sort = new Select(driver.findElement(By.cssSelector("select#sort")));
		sort.selectByVisibleText("Price: Low to High");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#atfResults")));
		driver.navigate().refresh();
		
		return this;
		
	}
	
	
	public  CartItemPage cartItem(){
			
	try{
		    List<WebElement> results = driver.findElements(price);
		for(int i=0;i<5;i++){
			
			Float first_five = Float.parseFloat(results.get(i).getAttribute("aria-label").substring(1));
			Assert.assertTrue(first_five>0, "Price is not greater than $0.0");
			
		                    }		
		
		results.get(0).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,7);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#add-to-cart-button")));
	    }catch(Exception e){
	    	               e.printStackTrace();
	                       }
		
		return new CartItemPage(driver);
	} 
	
}
