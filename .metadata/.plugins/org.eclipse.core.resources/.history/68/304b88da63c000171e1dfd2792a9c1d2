package com.org.deva.testPgm02.samplePgm01;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommanActions {
	
	WebDriver driver;

	public CommanActions(WebDriver Driver) {
		this.driver=Driver;	
	}
	
	WebDriverWait waitTime = new WebDriverWait(driver, 30, 1000);
	
	 public void fixWaitTime(WebDriverWait waitTime){
		   this.waitTime=waitTime;  
	   }
 
	
	
	public WebElement waitNClick(String xpathLocator) throws Exception{
		try {
			WebElement element;
			element=waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
			element.click();
			return element;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
			
		}
		
	}
	
	public boolean findNtype(String xpathLocator, String ipData) throws Exception{
		 boolean flag = false;
		try {
			WebElement element;
			element=waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
			element.click();
			element.clear();
			element.sendKeys(ipData);
			flag=true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return flag;
	}
	
}
