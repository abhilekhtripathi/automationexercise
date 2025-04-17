package com.qa.drs.tests;

import org.testng.annotations.Test;

public class SearchProductTest  extends BaseTest{
	
	
	@Test
	
	public void dosearchProduct() {
		loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password").trim());
		searchPage.doClickProductButton();
		
	}
	
	@Test
	
	public void doClickSerachField() {
		searchPage.doClickProductButton();
		searchPage.doClickProductSearchFieldAndSearch();
		
	}

}
