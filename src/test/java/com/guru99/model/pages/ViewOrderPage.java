package com.guru99.model.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.guru99.model.Window.PrintOrderWindow;

public class ViewOrderPage extends BasePage {

	public ViewOrderPage(WebDriver driver) {
		super(driver);
		
	}
	public void clickPrintOrderLink()
	{
		driver.findElement(By.cssSelector(".link-print")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1 = s1.iterator();
		
		while(I1.hasNext())
		{
			String child_window = I1.next();
			
			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);
						
			} 
			
		}
		
	}

}
