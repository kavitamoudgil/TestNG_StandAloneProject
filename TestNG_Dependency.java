package project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Dependency {

	@Test
	public void userRegistration() {
		
		System.out.println("This is first test");
		Assert.assertTrue(false);
	}
	
	
	@Test(dependsOnMethods="userRegistration",alwaysRun=true)
	public void userSearch() {
		System.out.println("This is dependent on User Registration test");
	}
	
	@Test
	public void independentTest() {
		
		System.out.println("This is first independent test");
	}
	
	
	@Test
	public void independentTest1() {
		
		System.out.println("This is second independent test");
	}
	
	
}
