package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		
	}
	public void setFirstName(String fname)
	{
	driver.findElement(By.id("firstname")).sendKeys(fname);
	}
	public void setMiddleName(String mname)
	{
	driver.findElement(By.id("middlename")).sendKeys(mname);
	}
	public void setLastName(String lname)
	{
	driver.findElement(By.id("lastname")).sendKeys(lname);
	}
	public void setEmailAddress(String eaddress)
	{
	driver.findElement(By.id("email_address")).sendKeys(eaddress);
	}
	public void setPassword(String password)
	{
	driver.findElement(By.id("password")).sendKeys(password);
	}
	public void setConfirmPassword(String password)
	{
	driver.findElement(By.id("confirmation")).sendKeys(password);
	}
	public void clickRegisterButton()
	{
		driver.findElement(By.cssSelector("button[title='Register']")).click();
	}
	

}
