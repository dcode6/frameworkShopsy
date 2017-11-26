package com.org.dapps.shopsyFramework;

import org.testng.annotations.Test;

public class toTest extends baseTest{
		
	@Test
	public void samplerun() {
			homeObj.gotoBaseURL().setLanguage();
			homeObj.clickRegister();
			homeObj.popupCheck().setFirstName("testsqa").setPassword("last").setEmail("dd1@yopamil.com").setUsername("seleniumtest")
			.setPassword("1234456").setPasswordConfirm("123456").setLastName("wert").clickSubmit();
			
	}
	
	

}
