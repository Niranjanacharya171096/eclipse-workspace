package com.hyrtutorials.parallel;

import org.testng.annotations.Test;

public class TestClass6 {
  @Test
  public void testMethod1() {
    System.out.println("TC6 >> tM1 >> " +Thread.currentThread().getId());
  }

  @Test
  public void testMethod2() {
    System.out.println("TC6 >> tM2 >> " +Thread.currentThread().getId());
  }

  @Test
  public void testMethod3() {
    System.out.println("TC6 >> tM3 >> " +Thread.currentThread().getId());
  }
}