package com.selenium.java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P40_TestNG_BeforeAfterSuite2 {
  @Test
  public void test_1() {
    System.out.println("TestNG2 - 1-no priority = 0");
  }

  @Test(priority = 2)
  public void test_2() {
    System.out.println("TestNG2 - 2-priority = 2");
  }

  @BeforeMethod
  public void test_3() {
    System.out.println("TestNG2 - 3-BeforeMethod");
  }
  @BeforeMethod
  public void test_31() {
    System.out.println("TestNG2 - 31-BeforeMethod");
  }

  @AfterMethod
  public void test_4() {
    System.out.println("TestNG2 - 4-AfterMethod");
  }

  @AfterClass
  public void test_5() {
    System.out.println("TestNG2 - 5-AfterClass");
  }

  @BeforeClass
  public void test_6() {
    System.out.println("TestNG2 - 6-BeforeClass");
  }
  @AfterClass
  public void test_51() {
    System.out.println("TestNG2 - 51-AfterClass");
  }

  @BeforeClass
  public void test_61() {
    System.out.println("TestNG2 - 61-BeforeClass");
  }

  @AfterTest
  public void test_7() {
    System.out.println("TestNG2 - 7-AfterTest");
  }

  @BeforeTest
  public void test_8() {
    System.out.println("TestNG2 - 8-BeforeTest");
  }

  @BeforeTest
  public void test_81() {
    System.out.println("TestNG2 - 81-BeforeTest");
  }

  @BeforeSuite
  public void test_9() {
    System.out.println("TestNG2 - 9-BeforeSuite");
  }

  @AfterSuite()
  public void test_10() {
    System.out.println("TestNG2 - 10-AfterSuite");
  }

  @BeforeSuite
  public void test_91() {
    System.out.println("TestNG2 - 91-BeforeSuite");
  }

  @AfterSuite
  public void test_101() {
    System.out.println("TestNG2 - 101-AfterSuite");
  }

  //  @Test(priority = 2)
  //  public void test_11() {
  //    System.out.println("TestNG2 - 11-priority 2");
  //  }
  //
  //  @Test(priority = -1)
  //  public void test_12() {
  //    System.out.println("TestNG2 - 12-priority -1");
  //  }
  //
  //  @Test(priority = 1)
  //  public void test_13() {
  //    System.out.println("TestNG2 - 13-priority 1");
  //  }
}