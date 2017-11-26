package com.org.dapps.testPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	
    WebDriver driver;
    WebDriverWait waitFor = new WebDriverWait(driver, 60, 1000);
	
    public basePage(WebDriver Driver) {
		
		this.driver=Driver;
	}
	
	public void setWeight(WebDriverWait WaitFor) {
		
		this.waitFor=WaitFor;
	}
	
	public WebElement waitNFind(String Locator) {
		WebElement element = waitFor.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
		return element;
	}
	
	
	
	

}
