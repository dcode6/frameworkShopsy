package stepOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class datePick {
	public WebDriver Driver;
	
	public String srchEng = "https://www.google.com";
	public String gogle = "Google";
	
	
	@Test
	public void launchBrowser()
	{
		  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Selenium\\geckodriver.exe");
		  Driver = new FirefoxDriver();
		  Driver.manage().deleteAllCookies();
		  try {
			Driver.manage().wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  Driver.navigate().refresh();
		  WebDriverWait waitA = new WebDriverWait(Driver, 10);
		Driver.get(srchEng);
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(Driver.getTitle(), gogle);
		WebElement srchbar = waitA.until(ExpectedConditions.visibilityOf(Driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"))));
		srchbar.sendKeys("redbus");
		Driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).submit();
		
	}
	

}
