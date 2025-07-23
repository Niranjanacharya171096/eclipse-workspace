package collections;

import java.util.HashMap;
import java.util.Map;

public class AnagramTwoStrings {
  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";

    // 1st way
    boolean flag = isAnagram(str1, str2);
    if (flag) {
      System.out.println(str1 + " & " + str2 + " are Anagram");
    } else {
      System.out.println(str1 + " & " + str2 + " are not Anagram");
    }
  }

  static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length())
      return false;

    Map<Character, Integer> map = new HashMap<>();

    for (char ch : str1.toCharArray())
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    System.out.println(map.toString());

    for (char ch : str2.toCharArray()) {
      if (!map.containsKey(ch) || map.get(ch) == 0)
        return false;
      map.put(ch, map.get(ch) - 1);
    }
    System.out.println(map.toString());

    return true;
  }
}
