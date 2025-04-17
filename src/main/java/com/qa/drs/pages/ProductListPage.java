package com.qa.drs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.drs.Utils.ElementUtil;

public class ProductListPage {
	
	/// 1 declare private driver
		private WebDriver driver;
		private ElementUtil eleUtil;

		// 2 create constructor

		public ProductListPage(WebDriver driver) {

			this.driver = driver;
			eleUtil = new ElementUtil(driver);
		}
		
		// 3.By Locators
		private By AllProductHeading = By.xpath("//h2[normalize-space()='All Products']");
		private String ViewProductLinkOfFirstProduct = "//a[@href='/product_details/index']";
		
		
		// 4 actions

	public boolean isAllProductTetxtDisplayed() {
		  return driver.findElement(AllProductHeading).isDisplayed();
	}
	
	public void clickViewProductLink(String productNumber) {
//		   By clickView = By.xpath(ViewProductLinkOfFirstProduct.toString().replace("index" ,productNumber));
//		   driver.findElement(clickView).click();
		
		String   str = ViewProductLinkOfFirstProduct.replace("index", productNumber);
		  driver.findElement(By.xpath(str)).click();
		
		
		
		
	//	driver.findElement(ViewProductLinkOfFirstProduct).click();
	}
	
	
	
	
	
	
	
}
