package project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_ReportGeneration {

	@Test
	public void reporterTest1() {
		
		Reporter.log("Test 1 report");
		System.out.println("Test 1 report");
	}
	
	@Test
	public void reporterTest2() {
		System.out.println("Test 2 report");
	}
	
	@Test
	public void reporterTest3() {
		System.out.println("Test 3 report");
	}
	
	@Test
	public void reporterTest4() {
		System.out.println("Test 4 report");
	}
}
