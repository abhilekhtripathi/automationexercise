package com.qa.drs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.drs.Utils.Constants;
//this is login test page 
public class LoginPageTest extends BaseTest {
	@Test(priority=1)
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		System.out.println("page title is :" + actTitle);
		Assert.assertEquals(actTitle, Constants.LOGIN_PAGE_TITLE);
	}

	@Test(priority=2)

	public void loginPageURLTest() {
		String actURL = loginPage.getLoginPageUrl();
		System.out.println("Url is :" + actURL);
		Assert.assertTrue(actURL.contains(Constants.LOGIN_PAGE_URL_FRACTION));

	}

	@Test(priority=3)
	public void loginTest() {

		loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password").trim());
	}
	
	
	@Test(priority=4)
	public void LogOutTest() {
		System.out.println("Test"+loginPage.getLoginPageTitle() );
           if (loginPage.getLoginPageTitle().equalsIgnoreCase("Automation Exercise")) {
        	   loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password").trim()); 
			
		}
		//
		dashBoard.doClickLogOutBttn();
		
	}
}
