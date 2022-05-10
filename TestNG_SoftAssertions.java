package project;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAssertions {
    
	@Test
	public void softAssertion() {
		String actual = "Test";
		String expected = "test";
		SoftAssert sa = new SoftAssert();
		System.out.println("printing before assertion");
		sa.assertEquals(actual, expected);
		System.out.println("printing after test failed");
		sa.assertAll();
		
	}
}
