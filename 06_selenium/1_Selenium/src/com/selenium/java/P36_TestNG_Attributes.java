package com.selenium.java;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class P36_TestNG_Attributes {
  @Test 
  public void login() {
    Assert.fail();
    System.out.println("login success");
  }
  @Test (invocationCount = 3)
  public void compose() {
    System.out.println("compose success");
  }
  @Test (enabled = false) 
  public void inbox() {
    System.out.println("inbox success");
  }
  @Test (dependsOnMethods = "login", alwaysRun = true)
  public void logout() {
    System.out.println("logout success");
  }
  @Test(timeOut = 1000) 
  public void delete() throws InterruptedException { 
  System.out.println("delete success"); 
  Thread.sleep(5000); //not required, just to fail the Test
  } 
  @Test(timeOut = 1000, expectedExceptions = ThreadTimeoutException.class) 
  public void remove() throws InterruptedException { 
  System.out.println("remove success"); 
  Thread.sleep(5000); //not required, just to fail the Test
  } 
}