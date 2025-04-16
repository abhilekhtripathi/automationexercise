package com.qa.drs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.drs.Utils.ElementUtil;
import com.qa.drs.Utils.JasonReader;

public class SignUpUserPage

{
    //1
	private WebDriver driver;
	private ElementUtil eleUtil;
	//private JasonReader  jsonReader;

	// 2 create constructor

	public SignUpUserPage(WebDriver driver) {

		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	
	//private By newUserSignUplabelText = By.xpath("//h2[text()='New User Signup!']");
	private By LoginLink = By.xpath("//a[normalize-space()='Signup / Login']");
	private By signUpusernameField = By.name("name");
    private By signUpUserpasswordField = By.xpath("//input[@data-qa=\"signup-email\"]");
    private By signUpuserButton = By.xpath("//button[text()='Signup']");
    
    private By userExistErrorMsg = By.xpath("//p[text()='Email Address already exist!']");
	
	
	
	// Actions
    
    public void clickLoginORSignUpLink() {
    	driver.findElement(LoginLink).click();
       
    }
    
    
    
    public void enterSignupUsername() {
    	//driver.findElement(LoginLink).click();
        driver.findElement(signUpusernameField).sendKeys("ABC");
    }

    public void enterSignUpEmail() {
        driver.findElement(signUpUserpasswordField).sendKeys("abhilekhtripathi8@gmail.com");
    }

    public void doclickSignUpButton() {
        driver.findElement(signUpuserButton).click();
    }
    
    
    public boolean signUpErrorMsgVisible() {
       // driver.findElement(signUpuserButton).click();
        return driver.findElement(userExistErrorMsg).isDisplayed();
    }
	
}
