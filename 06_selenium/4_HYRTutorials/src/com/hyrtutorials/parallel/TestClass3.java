package com.hyrtutorials.parallel;

import org.testng.annotations.Test;

public class TestClass3 {
  @Test
  public void testMethod1() {
    System.out.println("TC3 >> tM1 >> " +Thread.currentThread().getId());
  }

  @Test
  public void testMethod2() {
    System.out.println("TC3 >> tM2 >> " +Thread.currentThread().getId());
  }

  @Test
  public void testMethod3() {
    System.out.println("TC3 >> tM3 >> " +Thread.currentThread().getId());
  }
}