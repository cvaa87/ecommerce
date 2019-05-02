package com.guru99.model.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderHistoryTable {

	protected WebElement rootElement;
	public String resultcoloumnvalue;

	public OrderHistoryTable(WebElement rootElement) {
		this.rootElement = rootElement;
	}

	public String getTableCellValue(String searchcoloumn, String searchvalue, String resultcoloumn) {
		List<WebElement> tableheaders = rootElement.findElements(By.tagName("th"));
		int searchcoloumnindex = 0;
		int resultcoloumnindex = 0;
		for (int i = 0; i < tableheaders.size(); i++) {
			String sc = tableheaders.get(i).getText();
			if (sc.contentEquals(searchcoloumn)) {
				searchcoloumnindex = i;
			}
			if (sc.contentEquals(resultcoloumn)) {
				resultcoloumnindex = i;
			}
		}

		List<WebElement> tablerows = rootElement.findElements(By.tagName("tr"));
		for (int i = 1; i < tablerows.size(); i++) {
			List<WebElement> coloumns = tablerows.get(i).findElements(By.tagName("td"));
			String c = coloumns.get(searchcoloumnindex).getText();
			if (c.contentEquals(searchvalue)) {
				resultcoloumn = coloumns.get(resultcoloumnindex).getText();
				System.out.println("Status:" + resultcoloumn);
				break;
			}
		}

		return resultcoloumn;
	}

	public void clickViewOrderLink(String searchcoloumn, String searchvalue) {
		List<WebElement> tableheaders = rootElement.findElements(By.tagName("th"));
		int searchcoloumnindex = 0;
		for (int i = 0; i < tableheaders.size(); i++) {
			String sc = tableheaders.get(i).getText();
			if (sc.contentEquals(searchcoloumn)) {
				searchcoloumnindex = i;
			}
		}

		List<WebElement> tablerows = rootElement.findElements(By.tagName("tr"));
		for (int i = 1; i < tablerows.size(); i++) {
			List<WebElement> coloumns = tablerows.get(i).findElements(By.tagName("td"));
			System.out.println("Number of coloumns:" + coloumns.size());
			String c = coloumns.get(searchcoloumnindex).getText();
			if (c.contentEquals(searchvalue)) {
				tablerows.get(i).findElement(By.xpath("//td[@class='a-center view last']/span/a")).click();
				break;
			}
		}

		}
	public void clickReorderLink(String searchcoloumn, String searchvalue) {
		List<WebElement> tableheaders = rootElement.findElements(By.tagName("th"));
		int searchcoloumnindex = 0;
		for (int i = 0; i < tableheaders.size(); i++) {
			String sc = tableheaders.get(i).getText();
			if (sc.contentEquals(searchcoloumn)) {
				searchcoloumnindex = i;
			}
		}

		List<WebElement> tablerows = rootElement.findElements(By.tagName("tr"));
		for (int i = 1; i < tablerows.size(); i++) {
			List<WebElement> coloumns = tablerows.get(i).findElements(By.tagName("td"));
			System.out.println("Number of coloumns:" + coloumns.size());
			String c = coloumns.get(searchcoloumnindex).getText();
			if (c.contentEquals(searchvalue)) {
				tablerows.get(i).findElement(By.cssSelector(".link-reorder")).click();
				break;
			}
		}

		}

}
