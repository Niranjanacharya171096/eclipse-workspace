package _04_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P142_TestNG_Asserts {

	@Test
	public void testSum() {
		System.out.println("\nRunning Test -> testSum");
		P142_SomeClassToTest obj = new P142_SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		Assert.assertEquals(result, 3);
	}

	@Test
	public void testStrings() {
		System.out.println("\nRunning Test -> testStrings");
		String expectedString = "Hello World";
		P142_SomeClassToTest obj = new P142_SomeClassToTest();
		String result = obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
	}

	@Test
	public void testArrays() {
		System.out.println("\nRunning Test -> testArrays");
		int[] expectedArray = { 1, 2, 3, 4 };
		P142_SomeClassToTest obj = new P142_SomeClassToTest();
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
		System.out.println("\nEnd Test -> testArrays");
	}
}