package com.selenium.java;

import org.testng.annotations.Test;

public class P46_TestNG_Groups {
  @Test (groups = "compose")
  public void test_1() {
    System.out.println("test1");
  }
  @Test (groups = "logout")
  public void test_2() {
    System.out.println("test2");
  }
  @Test (groups = "inbox")
  public void test_3() {
    System.out.println("test3");
  }
  @Test (groups = "compose")
  public void test_4() {
    System.out.println("test4");
  }
  @Test (groups = "logout")
  public void test_5() {
    System.out.println("test5");
  }
  @Test (groups = "inbox")
  public void test_6() {
    System.out.println("test6");
  }
}