package com.org.dapps.shopsyFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
	

    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait4 = new WebDriverWait(driver, 60, 1000);
		driver.get("http://quickiz.com/shopsy-v2.2/");
		WebElement langOkay = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content_geo']//input[@value='okay']")));
		langOkay.click();
		System.out.println(langOkay.getText());
//		WebElement currencyButton = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("[@id='currency_href' and text()=' USD']")));
//		System.out.println(currencyButton.getText());
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.close();
		
	}		

    	
 }
