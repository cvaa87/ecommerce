package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOrderPage extends BasePage{
	
		public PrintOrderPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectSaveOption()
	{
		Select s = new Select(driver.findElement(By.id("destinationSelect")));
		s.selectByValue("Save as PDF/local/");
	}
	
	public void clickSaveButton()
	{
		driver.findElement(By.cssSelector("paper-button.action-button")).click();
	}

}
