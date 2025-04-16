package com.qa.drs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.drs.Utils.ElementUtil;

public class LoginPage
{
	/// 1 declare private driver
		private WebDriver driver;
		private ElementUtil eleUtil;

		// 2 create constructor

		public LoginPage(WebDriver driver) {

			this.driver = driver;
			eleUtil = new ElementUtil(driver);
		}

		// 3.By Locators
	    private By LoginLink = By.xpath("//a[normalize-space()='Signup / Login']");
		private By emailId = By.name("email");
		private By password = By.name("password");
		private By loginbutton = By.xpath("//button[text()='Login']");
	//	private By forgotPasswordLink = By.id("//a[text()='Forgot password?']");
		private By errorMessageText = By.xpath("//p[text()='Your email or password is incorrect!']");
	

		// 4 page actions

		public String getLoginPageTitle() {

			return driver.getTitle();
		}

		public String getLoginPageUrl() {
			return driver.getCurrentUrl();
			  
		}

//		public boolean ForgotPassLinkExist() {
//			return driver.findElement(forgotPasswordLink).isDisplayed();
//		}
//		
		
		
		
		
		public boolean isErrorMessageDisplayed() {
	        return driver.findElement(errorMessageText).isDisplayed();
	    }

		public void doLogin(String un, String pwd) {
			System.out.println("Login with :" + un + " : " + pwd);
			driver.findElement(LoginLink).click();
			driver.findElement(emailId).sendKeys(un);
			driver.findElement(password).sendKeys(pwd);
			driver.findElement(loginbutton).click();

		}
		public void doLoginWithInvalidCredetails(String un, String pwd) {
			System.out.println("Login with :" + un + " : " + pwd);
			driver.findElement(LoginLink).click();
			driver.findElement(emailId).sendKeys(un);
			driver.findElement(password).sendKeys(pwd);
			driver.findElement(loginbutton).click();
			
		
			

		}
}
