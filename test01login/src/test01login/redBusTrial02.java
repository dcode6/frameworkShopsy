package test01login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redBusTrial02 {
	
		static WebDriver foxDriver;
		static WebDriverWait waitTill;
		
		public WebElement waitNClick (WebDriver Driver, WebDriverWait waitTime, String xpathLocator){
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
		
		public boolean findnSelect(WebElement element, String tagSelector, String data) {
			try {
				 List<WebElement> elementList = element.findElements(By.tagName(tagSelector));
				 for(WebElement elementIn :elementList) {
//					 System.out.println(elementIn.getText());
					 if(elementIn.getText().equalsIgnoreCase(data)) {
						 elementIn.click();
						 break; 
					 }
				 }
				 return true;
			}
			catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			
		}
		

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		redBusTrial02 object1 = new redBusTrial02();
//		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Selenium\\geckodriver.exe");
//		DesiredCapabilities capab = DesiredCapabilities.firefox();
//		capab.setCapability("marionette", true);
		 System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		 System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true" );
//		 System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
		foxDriver = new FirefoxDriver();
		waitTill=new WebDriverWait(foxDriver, 30, 1000);
		
		foxDriver.manage().deleteAllCookies();
		Thread.sleep(5000);
		foxDriver.navigate().refresh();
		
		String baseUrl = "https://www.redbus.in";
		foxDriver.get(baseUrl);
		
		Thread.sleep(5000);
		String titleInfo = foxDriver.findElement(By.xpath("//meta[@property='og:url']")).getAttribute("content");
		if(!(titleInfo.equalsIgnoreCase("www.redbus.in"))){
			System.out.println("internet connectivity error or page not reachable");
		}
		waitTill.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search']")));
		
//		Actions actionObject = new Actions(foxDriver);
//		action.sendKeys(Keys.ESCAPE).build().perform();
//		Thread.sleep(10000);
		Robot roboObject = new Robot();
		roboObject.keyPress(KeyEvent.VK_ESCAPE);

//		
		 WebElement rSrc = object1.waitNClick(foxDriver, waitTill, "//*[@id=\"src\"]");
		 
//				 foxDriver.findElement(By.xpath("//*[@id=\"src\"]"));
//		 WebElement rDest = foxDriver.findElement(By.xpath("//*[@id=\"dest\"]"));
		 rSrc.sendKeys("c");
		 
		 
//		 robo.keyPress(KeyEvent.VK_ENTER);
		 
//		 foxDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement srcAutofil = waitTill.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//ul[@class='autoFill']"))));
//				 cssSelector("#search > div > div.fl.search-box.clearfix > div > ul"));
//		 Select selectObject = new Select(null);
		 
		 
		 List<WebElement> srcList = srcAutofil.findElements(By.tagName("li"));
		 for(WebElement elementIn :srcList) {
//			 System.out.println(elementIn.getText());
			 if(elementIn.getText().equalsIgnoreCase("chennai")) {
				 elementIn.click();
				 break;
				 
			 }
		 }
		 
		 WebElement rDest = object1.waitNClick(foxDriver, waitTill, "//*[@id='dest']");
		 rDest.sendKeys("c");
		 
		 foxDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement destAutofil = foxDriver.findElement(By.xpath("//ul[@class='autoFill']"));
//		 List<WebElement> destList = destAutofil.findElements(By.tagName("li"));
//		 for(WebElement elementIn :destList) {
////			 System.out.println(elementIn.getText());
//			 if(elementIn.getText().equalsIgnoreCase("coimbatore")) {
//				 elementIn.click();
//				 break;
//				 
//			 }
//		 }
		 object1.findnSelect(destAutofil, "li", "coimbatore");
		 
//		 object1.waitNClick(foxDriver, waitTill, "//*[@id='onward_cal']");
		 WebElement calTable = foxDriver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']"));
		 
//		 WebElement calPrev = foxDriver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']//td[@class='prev']"));
//		 WebElement calNext = foxDriver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']//td[@class='next']"));
//		 WebElement monthYear = foxDriver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']//td[@class='monthTitle']"));

			Date presentDate = new Date();
			SimpleDateFormat dd = new SimpleDateFormat("dd");
			Calendar calenderObject = Calendar.getInstance();
			calenderObject.setTime(presentDate);
			calenderObject.add(Calendar.DATE, 1);

		 
		List<WebElement> calDate = calTable.findElements(By.tagName("td"));
		for(WebElement datain : calDate) {
			if(datain.getText().equalsIgnoreCase(dd.format(calenderObject.getTime()))) {
			//System.out.println(datain.getText());
				datain.click();
		}
		}
		
		 object1.waitNClick(foxDriver, waitTill, "//*[@id='search_btn']");
		 
		 waitTill.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id='__ta_notif_frame_0']")));
		 foxDriver.switchTo().frame("__ta_notif_frame_0");
		 object1.waitNClick(foxDriver, waitTill, "//*[@class='close']");
		 foxDriver.switchTo().defaultContent();

		 
		Thread.sleep(30000);
		
		foxDriver.close();



	}

}
