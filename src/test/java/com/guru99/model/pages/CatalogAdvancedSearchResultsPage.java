package com.guru99.model.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogAdvancedSearchResultsPage extends BasePage {

	public CatalogAdvancedSearchResultsPage(WebDriver driver) {
		super(driver);
			}
	
	public ArrayList<String> getProductTitles()
	{
		ArrayList<String> productName = new ArrayList<String>();
		List<WebElement> title = driver.findElements(By.cssSelector(".product-name a"));
		for(WebElement t : title) {
			productName.add(t.getText());
		}
	return productName;
	}
	
	public ArrayList<String> getProductPrices()
	{
		ArrayList<String> productPrice = new ArrayList<String>();
		
		List<WebElement> price = driver.findElements(By.cssSelector(".price"));
		for(WebElement p : price) {
			productPrice.add(p.getText());
		}
		return productPrice;
	}

}
