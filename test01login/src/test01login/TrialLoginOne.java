/**
 * 
 */
package test01login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Devakumar M
 *
 */
public class TrialLoginOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Selenium\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		//clear cookies
		Driver.manage().deleteAllCookies();
		Driver.navigate().refresh();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Driver.get("http://www.google.com");
		String exTitle = "google";
		String actTitle = Driver.getTitle();
		//System.out.println(actTitle);
		if((exTitle.equalsIgnoreCase(actTitle)))
		{
			WebElement srchBar = Driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
			srchBar.click();
			srchBar.sendKeys("gmail");	
			Driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).submit();
//			try {
//				Driver.wait(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			WebElement gmailLink = Driver.findElement(By.partialLinkText("Gmail"));
			gmailLink.click();
			Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("error");
		}
		

	}

}
