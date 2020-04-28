package TestProject_Maven.TestProject_Maven;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

public class TestNGCustomReport implements IReporter {

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		for(ISuite suite : suites)
		{
			String suitename = suite.getName();
			Map<String, ISuiteResult> suiteresults = suite.getResults();
			for(ISuiteResult sr : suiteresults.values())
			{
				ITestContext tc = sr.getTestContext();
				System.out.println("Passed for this Suite: " + tc.getPassedTests().getAllResults().size());
				System.out.println("Passed for this Suite: " + tc.getFailedTests().getAllResults().size());
			}
		}
		
	}

	
  
}
