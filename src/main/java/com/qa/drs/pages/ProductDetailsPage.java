package com.qa.drs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.drs.Utils.ElementUtil;

public class ProductDetailsPage {

	/// 1 declare private driver
	private WebDriver driver;
	private ElementUtil eleUtil;

	// 2 create constructor

	public ProductDetailsPage(WebDriver driver) {

		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	// 3.By Locators
	//private By AllProductHeading = By.xpath("//h2[normalize-space()='All Products']");
	private By productName = By.xpath("//div[@class=\"product-information\"]//h2");

	private By productCategoryName= By.xpath("//p[contains(text(),'Category')]");
	
	private By productAvailbility= By.xpath("//b[contains(text(),'Availability:')]/..");

	// 4 page actions

	public String getProductName() {
		return driver.findElement(productName).getText();
		

	}

	public String getProductCategoryName() {
		return driver.findElement(productCategoryName).getText();
		

	}
	
	public String getProductAvailiblity() {
		return driver.findElement(productAvailbility).getText();
		

	}
}