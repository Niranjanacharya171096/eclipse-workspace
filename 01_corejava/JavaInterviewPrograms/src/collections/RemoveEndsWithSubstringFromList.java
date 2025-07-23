package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RemoveEndsWithSubstringFromList {
  public static void main(String[] args) {
    // String[] strArr = {"helloWorldabc","test123"};
    // List<String> strList = Arrays.asList(strArr);
    List<String> strList = Arrays.asList("helloWorldabc", "test123", "testabctuotptpt", "googleabc", "abcyahooabc");
    // = new ArrayList<>();
    // strList.add("helloWorldabc");
    // strList.add("test123");

    String subStr = "abc";
    System.out.println("Remove substr from " + strList);
    List<String> resList = new ArrayList<>();

    for (String str : strList) {
      if (str.endsWith(subStr)) { // .contains(subStr) //.startsWith(subStr)
        // System.out.println(str);
        resList.add(str.replace(subStr, ""));
        // resList.add(str.substring(0, str.length() - subStr.length())); // -3));
      } // else {
        // resList.add(str);
        // }
    }
    System.out.println(resList);
  }
}
