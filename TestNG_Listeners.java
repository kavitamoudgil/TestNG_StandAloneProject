package project;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is starting");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("This test failed and screenshot is captured");
		
	}
}
