package com.hyrtutorials.parallel;

import org.testng.annotations.Test;

public class TestClass7 {
  @Test
  public void testMethod1() {
    System.out.println("TC7 >> tM1 >> " +Thread.currentThread().getId());
  }

  @Test
  public void testMethod2() {
    System.out.println("TC7 >> tM2 >> " +Thread.currentThread().getId());
  }

  @Test
  public void testMethod3() {
    System.out.println("TC7 >> tM3 >> " +Thread.currentThread().getId());
  }
  @Test
  public void testMethod5() {
    System.out.println("TC7 >> tM5 >> " +Thread.currentThread().getId());
  }

  @Test
  public void testMethod6() {
    System.out.println("TC7 >> tM6 >> " +Thread.currentThread().getId());
  }

  @Test
  public void testMethod7() {
    System.out.println("TC7 >> tM7 >> " +Thread.currentThread().getId());
  }

}