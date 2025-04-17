package com.qa.drs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.drs.Utils.ElementUtil;

public class SearchProduct {

	/// 1 declare private driver
	private WebDriver driver;
	private ElementUtil eleUtil;

	DashboardPgae dashBoard;

	// 2 create constructor

	public SearchProduct(WebDriver driver) {

		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	// 3.By Locators
	private By AllProductHeading = By.xpath("//h2[normalize-space()='All Products']");
	private By productbutton = By.xpath("//a[@href='/products']");
	private By productSearchField = By.xpath("//input[@id='search_product']");
	
	private By searchButtonOfProduct = By.xpath("//button[@id='submit_search']");
	
	
	//actions 

	public void doClickProductButton() {
		driver.findElement(productbutton).click();

	}
	
	public void doClickProductSearchFieldAndSearch() {
		driver.findElement(productSearchField).sendKeys("Winter");
		driver.findElement(searchButtonOfProduct).click();

	}

}
