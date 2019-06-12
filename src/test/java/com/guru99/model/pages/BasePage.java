package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	public WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		
		return driver.getTitle();
	}

	public void clickMobileLink() {
		
				driver.findElement(By.cssSelector(".level0.nav-1.first")).click();
		
	}
	public void clickMyAccountLink() {
	driver.findElement(By.linkText("MY ACCOUNT")).click();
	//WebElement footer = driver.findElement(By.cssSelector(".footer"));
	//Footer.findElement(By.cssSelector("li.first a")).click();
	}
	public void clickTvLink()
	{
		driver.findElement(By.cssSelector("li.level0.nav-2.last a")).click();
	}
	public void clickAdvanceSearchLink()
	{
		driver.findElement(By.xpath("//div[@class='footer']/div[3]/ul/li[3]/a")).click();
	}

}
