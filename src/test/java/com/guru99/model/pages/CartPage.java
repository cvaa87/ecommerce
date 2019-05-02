package com.guru99.model.pages;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends BasePage {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public CartPage(WebDriver driver) {
		super(driver);
		
	}
	public void updateQuantity(int quantity)
	{   
		String q = Integer.toString(quantity);
		driver.findElement(By.cssSelector("input[title='Qty']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.cssSelector("input[title='Qty']")).sendKeys(q);
		driver.findElement(By.cssSelector(".button.btn-update")).click();
	}
	public String getErrorMessage()
	{
		return driver.findElement(By.cssSelector(".error-msg")).getText();
	}
	public String clickEmptyCartButton()
	{
		driver.findElement(By.cssSelector(".button2.btn-empty")).click();
		return driver.findElement(By.cssSelector(".page-title")).getText();
	}
	public void setStateProvince(String value)
	{
		Select s = new Select(driver.findElement(By.id("region_id")));
		s.selectByValue(value);
	}
	public void setZip(String Zipcode)
	{
		driver.findElement(By.id("postcode")).sendKeys(Zipcode);
	}
	public void clickEstimateLink()
	{
		driver.findElement(By.cssSelector("button[title='Estimate']")).click();
	}
	public String getShippingEstimatePrice()
	{
		String shippingestimateprice = driver.findElement(By.cssSelector("label[for='s_method_flatrate_flatrate'] span")).getText().replace("$", "");
		return shippingestimateprice;
		//double estimate = (Double.parseDouble(shippingestimateprice));
		//return (String.format("%.2f", new BigDecimal(estimate)));
		
	}
	public void clickFlatRateRadioButton()
	{
		driver.findElement(By.id("s_method_flatrate_flatrate")).click();
	}
	public void clickUpdateTotalButton()
	{
		driver.findElement(By.cssSelector("button[title='Update Total']")).click();
	}
	public String getTotalPrice()
	{
		return driver.findElement(By.xpath("//td[@class='a-right']/strong/span")).getText().replace("$", "");
	}
	public void clickProceedToCheckoutButton()
	{
		driver.findElement(By.cssSelector(".button.btn-proceed-checkout.btn-checkout")).click();
	}
	public void enterDiscountCode(String code)
	{
		driver.findElement(By.id("coupon_code")).sendKeys(code);
	}
	public void clickApplyDiscountLink()
	{
		driver.findElement(By.cssSelector("button[title='Apply']")).click();
	}
	public String getDiscountPrice()
	{
		String dPrice = driver.findElement(By.cssSelector("#shopping-cart-totals-table > tbody > tr:nth-child(2) > td:nth-child(2) > span")).getText().replace("-$", "");
		/*Double price = Double.parseDouble(dPrice);
		 String formattedPrice = df2.format(price);
		return formattedPrice;*/
		return dPrice;


	}

}
