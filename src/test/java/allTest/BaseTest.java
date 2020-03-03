package allTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPages.HomePage;

public class BaseTest {
	private static BaseTest instance;
	WebDriver driver;
	HomePage homePage;
	
	//Advantage Singletone
	//For secuirty
	//Execution faster
	private BaseTest() {
		
	}
	//holding the all the classes creating in main package
	//this class is our base class...this the main engine
	public WebDriver getDriver(String driverValue) { 
		if (driver==null) {
		if (driverValue.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nurul\\eclipse-workspace\\TargetAutomation\\Browser\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if (driverValue.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\nurul\\eclipse-workspace\\TargetAutomation\\Browser\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	//class instance
	//if my class instance is null then i have to create new instance class
	public static BaseTest getInstance() {
		if (instance==null) { 
			instance=new BaseTest();
	}return instance;
	
}
	public HomePage getHomePage() {
		if (homePage==null) {
			homePage=new HomePage(driver);
		}
		return homePage;
	}
	
}
