package _04_testng;

import org.testng.annotations.Test;

public class P141_TestNG_TestAnnotation {

	@Test
	public void testMethod1() {
		P142_SomeClassToTest obj = new P142_SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		System.out.println("Running Test -> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}

	@Test
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
	}
}