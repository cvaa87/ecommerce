package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountLoginPage extends BasePage {

	public AccountLoginPage(WebDriver driver) {
		super(driver);
		
	}
	public void clickCreateAnAccountButton() {
		driver.findElement(By.cssSelector("a[title='Create an Account']")).click();
		
	}
	public void loginToAccount(String emailaddress, String password)
	{
		driver.findElement(By.id("email")).sendKeys(emailaddress);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("send2")).click();
	}

}
