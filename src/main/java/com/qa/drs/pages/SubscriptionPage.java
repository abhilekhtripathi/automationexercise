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
		private By subscriptionEmailtxtField = By.xpath("//input[@id='susbscribe_email']");
		private By rightArrowButton = By.xpath("//i[@class='fa fa-arrow-circle-o-right']");
		
		
		
		//actions 

		public void doclickSubscriptionTxtField() {
                   driver.findElement(subscriptionEmailtxtField).sendKeys("abhi@gmail.com");
                   driver.findElement(rightArrowButton).click();
		}

}
