package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDashboardPage extends BasePage {

	public AccountDashboardPage(WebDriver driver) {
		super(driver);
		
	}
	public void getRegisterationSuccessMessage()
	{
		driver.findElement(By.cssSelector(".success-msg")).getText();
	}

}
