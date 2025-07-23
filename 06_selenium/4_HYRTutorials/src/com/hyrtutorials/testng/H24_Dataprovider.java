package com.hyrtutorials.testng;

import org.testng.annotations.Test;

public class H24_Dataprovider {
  //  @Test(priority=1, dataProvider = "single")
  //  public void readSingleDimensionData(Integer i) {
  //    System.out.println(i);
  //    System.out.println("-----------");
  //  }
  //
  //  @DataProvider(name = "single")
  //  public Integer[] singleDimension() {
  //    Integer[] num = new Integer[] {
  //        1,
  //        2
  //    };
  //    return num;
  //  }
  //
  //  @Test(priority=2, dataProvider = "two")
  //  public void readTwoDimensionData(String[] str) { //String uname, String pwd) {
  //    System.out.println(str[0]+">>"+str[1]);
  //    //    System.out.println(uname+">>"+pwd);
  //    for (int i = 0; i < str.length; i++) {
  //      System.out.println(str[i]);
  //    }
  //    System.out.println("-----------");
  //  }
  //
  //  @DataProvider(name = "two")
  //  public String[][] twoDimension() {
  //    String[][] str = new String[][] {
  //      {"abc", "123", "def123"},// calls readTwoDimensionData, 3times for() iterates
  //      {"xyz", "789"}// calls readTwoDimensionData, 2times for() iterated
  //    };
  //    return str;
  //  }
  //
  //  @Test(priority=3, dataProvider = "differentData")
  //  public void readdifferentDataTypes(Object obj) {
  //    System.out.println(obj);
  //    System.out.println("-----------");
  //  }
  //
  //  @DataProvider(name = "differentData")
  //  public Object[] differentDataTypes() {
  //    Object[] obj = new Object[] {3, "Hello"};
  //    return obj;
  //  }
  //
  //  @Test(priority=4, dataProvider = "iteratorObjects")
  //  public void readIteratorObject(String obj) {
  //    System.out.println(obj);
  //    System.out.println("-----------");
  //  }
  //
  //  @DataProvider(name = "iteratorObjects")
  //  public Iterator<String> iteratorObject() {
  //    List<String> obj = new ArrayList<>();
  //    obj.add("bunny");
  //    obj.add("buddy");
  //    return obj.iterator(); //we can type cast if method signature is List<String>
  //  }
  //
  //  @Test(priority=5, dataProvider = "iteratorObject[]")
  //  public void readIteratorObjectArray(String[] obj) {
  //    System.out.println(obj[0]+">>"+obj[1]);
  //    System.out.println("-----------");
  //  }
  //
  //  @DataProvider(name = "iteratorObject[]")
  //  public Iterator<String[]> iteratorObjectArray() {
  //    Set<String[]> obj = new HashSet<>();
  //    obj.add(new String[] {"bunny", "buddy"});
  //    obj.add(new String[] {"sayeed", "niranjan"});
  //    return obj.iterator();
  //  }

  @Test(priority=6, dataProvider = "indiciesData", dataProviderClass = H24_Dataprovider_Supplier.class)
  public void readIndiciesData(String str) {
    System.out.println(str); //abc, def123
  }

  @Test(priority=6, dataProvider = "indiciesData2", dataProviderClass = H24_Dataprovider_Supplier.class)
  public void readIndiciesData2(String str) {
    System.out.println(str); //abc, def123
  }
  //  @DataProvider(indices = {0, 2})
  //  public String[] indiciesData() {
  //    String[] str = new String[] {
  //      "abc", "123", "abc123"
  //    };
  //    return str;
  //  }
}