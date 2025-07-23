package com.selenium.java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P39_TestNG_BeforeAfterTest {
  @Test
  public void test_1() {
    System.out.println("test1");
  }
  @Test
  public void test_2() {
    System.out.println("test2");
  }
  @BeforeMethod
  public void test_3() {
    System.out.println("test3-BeforeMethod");
  }
  @AfterMethod
  public void test_4() {
    System.out.println("test4-AfterMethod");
  }
  @AfterClass
  public void test_5() {
    System.out.println("test5-AfterClass");
  }
  @BeforeClass
  public void test_6() {
    System.out.println("test6-BeforeClass");
  }
  @AfterTest
  public void test_7() {
    System.out.println("test7-AfterTest");
  }
  @BeforeTest
  public void test_8() {
    System.out.println("test8-BeforeTest");
  }
}