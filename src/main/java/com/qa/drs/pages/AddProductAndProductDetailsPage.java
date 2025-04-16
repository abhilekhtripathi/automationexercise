package com.qa.drs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.drs.Utils.ElementUtil;

public class AddProductAndProductDetailsPage {
	
	/// 1 declare private driver
			private WebDriver driver;
			private ElementUtil eleUtil;
			

			// 2 create constructor

			public AddProductAndProductDetailsPage(WebDriver driver) {

				this.driver = driver;
				eleUtil = new ElementUtil(driver);
			}
			
			// 3.By Locators
		    private By ProductButton = By.xpath("//a[@href=\"/products\"]");
			private By ViewProductLink = By.xpath("//a[@href=\"/product_details/1\"]");
			
			private By ProductTitleName= By.xpath("//h2[text()='Blue Top']");
			
			// 4 page actions
			
			public void doClickProductsbutton() {
				  driver.findElement(ProductButton).click();
				  driver.findElement(ViewProductLink).click();
				  driver.findElement(ProductTitleName).isDisplayed();
			
			
}
}