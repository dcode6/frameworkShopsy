package com.org.dapps.shopsyFramework;

import org.testng.annotations.Test;

public class toTest extends baseTest{
		
	@Test
	public void samplerun() {
		    String username = homeObj.userNameGenx();
			homeObj.gotoBaseURL().setLanguage();
			homeObj.clickRegister();
			homeObj.popupCheck().setFirstName(username).setLastName(username).setEmail(homeObj.email(username)).setPassword("123456")
			.setPasswordConfirm("123456").clickSubmit().verifyLogin();
			
			
			
	}
	
	

}
