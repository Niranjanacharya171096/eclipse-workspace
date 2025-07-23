package com.hyrtutorials.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//public class ITestListenerClass extends TestListenerAdapter {
public class ITestListenerClass implements ITestListener {
  @Override
  public void onTestStart(ITestResult result) {
    System.out.println("onTestMethodStart");
  }
  @Override
  public void onTestSuccess(ITestResult result) {
    System.out.println("onTestMethodSuccess");
  }
  @Override
  public void onTestFailure(ITestResult result) {
    System.out.println("onTestMethodFailure");
  }
  @Override
  public void onTestSkipped(ITestResult result) {
    System.out.println("onTestMethodSkipped");
  }
  @Override
  public void onTestFailedWithTimeout(ITestResult result) {
    System.out.println("onTestMethodFailedWithTimeout");
  }
  @Override
  public void onStart(ITestContext context) {
    System.out.println("Test - onStart");
  }
  @Override
  public void onFinish(ITestContext context) {
    System.out.println("Test - onFinish");
  }
}