package _04_testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P143_TestNG_SoftAsserts {

	@Test
	public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("\nRunning Test -> testSum");
		P143_SomeClassToTest obj = new P143_SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		sa.assertEquals(result, 2);
		System.out.println("\nLine after assert 1");
		sa.assertEquals(result, 3);
		System.out.println("\nLine after assert 2");
		sa.assertAll();
	}
}