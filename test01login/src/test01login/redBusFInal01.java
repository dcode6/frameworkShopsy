package test01login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redBusFInal01 {
	
//	private static final String label1 = null;
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
	
	
	public static void main(String[] args) throws InterruptedException {
		
//		redBusFInal01 redBusFInal01Object = new redBusFInal01();
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Selenium\\geckodriver.exe");
		DesiredCapabilities capab = DesiredCapabilities.firefox();
		capab.setCapability("marionette", true);
		foxDriver = new FirefoxDriver();
		waitTill=new WebDriverWait(foxDriver, 30, 1000);
//		foxDriver.manage().window().maximize();
		foxDriver.manage().deleteAllCookies();
		Thread.sleep(5000);
		foxDriver.navigate().refresh();
		String baseUrl = "https://www.redbus.in";
		try {
		foxDriver.get(baseUrl);
		String titleInfo = foxDriver.findElement(By.xpath("//meta[@property='og:url']")).getAttribute("content");
//		System.out.println((titleInfo.equalsIgnoreCase("www.redbus.in")));
		if(!(titleInfo.equalsIgnoreCase("www.redbus.in"))){
			try {
				foxDriver.navigate().refresh();
				titleInfo = foxDriver.findElement(By.xpath("//meta[@property='og:url']")).getAttribute("content");
				if(!(titleInfo.equalsIgnoreCase("www.redbus.in"))) {
//				   label1;
				}
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
				}
		waitTill.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search']")));
		System.out.println(titleInfo);
//		System.out.println(titleInfo.contentEquals("Book Bus Travels, AC Volvo Bus, Hotels & Bus Hire - redBus\r\n" +""));
//		if(titleInfo.contentEquals("Book Bus Travels, AC Volvo Bus, Hotels & Bus Hire - redBus\r\n"))
//		Alert notiAlert = waitTill.until(ExpectedConditions.alertIsPresent());
//		notiAlert.dismiss();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Thread.sleep(10000);
		
		foxDriver.close();
		
		

		
	}

}
