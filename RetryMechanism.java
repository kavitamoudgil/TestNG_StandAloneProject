package project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryMechanism {

	@Test(retryAnalyzer = project.TestNG_RetryMechanism.class)
    public void falseAssertion() {
		
		String actual = "Test";
		String expected = "test";
		System.out.println("This test explains Retry Mechanism");
		Assert.assertEquals(actual, expected, " This Test failed");
	
}
}