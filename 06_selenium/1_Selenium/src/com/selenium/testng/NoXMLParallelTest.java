package com.selenium.testng;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NoXMLParallelTest {

  @DataProvider(name = "data", parallel = true)
  public Object[][] getData() {
    return new Object[][] {
      {"UserA", "PassA"},
      {"UserB", "PassB"},
      {"UserC", "PassC"}
    };
  }

  @Test(dataProvider = "data")
  public void testMethod(String username, String password) {
    System.out.println(Thread.currentThread().getName() + " - Executing test with: " + username + " | " + password);
  }
}
