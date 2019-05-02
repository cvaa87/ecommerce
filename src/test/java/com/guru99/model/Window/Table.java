package com.guru99.model.Window;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table {

	private WebElement rootelement;

	public Table(WebElement rootelement)
	{
		this.rootelement=rootelement;
		
	}
	public boolean getDeviceTitle(String title)
	{
		List<WebElement> tablerows = rootelement.findElements(By.tagName("tr"));
		List<WebElement> coloumns = rootelement.findElements(By.tagName("td"));
		for(int i = 0; i<tablerows.size();i++)
		{
			for(int j = 0; j<coloumns.size(); j++)
			{
				String devicename = coloumns.get(j).findElement(By.className("product-name")).getText();
				if(devicename.equals(title))
				{
					return true;
				}
				
			}
		}
		return false;
	}
}

	
