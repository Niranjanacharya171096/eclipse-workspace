package com.selenium.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P37_TestNG_BeforeAfterMethods {
  @Test
  public void b() {
    System.out.println("b");
  }
  @Test()
  public void a() {
    System.out.println("a");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("Before Method");
  }
  @AfterMethod
  public void afterMethod() {
    System.out.println("After Method");
  }
}