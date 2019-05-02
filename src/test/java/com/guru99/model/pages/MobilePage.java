package com.guru99.model.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.guru99.model.Window.CompareWindow;
import com.guru99.model.devices.CompareDevice;
import com.guru99.model.devices.Devices;


public class MobilePage {
	
	public WebDriver driver;
	ArrayList<String> items = new ArrayList<String>();
	
	public MobilePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		
		return driver.getTitle();
	}

	public void selectSortBy(String value) {
		
		Select s = new Select(driver.findElement(By.cssSelector("select[title='Sort By']")));
		s.selectByVisibleText(value);
		
	}


	public ArrayList<String> getList() {
		
		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		for(int i = 0; i<products.size(); i++)
		{
			items.add(products.get(i).getText());
		}
		return items;
	}
    
	public Devices getDevice(CompareDevice cp)
	{
		List<WebElement> devices = driver.findElements(By.cssSelector(".product-info"));
		System.out.println(devices);
		return new Devices(devices.stream().filter(d->cp.Compare(new Devices(d))).findFirst().orElseThrow());
	}
	public CompareWindow clickCompareButton()
	{
		driver.findElement(By.cssSelector("button[title='Compare']")).click();  
		
		String parent = driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles();		
        Iterator<String> I1=s1.iterator();
		
				while(I1.hasNext())
			{

			   String child_window=I1.next();

			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());
			
			} 
			}//End While
		
		return new CompareWindow(driver.findElement(By.cssSelector("body.page-popup")));
		
		}//End for
	
	/*Set<String>ids = driver.getWindowHandles();
	Iterator<String> it = ids.iterator();
	String parentwindow = it.next();
	String childwindow = it.next();
	driver.switchTo().window(childwindow);*/
	
	/*Using enhanced for loop-NOT Working???
	 Set<String> allWindows = driver.getWindowHandles();

	
	for(String winHandle : allWindows) 
	{
		 driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
	}
	*/
}
