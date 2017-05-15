package org.mergermarket.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CartItemPage extends BasePage{

	private By added_message = By.cssSelector("div#huc-v2-order-row-items-msg");
	String expected = "Added to Cart";
	
	public CartItemPage(WebDriver driver) {
		super(driver);
		
	}

	
	public void addToCart(){
		
	try{
		Select sort = new Select(driver.findElement(By.cssSelector("select#quantity")));
		if(sort.getFirstSelectedOption().isSelected())
		driver.findElement(By.cssSelector("input#add-to-cart-button")).click(); 
		
		WebDriverWait wait = new WebDriverWait(driver,7);
		wait.until(ExpectedConditions.presenceOfElementLocated(added_message));
		String actual = driver.findElement(added_message).getText();
		Assert.assertEquals(expected, actual);
	    }catch(Exception e){
	    	                e.printStackTrace();
	                        }
		}
}
