package TestProject_Maven.TestProject_Maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ReportingTest {
  @Test
  public void f() {
	  System.out.println("Actual Test After Changes");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
