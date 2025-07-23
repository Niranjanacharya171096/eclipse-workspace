package com.selenium.java;

import org.testng.annotations.Test;

public class P49_TestNG_ParallelTest_Classes1 {
  @Test
  public void testCase1() {
    long id = Thread.currentThread().getId();
    System.out.println("Test case 1 is successful" + " Thread id :" + id);
  }

  @Test
  public void testCase2() {
    long id = Thread.currentThread().getId();
    System.out.println("Test case 2 is successful" + " Thread id :" + id);
  }

  @Test
  public void testCase3() {
    long id = Thread.currentThread().getId();
    System.out.println("Test case 3 is successful" + " Thread id :" + id);
  }

  @Test
  public void testCase4() {
    long id = Thread.currentThread().getId();
    System.out.println("Test case 4 is successful" + " Thread id :" + id);
  }
}