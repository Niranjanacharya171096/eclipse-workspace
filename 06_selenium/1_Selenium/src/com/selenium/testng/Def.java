package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Def {
  @Test
  public void test_1() {
    System.out.println("Def test1-no priority = 0");
  }

  @Test(priority = 2)
  public void test_2() {
    System.out.println("Def test2-priority 2");
  }

  @BeforeMethod
  public void test_3() {
    System.out.println("Def test3-BeforeMethod");
  }

  @AfterMethod
  public void test_4() {
    System.out.println("Def test4-AfterMethod");
  }

  @AfterClass
  public void test_5() {
    System.out.println("Def test5-AfterClass");
  }

  @BeforeClass
  public void test_6() {
    System.out.println("Def test6-BeforeClass");
  }

  @AfterTest
  public void test_7() {
    System.out.println("Def test7-AfterTest");
  }

  @BeforeTest
  public void test_8() {
    System.out.println("Def test8-BeforeTest");
  }

  @BeforeSuite
  public void test_9() {
    System.out.println("Def test9-BeforeSuite");
  }

  @AfterSuite
  public void test_10() {
    System.out.println("Def test10-AfterSuite");
  }

  @Test(priority = 2)
  public void test_11() {
    System.out.println("Def test11-priority 2");
  }

  @Test(priority = -1)
  public void test_12() {
    System.out.println("Def test12-priority -1");
  }

  @Test(priority = 1)
  public void test_13() {
    System.out.println("Def test13-priority 1");
  }
}
