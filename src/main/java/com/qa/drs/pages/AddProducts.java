package com.qa.drs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.drs.Utils.ElementUtil;

public class AddProducts {
	
	
	
	/// 1 declare private driver
		private WebDriver driver;
		private ElementUtil eleUtil;

		DashboardPgae dashBoard;

		// 2 create constructor

		public AddProducts(WebDriver driver) {

			this.driver = driver;
			eleUtil = new ElementUtil(driver);
		}
		
		// 3.By Locators
			private By subscriptionEmailtxtField = By.xpath("//input[@id='susbscribe_email']");
			
			
			
			//actions
			
			

}
