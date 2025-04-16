package com.qa.drs.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.drs.Utils.AlertUtils;
import com.qa.drs.Utils.ElementUtil;

public class ContactUsPage {

	// 1
	private WebDriver driver;
	private ElementUtil eleUtil;
	private ContactUsPage contactUtil;
	
	// AlertUtils alt = new AlertUtils(driver);
	// private JasonReader jsonReader;

	// 2 create constructor

	public ContactUsPage(WebDriver driver) {

		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	//3.Locators 
	private By contactUsButton = By.xpath("//a[@href=\"/contact_us\"]");
	private By nameTextField = By.xpath("//input[@data-qa=\"name\"]");
	private By emailTextField = By.xpath("//input[@data-qa=\"email\"]");
	private By subjectTextField = By.xpath("//input[@data-qa=\"subject\"]");
	private By messageTextAreaField= By.xpath("//textarea[@data-qa=\"message\"]");
	private By contactLoginButton = By.xpath("//input[@data-qa=\"submit-button\"]");
	private By contactUsSuccessTtextMsg =By.xpath("(//div[text()='Success! Your details have been submitted successfully.'])[1]");
	//4.actions
	
	  public void doclickConatctbtton() {
	    	driver.findElement(contactUsButton).click();
	       
	    }
	  
	  public void doEnterContactName() {
	    	driver.findElement(nameTextField).sendKeys("Abhilekh");
	       
	    }
	  
	  public void doEnterContactEmail() {
	    	driver.findElement(emailTextField).sendKeys("abhilekhtripathi8@gmail.com");
	       
	    }
	  
	  public void doEnterSubjectMessage() {
	    	driver.findElement(subjectTextField).sendKeys("this is the subject for the conatact");
	       
	    }
	  
	  public void doEnterConatctMesssage() {
	    	driver.findElement(messageTextAreaField).sendKeys("this is the subject message of contact page ");
	       
	    }
	    
	  public void doclickSbmitButton() {
	    	driver.findElement(contactLoginButton).click();
	    	Alert alt = driver.switchTo().alert();
	    	alt.accept();
	    	//alt.acceptAlert();
	    }
	  
	  public boolean contactUsTxtMessage() {
	       // driver.findElement(signUpuserButton).click();
	        return driver.findElement(contactUsSuccessTtextMsg).isDisplayed();
	       // System.out.println();
	    }


}
