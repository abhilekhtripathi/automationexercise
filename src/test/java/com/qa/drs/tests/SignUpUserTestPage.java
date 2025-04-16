package com.qa.drs.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.stream.JsonReader;
import com.qa.drs.Utils.JasonReader;

public class SignUpUserTestPage extends BaseTest {

	@Test
	public void newUserSignUpPageTest() throws InterruptedException {
		signUpUserPage.clickLoginORSignUpLink();
		signUpUserPage.enterSignupUsername();
		signUpUserPage.enterSignUpEmail();
		signUpUserPage.doclickSignUpButton();
		assertTrue(signUpUserPage.signUpErrorMsgVisible());
		System.out.println("the messsage is:"+ signUpUserPage.signUpErrorMsgVisible());
		
		Thread.sleep(10000);
		
	}

}
