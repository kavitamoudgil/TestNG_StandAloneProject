package project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {

	@Test(dataProvider = "create")
	public void test(String username, String Password) {
 
		System.out.println(username + "  " + Password );
	}

	@DataProvider(name = "create")
	public Object[][] dataProvider() {

		return new Object[][] {

				{ "username", "password" }, { "username1", "password1" }

		};

	}

}
