package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyWishListPage extends BasePage {

	public MyWishListPage(WebDriver driver) {
		super(driver);
		
	}
	public void clickShareWishListButton()
	{
		driver.findElement(By.cssSelector(".button.btn-share")).click();
	}
	public void clickAddToCartButton()
	{
		driver.findElement(By.cssSelector("button[title='Add to Cart']")).click();
	}
	
	

}
