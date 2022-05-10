package project;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_SkipTestcases {

	boolean data = true;

	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("This is first test to be skipped");
	}

	@Test
	public void skipTest2() {
		System.out.println("This is second test to be skipped");
		throw new SkipException("This test needs to be skipped");
	}

	@Test
	public void skipTest3() {

		if (data == true) {
			System.out.println("This test should be executed");
		} 
		else 		
		{
			System.out.println("This is the third test to be skipped");
			throw new SkipException("This is the third test to be skipped");
		}
	}

}
