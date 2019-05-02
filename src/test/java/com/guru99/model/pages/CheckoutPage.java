package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}
	public void setAddress(String address)
	{
		driver.findElement(By.id("billing:street1")).sendKeys(address);
	}
	public void setCity(String city)
	{
		driver.findElement(By.id("billing:city")).sendKeys(city);
	}
	public void setState(String value)
	{
		Select s = new Select(driver.findElement(By.id("billing:region_id")));
		s.selectByValue(value);
	}
	public void setZip(String zip)
	{
		driver.findElement(By.id("billing:postcode")).sendKeys(zip);
	}
	public void setCountry(String country)
	{
		Select s = new Select(driver.findElement(By.id("billing:country_id")));
		s.selectByValue(country);
	}
	public void setTelephoneNumber(String telephonenumber)
	{
		driver.findElement(By.id("billing:telephone")).sendKeys(telephonenumber);
		
	}
	public void clickContinueButton()
	{
		driver.findElement(By.xpath("//div[@id='billing-buttons-container']/button")).click();
	}
	public void clickShippingMethodContinueButton()
	{
		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/button")).click();
	}
	public void clickCheckOrMoneyOrderRadioButton()
	{
		driver.findElement(By.id("p_method_checkmo")).click();
	}
	public void clickPaymentMethodContinueButton()
	{
		driver.findElement(By.xpath("//div[@id='payment-buttons-container']/button")).click();
		
	}
	public void clickPlaceOrderButton()
	{
		driver.findElement(By.cssSelector(".button.btn-checkout")).click();
	}
	public void getOrderNumber()
	{
		System.out.println("Order number is: " + driver.findElement(By.xpath("//div[@class='col-main']/p/a")).getText());
	}
	public void selectShipToThisAddressRadioButton()
	{
		driver.findElement(By.id("billing:use_for_shipping_yes")).click();
	}
	public void clickBillingInformationContinueButton()
	{
		driver.findElement(By.xpath("//div[@id='billing-buttons-container']/button")).click();
	}

}
