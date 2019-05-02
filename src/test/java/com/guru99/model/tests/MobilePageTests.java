package com.guru99.model.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.model.devices.CompareDeviceName;
import com.guru99.model.pages.BasePage;
import com.guru99.model.pages.CartPage;
import com.guru99.model.pages.MobileDetailsPage;
import com.guru99.model.pages.MobilePage;

public class MobilePageTests extends BaseTest{
	
	@Test(enabled = false)
	public void verifySortTest()
	{
		BasePage bP = new BasePage(driver);
		bP.clickMobileLink();
		MobilePage mP = new MobilePage(driver);
		List<String >expectedList= mP.getList();
		Collections.sort(expectedList);
		mP.selectSortBy("Name");
	    Assert.assertEquals(mP.getList(), expectedList);
	}
	
    @Test(enabled = false)
    public void verifyCostOfProductTest()
    {
    	BasePage bP = new BasePage(driver);
		bP.clickMobileLink();
		MobilePage mP = new MobilePage(driver);
		var device = mP.getDevice(new CompareDeviceName("IPHONE"));
		var price = device.getDevicePrice();
		System.out.println("Price of Product is" + price);
		device.selectDevice();
		MobileDetailsPage mDP = new MobileDetailsPage(driver);
		Assert.assertEquals(mDP.getDevicePriceFromDetailsPage(), price);
		
    }
    @Test(enabled = false)
    public void updateQuantityInCartTest()
    {
    	BasePage bP = new BasePage(driver);
		bP.clickMobileLink();
		MobilePage mP = new MobilePage(driver);
		var device = mP.getDevice(new CompareDeviceName("SONY XPERIA"));
		device.clickAddToCartButton();
		CartPage cP = new CartPage(driver);
		cP.updateQuantity(1000);
		String message = cP.getErrorMessage();
		Assert.assertEquals(message, "Some of the products cannot be ordered in requested quantity.");
    }
    @Test(enabled = false)
    public void emptyCartTest()
    {
    	BasePage bP = new BasePage(driver);
		bP.clickMobileLink();
		MobilePage mP = new MobilePage(driver);
		var device = mP.getDevice(new CompareDeviceName("SONY XPERIA"));
		device.clickAddToCartButton();
		CartPage cP = new CartPage(driver);
		cP.updateQuantity(1000);
		String message = cP.clickEmptyCartButton();
		Assert.assertEquals(message, "SHOPPING CART IS EMPTY");
    }
    @Test
    public void verifyComparingTwoProductsTest()
    {
    	BasePage bP = new BasePage(driver);
		bP.clickMobileLink();
		MobilePage mP = new MobilePage(driver);
		var device = mP.getDevice(new CompareDeviceName("SONY XPERIA"));
		device.clickAddToCompareLink();
		var device1 = mP.getDevice(new CompareDeviceName("IPHONE"));
		device1.clickAddToCompareLink();
		var CompareWindow = mP.clickCompareButton();
		String title = CompareWindow.getTitleOfPopupPage();
		Assert.assertEquals(title, "COMPARE PRODUCTS");
		Assert.assertEquals(CompareWindow.getTitleOfDeviceFromTable("SONY XPERIA"), true);
		Assert.assertEquals(CompareWindow.getTitleOfDeviceFromTable("IPHONE"), true);
		CompareWindow.clickCloseWindowButton();
		
    }
}
