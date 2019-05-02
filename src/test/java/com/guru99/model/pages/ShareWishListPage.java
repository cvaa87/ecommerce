package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShareWishListPage extends BasePage{

	public ShareWishListPage(WebDriver driver) {
		super(driver);
		
	}
	public void setEmail(String email)
	{
		driver.findElement(By.id("email_address")).sendKeys(email);
	}
	public void setMessage(String message)
	{
		driver.findElement(By.id("message")).sendKeys(message);
	}
	public void clickShareWishList()
	{
		driver.findElement(By.cssSelector("button[title='Share Wishlist']")).click();
	}

}
