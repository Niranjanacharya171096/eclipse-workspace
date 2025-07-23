package com.hyrtutorials.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerClass.class)
public class TestClass1 {
  @Test(priority = 1)
  public void testMethod1() {
    System.out.println("==i'm inside testMethod1==");
  }
  @Test(priority = 2)
  public void testMethod2() {
    System.out.println("==i'm inside testMethod2==");
    Assert.assertTrue(false);
  }
  @Test(priority = 3, timeOut = 1000)
  public void testMethod3() throws Exception {
    Thread.sleep(2000);
    System.out.println("==i'm inside testMethod3==");
  }
  @Test(priority = 4, dependsOnMethods = "testMethod3")
  public void testMethod4() {
    System.out.println("==i'm inside testMethod4==");
  }
}