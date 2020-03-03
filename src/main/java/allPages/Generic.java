package allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Generic {
	
	WebDriver driver;
	
	//I am trying to achieveing singletone concept 
	public Generic(WebDriver driver) {
		this.driver=driver;
	}
	
	//My generic class holding the all functionality of  
	public void getUrl(String url) {
		driver.get(url);
	}
	public void clickElement(String element) {
		driver.findElement(By.xpath(element)).click();
	}
	public void typeOnElement(String element, String value) {
		driver.findElement(By.xpath(element)).sendKeys(value, Keys.ENTER);
	}
	
	public String getText(String element) {
		return driver.findElement(By.xpath(element)).getText();
		
	}
	
	
}
