package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FilterListStrings {
  public static void main(String[] args) {
    List<String> testCases = Arrays.asList("TC_Login", "Login_TC", "TC_SignUp", "TC_Payment_Validation",
        "Regression_TC");
    System.out.println("String starts with TC_ in " + testCases);
    filterByPrefix(testCases);

    List<String> strList = new ArrayList<>(List.of("fooabc", "bar", "testabc", "hello", "abcx"));
    System.out.println("\nString not ends with abc in " + strList);
    System.out.println(filterBySuffix(strList));
  }

  static void filterByPrefix(List<String> testCases) {
    for (int i = 0; i < testCases.size(); i++) {
      String strList = testCases.get(i);
      if (strList.length() < 15 && strList.startsWith("TC_")) {
        System.out.println(testCases.get(i));
      }
    }
  }

  static List<String> filterBySuffix(List<String> strList) {
    // Iterator<String> it = strList.iterator();
    // while(it.hasNext()) {
    // if((it.next()).endsWith("abc"))
    // it.remove();
    // }
    strList.removeIf(str -> str.length() >= 3 && str.endsWith("abc"));
    return strList;
  }
}
