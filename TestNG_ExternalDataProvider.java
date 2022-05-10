package project;

import org.testng.annotations.Test;

public class TestNG_ExternalDataProvider {

	
	public class TestNG_DataProvider {

		@Test(dataProvider = "create",dataProviderClass=DataProviderExternal.class)
		public void test(String username, String Password) {
	 
			System.out.println(username + "  " + Password );
		
		}
}
}