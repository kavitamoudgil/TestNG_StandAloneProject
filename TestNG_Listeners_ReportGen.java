package project;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNG_Listeners_ReportGen implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is :" + result.getName());
		System.out.println("Test case is starting");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("This test failed and screenshot is captured");
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Status of execution is " + result.getStatus());
	}
	
}
