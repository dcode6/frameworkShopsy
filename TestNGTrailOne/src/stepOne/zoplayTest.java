package stepOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class zoplayTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().refresh();
		
		driver.get("https://www.zoplay.com/contact/");
		
		
		
		Actions act= new Actions(driver);
		WebElement ele = driver.findElement(By.id("submit-form"));
		String str = driver.getWindowHandle();
		driver.switchTo().frame(0);
		WebElement e = driver.findElement(By.id("recaptcha-anchor"));
		e.click();
		
		Thread.sleep(20000);
		driver.switchTo().parentFrame();

		ele.click();
		Thread.sleep(20000);
		
driver.close();



	}

}
