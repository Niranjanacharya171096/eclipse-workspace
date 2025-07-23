package com.selenium.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P41_Assertions_HardAssert {
  @Test
  public void verifyPageTitle() {
    String expected_Title = "Google";
    String actual_Title = "Google1";

    System.out.println("Test case execution  started");

    Assert.assertEquals(actual_Title, expected_Title);
    //fails and below code won't be executed
    System.out.println("Test case execution  finished");
  }
}
