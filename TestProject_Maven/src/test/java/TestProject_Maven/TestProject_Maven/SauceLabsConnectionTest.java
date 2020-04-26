package TestProject_Maven.TestProject_Maven;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsConnectionTest {
	
	 private WebDriver driver;
  @Test(enabled=false)
  public void TestChrome() throws MalformedURLException {
	  
	  String sauceUserName = "rajesh91bhatia";
	    String sauceAccessKey = "de2e2655-e323-4109-9233-a6b65890b4ac";

	    /**
	     * In this section, we will configure our test to run on some specific
	     * browser/os combination in Sauce Labs
	     */
	    DesiredCapabilities capabilities = new DesiredCapabilities();

	    //set your user name and access key to run tests in Sauce
	    capabilities.setCapability("username", sauceUserName);

	    //set your sauce labs access key
	    capabilities.setCapability("accessKey", sauceAccessKey);

	    //set browser to Safari
	    capabilities.setCapability("browserName", "Chrome");

	    //set operating system to macOS version 10.13
	    capabilities.setCapability("platform", "Windows 10");

	    //set the browser version to 11.1
	    capabilities.setCapability("version", "81");

	    //set your test case name so that it shows up in Sauce Labs
	    capabilities.setCapability("name", "TestSauceLabsConnectionwithChrome");

	    driver = new RemoteWebDriver(new URL("https://ondemand.saucelabs.com:443/wd/hub"), capabilities);

	    //navigate to the url of the Sauce Labs Sample app
	    driver.navigate().to("https://www.google.com");

	    
	    String SearchLocator=".//input[@title='Search']";
	    //Assert that the inventory page displayed appropriately
	    Boolean result = driver.findElements(By.xpath(SearchLocator)).size() > 0;
	    assertTrue(result);

	    
	    if (result){
	      ((JavascriptExecutor)driver).executeScript("sauce:job-result=passed");
	    }
	    else {
	      ((JavascriptExecutor)driver).executeScript("sauce:job-result=failed");
	    }
	    driver.quit();
  }
  @Test(enabled=false)
  public void TestSafari() throws MalformedURLException {
	  
	  String sauceUserName = "rajesh91bhatia";
	    String sauceAccessKey = "de2e2655-e323-4109-9233-a6b65890b4ac";

	    /**
	     * In this section, we will configure our test to run on some specific
	     * browser/os combination in Sauce Labs
	     */
	    DesiredCapabilities capabilities = new DesiredCapabilities();

	    //set your user name and access key to run tests in Sauce
	    capabilities.setCapability("username", sauceUserName);

	    //set your sauce labs access key
	    capabilities.setCapability("accessKey", sauceAccessKey);

	    //set browser to Safari
	    capabilities.setCapability("browserName", "Firefox");

	    //set operating system to macOS version 10.13
	    capabilities.setCapability("platform", "Windows 10");

	    //set the browser version to 11.1
	    capabilities.setCapability("version", "75");

	    //set your test case name so that it shows up in Sauce Labs
	    capabilities.setCapability("name", "TestSauceLabsConnectionwithFireFox");

	    driver = new RemoteWebDriver(new URL("https://ondemand.saucelabs.com:443/wd/hub"), capabilities);

	    //navigate to the url of the Sauce Labs Sample app
	    driver.navigate().to("https://www.google.com");

	    
	    String SearchLocator=".//input[@title='Search']";
	    //Assert that the inventory page displayed appropriately
	    Boolean result = driver.findElements(By.xpath(SearchLocator)).size() > 0;
	    assertTrue(result);

	    
	    if (result){
	      ((JavascriptExecutor)driver).executeScript("sauce:job-result=passed");
	    }
	    else {
	      ((JavascriptExecutor)driver).executeScript("sauce:job-result=failed");
	    }
	    driver.quit();
  }
  
}
