package com.org.deva.testPgm02.samplePgm01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        FirefoxDriverManager.getInstance().setup();
    	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "dev/null");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
		String BaseUrl,BaseTitle;
		
		BaseUrl="";
		BaseTitle="";
		
		try {
		driver.get(BaseUrl);
//		BaseTitle=driver.getTitle();
	
		if(!BaseTitle.equalsIgnoreCase(driver.getTitle())) {
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
    }
}
