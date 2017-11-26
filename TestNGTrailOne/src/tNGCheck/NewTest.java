package tNGCheck;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver ffDriver;
	WebDriverWait waitTill;
	
  @Test(dataProvider="searchData",groups="a")
  public void searchFind(String url, String urlTitle) {
	  ffDriver.get(url);
	  waitTill.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='lst-ib']")));
	  Assert.assertEquals(urlTitle, ffDriver.getTitle());
}
  @BeforeTest(groups={"a","b"})
  public void beforeTest() {
	 System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	 System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true" );
	 System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
	 ffDriver=new FirefoxDriver();
	 ffDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 ffDriver.manage().deleteAllCookies();
	 ffDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 ffDriver.navigate().refresh();
	 waitTill=new WebDriverWait(ffDriver, 30, 1000);
  }

  @AfterTest(groups={"a","b"})
  public void afterTest() {
		 ffDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 ffDriver.close();

  }
  
  @DataProvider(name="searchData")
  public Object[][] getDataFromDataprocider(ITestContext grpData){
	  Object[][] groupreturn = null;
	  
	  for(String data:grpData.getExcludedGroups()){
		  switch (data) {
		  case "a":{
			groupreturn = new Object[][] {
				  
				  {"https://www.google.co.in/","Google"}  
			  };
		}	
		  break;
  }
		  break;
  }
	  return groupreturn;
}
  }