package com.selenium.java;

import org.testng.annotations.Test;

public class P34_TestNG_Priority {
  @Test (priority = 2)
  public void d() {
    System.out.println("D");
  }
  @Test (priority = 3)
  public void b() {
    System.out.println("B");
  }
  @Test (priority = 1)
  public void c() {
    System.out.println("C");
  }
  @Test (priority = 4)
  public void a() {
    System.out.println("A");
  }
}