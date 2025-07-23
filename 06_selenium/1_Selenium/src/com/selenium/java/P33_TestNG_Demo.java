package com.selenium.java;

import org.testng.annotations.Test;

public class P33_TestNG_Demo {
  @Test
  public void positiveCredential2() {
    System.out.println("POSITIVE CREDENTIAL-2");
  }
  @Test
  public void positiveCredential1() {
    System.out.println("POSITIVE CREDENTIAL-1");
  }
  @Test//(dependsOnMethods = "b")
  public void a() {
    System.out.println("a");
  }
  @Test//(dependsOnMethods = "a")
  public void b() {
    System.out.println("b");
  }
}