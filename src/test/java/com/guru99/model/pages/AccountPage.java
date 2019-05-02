package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void clickMyWishlistLink()
	{
		driver.findElement(By.linkText("MY WISHLIST")).click();
	}
	public void clickMyOrdersLink()
	{
		driver.findElement(By.linkText("MY ORDERS")).click();
	}

}
