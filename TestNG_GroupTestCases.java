package project;

import org.testng.annotations.Test;

public class TestNG_GroupTestCases {
     
	@Test(groups ="sanity")
	public void groupTest1() {
	System.out.println("This is first test under sanity group");	
	}
	
	@Test(groups ="smoke")
	public void groupTest2() {
		System.out.println("This is first test under smoke group");			
	}
	
	@Test(groups ="smoke")
	public void groupTest3() {
		System.out.println("This is second test under smoke group");			
	}
	
	@Test(groups ="smoke")
	public void groupTest4() {
		System.out.println("This is third test under smoke group");		
	}
}
