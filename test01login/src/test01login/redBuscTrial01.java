package test01login;
	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class redBuscTrial01 {

		public static WebDriver Driver;
		
		public static String srchEng = "https://www.google.com";
		public static String gogle = "Google";
		
		
		public static void main(String[] args)
		{
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
			  WebDriverWait waitA = new WebDriverWait(Driver, 10);
			Driver.get(srchEng);
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Assert.assertEquals(Driver.getTitle(), gogle);
			
			WebElement srchbar = waitA.until(ExpectedConditions.visibilityOf(Driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"))));
			srchbar.sendKeys("redbus");
			Driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).submit();
			Driver.findElement(By.linkText("www.redbus.in")).click();
//			try {
//			Thread.sleep(10000);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		WebElement rSrc = Driver.findElement(By.xpath("//*[@id=\"src\"]"));
//		WebElement rDest = Driver.findElement(By.xpath("//*[@id=\"dest\"]"));
//		rSrc.sendKeys("chennai");
		
		
		
		
		
		}
		

	}

