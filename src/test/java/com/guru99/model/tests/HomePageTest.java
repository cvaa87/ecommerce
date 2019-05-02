package com.guru99.model.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.guru99.model.devices.CompareDeviceName;
import com.guru99.model.pages.AccountDashboardPage;
import com.guru99.model.pages.AccountLoginPage;
import com.guru99.model.pages.BasePage;
import com.guru99.model.pages.CreateAccountPage;
import com.guru99.model.pages.MobilePage;
import com.guru99.model.pages.MyWishListPage;
import com.guru99.model.pages.ShareWishListPage;

public class HomePageTest extends BaseTest {
	
	@Test(enabled = false)
	public void verifyTitleTest()
	{
		BasePage bP = new BasePage(driver);
		assertEquals("Home page", bP.getTitle() );
		bP.clickMobileLink();
		MobilePage mP = new MobilePage(driver);
		assertEquals("Mobile", mP.getTitle());
	}
    @Test
    public void registerForAnAccountTest()
    {
    	BasePage bP = new BasePage(driver);
    	bP.clickMyAccountLink();
    	AccountLoginPage aP = new AccountLoginPage(driver);
    	aP.clickCreateAnAccountButton();
    	CreateAccountPage cAP = new CreateAccountPage(driver);
    	cAP.setFirstName("AjithS");
    	cAP.setLastName("Kumar");
    	cAP.setEmailAddress("test10103@mailinator.com");
    	cAP.setPassword("qwerty");
    	cAP.setConfirmPassword("qwerty");
    	cAP.clickRegisterButton();
    	AccountDashboardPage aDP = new AccountDashboardPage(driver);
    	aDP.getRegisterationSuccessMessage();
    	bP.clickTvLink();
    	MobilePage mP = new MobilePage(driver);
		var device = mP.getDevice(new CompareDeviceName("LG LCD"));
		device.clickAddToWishList();
		MyWishListPage wLP = new MyWishListPage(driver);
		wLP.clickShareWishListButton();
		ShareWishListPage sWLP = new ShareWishListPage(driver);
		sWLP.setEmail("cvaa87@gmail.com");
		sWLP.setMessage("This is a test");
		sWLP.clickShareWishList();
		
    	
    	
    }
}
