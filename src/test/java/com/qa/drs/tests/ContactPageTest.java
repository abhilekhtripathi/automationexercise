package com.qa.drs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.drs.Utils.Constants;

public class ContactPageTest extends BaseTest{
	
	
	@Test(priority=1)
	public void doClickContactButton() {
		conatactPage.doclickConatctbtton();
		conatactPage.doEnterContactName();
		conatactPage.doEnterContactEmail();
		conatactPage.doEnterSubjectMessage();
		conatactPage.doEnterConatctMesssage();
		conatactPage.doclickSbmitButton();
		conatactPage.contactUsTxtMessage();
	}


}
