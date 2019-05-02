package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.guru99.model.ui.OrderHistoryTable;

public class MyOrdersPage extends BasePage{
	
	public OrderHistoryTable orderTable;
	public String status;

	public MyOrdersPage(WebDriver driver) {
		super(driver);
		orderTable = new OrderHistoryTable(driver.findElement(By.id("my-orders-table")));
		
	}
	public String getOrderStatus()
	{
		 status = orderTable.getTableCellValue("ORDER #", "100009238", "ORDER STATUS");
		 return status;
	}
	public void clickOnViewOrderLink()
	{
		orderTable.clickViewOrderLink("ORDER #", "100009238");
	}
	public void clickOnReorderLink()
	{
		orderTable.clickReorderLink("ORDER #", "100009238");
	}

}
