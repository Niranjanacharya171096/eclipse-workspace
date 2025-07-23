package com.qspider.java;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Q24_TestNG_Parameter {
  @BeforeMethod
  public void precondition(XmlTest x) {
    String s = x.getParameter("state");
    Reporter.log(s, true);
  }

  @Test
  public void testA(XmlTest x) {
    String c = x.getParameter("city");
    Reporter.log(c, true);
  }

  @AfterMethod
  public void postCondition(XmlTest x) {
    String a = x.getParameter("area");
    Reporter.log(a, true);
  }
}
