package allTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class HomePageTest {
	
	BaseTest instance =BaseTest.getInstance();
	
	@Test
	public void titleValidation() {
		instance.getDriver("chrome");
		instance.getHomePage().url();
		String title=instance.getHomePage().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Target : Expect More. Pay Less.");
		
	}
	
	@Test
	public void validateLaptop() throws InterruptedException {
		instance.getDriver("chrome");
		instance.getHomePage().url();
		instance.getHomePage().searching();
		Thread.sleep(2000);
		String actual=instance.getHomePage().searchText();
		Assert.assertEquals(actual, "laptop");
	}
	@AfterClass
	public void tearDown() {
		instance.driver.close();
	}
	

}
