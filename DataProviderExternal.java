package project;

import org.testng.annotations.DataProvider;

public class DataProviderExternal {

	
	@DataProvider(name = "create")
	public Object[][] dataProvider() {

		return new Object[][] {

				{ "username", "password" }, { "username1", "password1" }

		};

	
}
}
