package project;

import org.testng.annotations.Test;

public class TestNG_Annotations {
	
	@Test
	public void beforeSuite() {
		System.out.println("This method runs before all test cases inside TestNG suite");
	}
	
	@Test
	public void beforeTest() {
		System.out.println("This method runs before test tag in TestNG");
		}
	
	@Test
	public void beforeClass() {
		System.out.println("This method runs before execution of test methods in current class");
		}
	
	@Test
	public void beforeMethod() {
		System.out.println("This method runs before execution of each method annotated with test");
		}
	
	@Test
	public void test() {
		System.out.println("This method runs before execution of each method annotated with test");
		}
	
	@Test
	public void afterMethod() {
		System.out.println("This method runs after execution of each method annotated with test");
	    }
	
	@Test
	public void afterClass() {
		System.out.println("This method runs after execution of all test methods in the current class have run");
	    }
	
	@Test
	public void afterTest() {
		System.out.println("This method runs after execution of all test methods of available classes within testng.xml");
	    }
	
	@Test
	public void afterSuite() {
		System.out.println("This method runs after execution of all test methods in the suite");
	    }
	
	
	}
