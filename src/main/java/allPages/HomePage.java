package allPages;

import org.openqa.selenium.WebDriver;

//replica of webpage
public class HomePage extends Generic {
	
	String search = "//input[@id='search']";
	String searchText ="//span[contains(text(),'laptop')]";
	
		
	public HomePage (WebDriver driver) {
		super(driver);
	}
	
	public void url() {
		getUrl("https://www.target.com/");
	}
	
	//validation
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void searching() {
		typeOnElement(search, "laptop");
	}
	
	public String searchText() {
		return getText(searchText);
		
	}
	
}
