package test01login;

import java.awt.List;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redBusDirect01 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
        WebDriver Driver;
		String baseUrl = "https://www.redbus.in";
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Selenium\\geckodriver.exe");
		  Driver = new FirefoxDriver();
		  Driver.manage().deleteAllCookies();
		  try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  Driver.navigate().refresh();
		 // WebDriverWait waitA = new WebDriverWait(Driver, 20);
		  Driver.get(baseUrl);
		  Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  //waitA.until(ExpectedConditions.alertIsPresent());
		  //String alertData = Driver.switchTo().alert().getText();
		 // System.out.println(alertData);
		  
		    WebElement rSrc = Driver.findElement(By.xpath("//*[@id=\"src\"]"));
			WebElement rDest = Driver.findElement(By.xpath("//*[@id=\"dest\"]"));
			rSrc.sendKeys("Chennai");
			Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			Select srcSelect;
//			WebElement dpdn = Driver.findElement(By.cssSelector("#search > div > div.fl.search-box.clearfix > div > ul"));
			rDest.sendKeys("Coimbatore");
			WebElement onclendr = Driver.findElement(By.cssSelector("#onward_cal"));
			onclendr.click();
			LocalDate datee= LocalDate.now();
			int pdate = datee.getDayOfMonth();
			
//			List <WebElement> DateList = Driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]"));
			
			
//			WebElement nxtCldrLink = Driver.findElement(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr.rb-monthHeader > td.next"));
//			WebElement prv
			
			
	}

}
