package com.guru99.model.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.model.devices.CompareDeviceName;
import com.guru99.model.pages.AccountLoginPage;
import com.guru99.model.pages.AccountPage;
import com.guru99.model.pages.BasePage;
import com.guru99.model.pages.CartPage;
import com.guru99.model.pages.CheckoutPage;
import com.guru99.model.pages.MobilePage;
import com.guru99.model.pages.MyOrdersPage;
import com.guru99.model.pages.MyWishListPage;
import com.guru99.model.pages.PrintOrderPage;
import com.guru99.model.pages.ViewOrderPage;

public class OrderTest extends BaseTest {

	@Test(enabled = false)
	public void purchaseOrder() {
		BasePage bP = new BasePage(driver);
		bP.clickMyAccountLink();
		AccountLoginPage aP = new AccountLoginPage(driver);
		aP.loginToAccount("test10103@mailinator.com", "qwerty");
		AccountPage apage = new AccountPage(driver);
		apage.clickMyWishlistLink();
		MyWishListPage wLP = new MyWishListPage(driver);
		wLP.clickAddToCartButton();
		CartPage cP = new CartPage(driver);
		cP.setStateProvince("43");
		cP.setZip("542896");
		cP.clickEstimateLink();
		String shippingestimateprice = cP.getShippingEstimatePrice();
		cP.clickFlatRateRadioButton();
		cP.clickUpdateTotalButton();
		String totalprice = cP.getTotalPrice();
		Assert.assertEquals(shippingestimateprice, "5.00");
		Assert.assertEquals(totalprice, "705.00");
		cP.clickProceedToCheckoutButton();
		CheckoutPage cOP = new CheckoutPage(driver);
		cOP.selectShipToThisAddressRadioButton();
		cOP.clickBillingInformationContinueButton();
		cOP.clickShippingMethodContinueButton();
		cOP.clickCheckOrMoneyOrderRadioButton();
		cOP.clickPaymentMethodContinueButton();
		cOP.clickPlaceOrderButton();
		cOP.getOrderNumber();

	}

	@Test(enabled = false)
	public void printOrderInPdf() {
		BasePage bP = new BasePage(driver);
		bP.clickMyAccountLink();
		AccountLoginPage aP = new AccountLoginPage(driver);
		aP.loginToAccount("test10103@mailinator.com", "qwerty");
		AccountPage apage = new AccountPage(driver);
		apage.clickMyOrdersLink();
		MyOrdersPage mOP = new MyOrdersPage(driver);
		String status = mOP.getOrderStatus();
		Assert.assertEquals(status, "Pending");
		mOP.clickOnViewOrderLink();
		ViewOrderPage vOP = new ViewOrderPage(driver);
		vOP.clickPrintOrderLink();
		PrintOrderPage pOW = new PrintOrderPage(driver);
		pOW.selectSaveOption();
		pOW.clickSaveButton();
	}

	@Test(enabled = false)
	public void ReOrder() {
		BasePage bP = new BasePage(driver);
		bP.clickMyAccountLink();
		AccountLoginPage aP = new AccountLoginPage(driver);
		aP.loginToAccount("test10103@mailinator.com", "qwerty");
		AccountPage apage = new AccountPage(driver);
		apage.clickMyOrdersLink();
		MyOrdersPage mOP = new MyOrdersPage(driver);
		mOP.clickOnReorderLink();
		CartPage cP = new CartPage(driver);
		cP.updateQuantity(10);
		String totalprice = cP.getTotalPrice();
		Assert.assertEquals(totalprice, "7,050.00");
		cP.clickProceedToCheckoutButton();
		CheckoutPage cOP = new CheckoutPage(driver);
		cOP.clickBillingInformationContinueButton();
		cOP.clickShippingMethodContinueButton();
		cOP.clickCheckOrMoneyOrderRadioButton();
		cOP.clickPaymentMethodContinueButton();
		cOP.clickPlaceOrderButton();
		cOP.getOrderNumber();
	}
	
	@Test
	public void verifyDiscount()
	{
		BasePage bP = new BasePage(driver);
		bP.clickMyAccountLink();
		AccountLoginPage aP = new AccountLoginPage(driver);
		aP.loginToAccount("test10103@mailinator.com", "qwerty");
		bP.clickMobileLink();
		MobilePage mP = new MobilePage(driver);
		var device = mP.getDevice(new CompareDeviceName("IPHONE"));
		device.clickAddToCartButton();
		CartPage cP = new CartPage(driver);
		cP.enterDiscountCode("GURU50");
		cP.clickApplyDiscountLink();
		String dPrice = cP.getDiscountPrice();
		Assert.assertEquals(dPrice, "25.00");
	}
}
