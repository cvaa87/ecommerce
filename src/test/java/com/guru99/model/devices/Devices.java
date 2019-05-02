package com.guru99.model.devices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Devices {

	public String devicename;
	public String deviceprice;
	public Double pricefromdetailspage;
	
	public WebElement d;
	
	public Devices(WebElement d){
		this.d = d;
		
	}
	
	public String getDeviceName()
	{
		devicename = d.findElement(By.className("product-name")).getText();
		return devicename;
		
	}
	public Double getDevicePrice()
 	{   
		deviceprice = d.findElement(By.cssSelector(".price")).getText().replace("$", "");
		return Double.parseDouble(deviceprice);
		
	}
	public void selectDevice()
	{
		d.findElement(By.className("product-name")).click();
	}
	public void clickAddToCartButton()
	{
		d.findElement(By.cssSelector(".button.btn-cart")).click();
	}
	public void clickAddToCompareLink()
	{
		d.findElement(By.cssSelector(".link-compare")).click();
		
	}
	public void clickAddToWishList()
	{
		d.findElement(By.cssSelector(".link-wishlist")).click();
	}
}
