package com.org.deva.testPgm02.samplePgm01;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
public class BasePage {
	public WebDriver driver;
//	SoftAssert softAssertion = new SoftAssert();
	public BasePage() {
//		FirefoxDriverManager.getInstance().setup();
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "dev/null");
//		this.driver = Driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().refresh();
	}
//@BeforeSuite
//@Parameters({"BaseUrl","BaseTitle"})
	public boolean gotoHomePage(String BaseUrl,String BaseTitle) {
		boolean flag = false;
		System.out.println(BaseUrl);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.get(BaseUrl);
	    if(BaseTitle.equalsIgnoreCase(driver.getTitle()))
	    	flag=true;
	    return flag;
	}

//@AfterSuite
public void closeBrowser() {
	driver.close();
}
	

}
