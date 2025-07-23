package _04_testng;

import org.testng.annotations.DataProvider;

public class P159_TestData {

	@DataProvider(name = "inputs")
	public Object[][] getData() {
		return new Object[][] { { "bmw", "m3" }, { "audi", "a6" }, { "benz", "c300" } };
	}
}