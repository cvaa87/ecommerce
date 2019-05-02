package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobileDetailsPage extends BasePage {
	
	public MobileDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public double getDevicePriceFromDetailsPage()
	{
		return Double.parseDouble(driver.findElement(By.cssSelector(".price")).getText().replace("$", ""));
		
		
	}
	

}
