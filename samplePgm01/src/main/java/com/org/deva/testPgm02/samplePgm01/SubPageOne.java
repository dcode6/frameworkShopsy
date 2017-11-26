package com.org.deva.testPgm02.samplePgm01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class SubPageOne extends BasePage {
	
	WebDriverWait waitTime = new WebDriverWait(driver, 30, 1000);
	
	 	public void fixWaitTime(WebDriverWait waitTime){
		   this.waitTime=waitTime;
	 	}
	 	
	 	

	 	public boolean MailId() throws Exception {
		 new CommanActions(driver).findNtype("//*[@id='identifierId']", "dd6work@gmail.com");
		 new CommanActions(driver).waitNClick("//*[@id='identifierNext']");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement errorElement = driver.findElement(By.xpath("//*[@jsname='B34EJ']"));
		 if(!errorElement.isDisplayed()){
		    return true;
		    }
		else {
			System.out.println(errorElement.getText());
			return false;
		     }
		 }
	 	
	 	public boolean passWord() throws Exception {
			 new CommanActions(driver).findNtype("//*[@type='password']", "bEn-10000");
			 new CommanActions(driver).waitNClick("//*[@id='passwordNext']");
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 WebElement errorElement = driver.findElement(By.xpath("//*[@jsname='B34EJ']"));
			 if((!errorElement.isDisplayed())&&(driver.getTitle().startsWith("Inbox"))){
				 
			    return true;
			    }
			else {
				System.out.println(errorElement.getText());
				return false;
			     }
			 }
	 	public boolean mailSearch() throws Exception {
			 new CommanActions(driver).findNtype("//*[@id='gbqfq']", "email");
			 new CommanActions(driver).waitNClick("//*[@id='gbqfb']");
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 WebElement resultElement = driver.findElement(By.xpath("//*[@id='lm']"));
			 if(!resultElement.isDisplayed()){
			    return true;
			    }
			else {
				System.out.println("error");
				return false;
			     }
			 }
		 	
}



