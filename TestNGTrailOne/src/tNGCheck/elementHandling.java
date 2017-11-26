package tNGCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementHandling {
	public WebElement element;
	public WebDriverWait waitTill;
	public WebDriver ffDriver;
	public WebElement getElement() {
		return element;
	}
	public void setElement(WebElement element) {
		this.element = element;
	}
	public WebDriverWait getWaitTill() {
		return waitTill;
	}
	public void setWaitTill(WebDriverWait waitTill) {
		this.waitTill = waitTill;
	}
	public WebDriver getFfDriver() {
		return ffDriver;
	}
	public void setFfDriver(WebDriver ffDriver) {
		this.ffDriver = ffDriver;
	}
	

}
