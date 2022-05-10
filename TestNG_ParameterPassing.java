package project;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_ParameterPassing {

	@Parameters({"number"})
    @Test
    
	public void parameter(int number) {
		
		System.out.println("The number is:"+ number);
			}
	
}
	

