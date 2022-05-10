package project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assertions {

	@Test
	public void trueAssertion() {
		
		String actual = "Test";
		String expected = "Test";
		Assert.assertEquals(actual, expected);
		System.out.println("Test passed");
	}
	
	@Test
    public void falseAssertion() {
		
		String actual = "Test";
		String expected = "test";
		Assert.assertEquals(actual, expected, " This Test failed");
	
	}
	
}
