package com.qa.drs.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	
	public Properties prop;

	/**
	 * 
	 * this is use for initialize the Web driver
	 * 
	 * @param browserName
	 * @return
	 */

	public WebDriver init_driver(Properties prop) {
		
		
		String  browserName  =prop.getProperty("browser");

		System.out.println("Browser Name is :" + browserName);

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new ChromeDriver();

		} else {
			System.out.println("please pass the right browser:" + browserName);
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		return driver;
	}
	/***
	 * this is use to initialize the properties and retuen prop the properties
	 * @return
	 */
	public Properties inti_prop() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resource/config/config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	
	
}
