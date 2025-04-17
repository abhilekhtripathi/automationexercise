package com.qa.drs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.drs.Utils.ElementUtil;

public class SubscriptionPage {
	

	/// 1 declare private driver
	private WebDriver driver;
	private ElementUtil eleUtil;

	DashboardPgae dashBoard;

	// 2 create constructor

	public SubscriptionPage(WebDriver driver) {

		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	// 3.By Locators
		private By AllProductHeading = By.xpath("//h2[normalize-space()='All Products']");
		
		
		
		//actions 

		public void doClickProductButton() {
			//driver.findElement(productbutton).click();

		}

}
