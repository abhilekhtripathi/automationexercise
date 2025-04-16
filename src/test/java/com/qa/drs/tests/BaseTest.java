package com.qa.drs.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.drs.Utils.AlertUtils;
import com.qa.drs.Utils.JasonReader;
import com.qa.drs.factory.DriverFactory;
import com.qa.drs.pages.ContactUsPage;
import com.qa.drs.pages.DashboardPgae;
import com.qa.drs.pages.LoginPage;

import com.qa.drs.pages.SignUpUserPage;

public class BaseTest

{

	DriverFactory df;
	WebDriver driver;
	LoginPage loginPage;
	AlertUtils alterPage;
	Properties prop;
    DashboardPgae dashBoard;
	
	JasonReader jsonReader;
	ContactUsPage conatactPage;
	SignUpUserPage signUpUserPage;

	@BeforeTest

	public void setup() {

		df = new DriverFactory();
		
		prop= df.inti_prop();
		driver = df.init_driver(prop);
		loginPage = new LoginPage(driver);

		signUpUserPage = new SignUpUserPage(driver);
		jsonReader = new JasonReader();
		dashBoard = new DashboardPgae(driver);
		conatactPage= new ContactUsPage(driver);
		

	}

	@AfterTest
	public void tearDown() {

		//driver.quit();
	}
}