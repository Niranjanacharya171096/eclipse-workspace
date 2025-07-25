package _04_testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(P162_CustomListener1.class)
public class P162_TestNG_ListenersTest1 {

	@BeforeClass
	public void setUp() {
		System.out.println("Code in before class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("Code in after class");
	}

	@Test
	public void testMethod1() {
		System.out.println("Code in testMethod1");
		Assert.assertTrue(true);
	}

	@Test
	public void testMethod2() {
		System.out.println("Code in testMethod2");
		Assert.assertTrue(false);
	}
}
