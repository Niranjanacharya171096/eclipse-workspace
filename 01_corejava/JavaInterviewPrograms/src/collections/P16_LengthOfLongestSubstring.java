package collections;

import java.util.HashSet;

public class P16_LengthOfLongestSubstring {
  public static void main(String[] args) {
    String str1 = "abcabcbb"; // Expected: "abc", length 3
    String str2 = "bbbbb"; // Expected: "b", length 1
    String str3 = "pwwkew"; // Expected: "wke", length 3
    String str4 = ""; // Expected: "", length 0

    System.out.println("Longest substring without repeating characters in str1: " + lengthOfLongestSubstring(str1)); // 3
    System.out.println("Longest substring without repeating characters in str2: " + lengthOfLongestSubstring(str2)); // 1
    System.out.println("Longest substring without repeating characters in str3: " + lengthOfLongestSubstring(str3)); // 3
    System.out.println("Longest substring without repeating characters in str4: " + lengthOfLongestSubstring(str4)); // 0
  }

  public static int lengthOfLongestSubstring(String str) {
    HashSet<Character> set = new HashSet<>();
    int maxLength = 0;
    int start = 0;
    int end = 0;

    while (end < str.length()) {
      char currentChar = str.charAt(end);
      if (!set.contains(currentChar)) {
        set.add(currentChar);
        maxLength = Math.max(maxLength, end - start + 1);
        end++;
        System.out.println("add=" + set.toString());
      } else {
        set.remove(str.charAt(start));
        start++;
        System.out.println("rem=" + set.toString());
      }
    }
    System.out.println(set.toString());
    return maxLength;
  }
}