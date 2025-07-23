package strings;

import java.util.Arrays;

public class P18_AnagramTwoStrings {
  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";

    // 1st way
    boolean flag = isAnagrams(str1, str2);
    if (flag) {
      System.out.println(str1 + " & " + str2 + " are Anagram");
    } else {
      System.out.println(str1 + " & " + str2 + " are not Anagram");
    }
    // 2nd way
    System.out.println(areAnagrams(str1, str2));
  }

  static boolean isAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }

    char[] ch1 = str1.toCharArray();
    char[] ch2 = str2.toCharArray();

    Arrays.sort(ch1);
    Arrays.sort(ch2);

//    for (int i = 0; i < ch1.length; i++) {
//      if (ch1[i] != ch2[i]) {
//        return false;
//      }
//    }
    return Arrays.equals(ch1, ch2);
  }

  static boolean areAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }

    int[] charCount = new int[256];
    for (int i = 0; i < str1.length(); i++) {
      charCount[str1.charAt(i)]++;
      charCount[str2.charAt(i)]--;
    }

    System.out.println(Arrays.toString(charCount));

    for (int count : charCount) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }
}
