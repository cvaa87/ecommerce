package com.guru99.model.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CompareWindow {

	 WebElement rootElement;
	 public Table t;
	 
	public CompareWindow(WebElement rootElement)
	{
		this.rootElement = rootElement;
		t = new Table(rootElement.findElement(By.id("product_comparison")));
	}
	public String getTitleOfPopupPage()
	{
		return rootElement.findElement(By.cssSelector(".page-title.title-buttons h1")).getText();
	}
	public boolean getTitleOfDeviceFromTable(String title)
	{
		return t.getDeviceTitle(title);
	}
	public void clickCloseWindowButton()
	{
		rootElement.findElement(By.cssSelector("button[title='Close Window']")).click();
	}
}
