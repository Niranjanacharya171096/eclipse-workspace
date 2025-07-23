package com.hyrtutorials.testng;

import org.testng.annotations.DataProvider;

public class H24_Dataprovider_Supplier {
  @DataProvider(indices = {0, 2})
  public String[] indiciesData() {
    String[] str = new String[] {
        "abc", "123", "def123"
    };
    return str;
  }

  @DataProvider(indices = {0, 1})
  public String[] indiciesData2() {
    String[] str = new String[] {
        "lmn", "456", "xyz456"
    };
    return str;
  }
}