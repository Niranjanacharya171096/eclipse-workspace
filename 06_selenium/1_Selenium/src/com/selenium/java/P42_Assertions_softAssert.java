package com.selenium.java;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P42_Assertions_softAssert {
  @Test
  public void verifyPageTitle() {
    String expected_Title = "Google";
    String actual_Title = "Google1";

    SoftAssert softassert =  new SoftAssert();
    System.out.println("Test case execution  started");
    softassert.assertEquals(actual_Title, expected_Title);
    String expected_PageUrl = "google.com";
    String actual_PageUrl = "google.com1";
    softassert.assertEquals(expected_PageUrl, actual_PageUrl); //fails
    System.out.println("Test case after assertEquals fail"); //printed
    //above case fails but test case passes only if we don't use softassert.assertAll();
    softassert.assertAll(); //this is must to check all assert else test case passes irrespective of assert result
    //below code will be executed only if we don't use softassert.assertAll();
    System.out.println("Test case execution  finished"); //printed
  }
}
