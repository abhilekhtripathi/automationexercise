package com.qa.drs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.drs.Utils.ElementUtil;

public class DashboardPgae 

{
    
	/// 1 declare private driver
			private WebDriver driver;
			private ElementUtil eleUtil;
			
			
			// 2 create constructor

			public DashboardPgae(WebDriver driver) {

				this.driver = driver;
				eleUtil = new ElementUtil(driver);
			}
	
			
			//Locator
			 private By LogOutButton = By.xpath("//a[@href=\"/logout\"]");
			 
			 //action
			 
			 
			 
			 public void doClickLogOutBttn() {
				 driver.findElement(LogOutButton).click();
				 
				 
			 }
	
}
