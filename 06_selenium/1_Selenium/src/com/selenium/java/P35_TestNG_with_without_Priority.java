package com.selenium.java;

import org.testng.annotations.Test;

public class P35_TestNG_with_without_Priority {
  @Test (priority = 0)
  public void d() {
    System.out.println("D");
  }
  @Test
  public void b() {
    System.out.println("B");
  }
  @Test (priority = 1)
  public void c() {
    System.out.println("C");
  }
  @Test (priority = -4)
  public void a() {
    System.out.println("A");
  }
}
