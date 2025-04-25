

package com.qa.drs.tests;

import org.testng.annotations.Test;

public class SubscriptionPageTest extends BaseTest

{

	
	@Test
	public void doClickTxtFiled() {
		
		  subscriptionPage.doclickSubscriptionTxtField();
		  
	}
	
}
//need to first validate successfully message
//also need to handle if application is loginin 