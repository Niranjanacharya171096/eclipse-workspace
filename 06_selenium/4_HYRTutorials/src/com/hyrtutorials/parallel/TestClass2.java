package com.hyrtutorials.parallel;

import org.testng.annotations.Test;

public class TestClass2 {
  @Test
  public void testMethod1() {
    System.out.println("TC2 >> tM1 >> " +Thread.currentThread().getId());
  }

  @Test
  public void testMethod2() {
    System.out.println("TC2 >> tM2 >> " +Thread.currentThread().getId());
  }

  @Test
  public void testMethod3() {
    System.out.println("TC2 >> tM3 >> " +Thread.currentThread().getId());
  }
}