package stepOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTrailOne {
	
	public WebDriver Driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Selenium\\geckodriver.exe");
	  Driver = new FirefoxDriver();
	  Driver.manage().deleteAllCookies();
	  Driver.navigate().refresh();
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  String baseurl = "http://www.google.co.in";
	  Driver.get(baseurl);
	  String currentUrl = Driver.getTitle();
	  Assert.assertEquals(currentUrl, "Google");
	  Driver.quit();
	  
  }
}
