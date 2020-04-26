package TestProject_Maven.TestProject_Maven;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingNewClass {
	private WebDriver driver;
	 DesiredCapabilities capabilities;
	
	@BeforeMethod
	public void BeforeLauch(Method method) throws MalformedURLException
	{
		String sauceUserName = "rajesh91bhatia";
	    String sauceAccessKey = "de2e2655-e323-4109-9233-a6b65890b4ac";

	    /**
	     * In this section, we will configure our test to run on some specific
	     * browser/os combination in Sauce Labs
	     */
	    capabilities = new DesiredCapabilities();

	    //set your user name and access key to run tests in Sauce
	    capabilities.setCapability("username", sauceUserName);

	    //set your sauce labs access key
	    capabilities.setCapability("accessKey", sauceAccessKey);

	    //set browser to Safari
	    capabilities.setCapability("browserName", "FireFox");

	    //set operating system to macOS version 10.13
	    capabilities.setCapability("platform", "Windows 10");

	    //set the browser version to 11.1
	    capabilities.setCapability("version", "75");

	    	    
	  //set your test case name so that it shows up in Sauce Labs
	    capabilities.setCapability("name", method.getName());

	    driver = new RemoteWebDriver(new URL("https://ondemand.saucelabs.com:443/wd/hub"), capabilities);
	}
	
	@Test(priority=0)
	public void GoogleLaunchTest()
	{
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Boolean result=driver.getTitle().equalsIgnoreCase("google");
		if (result){
		      ((JavascriptExecutor)driver).executeScript("sauce:job-result=passed");
		    }
		    else {
		      ((JavascriptExecutor)driver).executeScript("sauce:job-result=failed");
		}
		driver.quit();
	}
	
	@Test(priority=1)
 	public void FacebookLaunchTest() {
		
	 	driver.get("https://www.facebook.com");
	 	System.out.println(driver.getTitle());
	 	Boolean result=driver.getTitle().contains("Facebook");
		if (result){
		      ((JavascriptExecutor)driver).executeScript("sauce:job-result=passed");
		    }
		    else {
		      ((JavascriptExecutor)driver).executeScript("sauce:job-result=failed");
		}
		driver.quit();
	}
}
