package com.selenium.java;

import org.testng.annotations.Test;

@Test(groups = "all")
public class P47_TestNG_Groups {
  @Test(groups = { "smoke", "regression" }, priority = 1)
  public void login() {
    System.out.println("smoke, regression = 1");
  }

  @Test(groups = { "sanity", "functional" }, priority = 10)
  public void logout() {
    System.out.println("sanity, functional = 10");
  }

  @Test(groups = { "sanity" }, priority = 4)
  public void search() {
    System.out.println("sanity = 4");
  }

  @Test(groups = { "smoke" }, priority = 7)
  public void addVendor() {
    System.out.println("smoke = 7");
  }

  @Test(groups = { "regression" }, priority = 3)
  public void advancedSearch() {
    System.out.println("regression = 3");
  }

  @Test(groups = { "sanity", "smoke" }, priority = 5)
  public void prepaidRecharge() {
    System.out.println("sanity, smoke = 5");
  }

  @Test(groups = { "regression" }, priority = 6)
  public void billPayments() {
    System.out.println("regression = 6");
  }

  @Test(groups = { "functional" }, priority = 2)
  public void myProfile() {
    System.out.println("functional = 2");
  }

  @Test(priority = 8)
  public void cart() {
    System.out.println("cart = 8");
  }
}
