package TestProject_Maven.TestProject_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleLaunchTest {
	
	private static WebDriver driver;
	
	@BeforeMethod
	public void BeforeLauch()
	{
		 System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test(enabled=false)
	public void GoogleLaunchTest()
	{
		driver.get("https://www.google.com");
		System.out.println("Title is " + driver.getTitle() + " with Thread Id --" + Thread.currentThread().getId());
		driver.quit();
	}
	
	@Test(enabled=false)
  	public void FacebookLaunchTest() {
	 	driver.get("https://www.facebook.com");
		System.out.println("Title is " + driver.getTitle()  + " with Thread Id --" + Thread.currentThread().getId());
		driver.quit();
	}
}
