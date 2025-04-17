package com.qa.drs.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDetailsPageTest extends BaseTest{

	
	@Test
	
	public void allProductHeading() {
		
		dashBoard.doClickProductButton();
		productListPage.clickViewProductLink("1");
		
		//String actualProdut = productDetailsPage.getProductName();
	    Assert.assertEquals(productDetailsPage.getProductName(), "Blue Top");
	}
	
}
//Blue Top
