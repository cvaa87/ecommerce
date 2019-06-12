package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvancedSearchPage extends BasePage {

	public AdvancedSearchPage(WebDriver driver) {
		super(driver);
		
	}
	public void setPriceRange(String priceFrom, String priceTo) {
		
		driver.findElement(By.cssSelector("#price")).sendKeys(priceFrom);
		driver.findElement(By.cssSelector("#price_to")).sendKeys(priceTo);
				
	}
	public void clickSearchButton()
	{
		driver.findElement(By.cssSelector(".buttons-set button")).click();
	}

}
