package collections;

import java.util.HashSet;

public class CommonCharsIn2Strings {
  public static void main(String[] args) {
    String str1 = "my name is niranjan";
    String str2 = "i live in india";

    // Convert both strings to lowercase (optional, for case-insensitive comparison)
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // Use sets to store unique characters
    HashSet<Character> hashSet = new HashSet<>();
    HashSet<Character> commonChars = new HashSet<>();

    // Add characters of str1 to hashSet
    for (char ch : str1.toCharArray()) {
      if (ch != ' ') {
        hashSet.add(ch);
      }
    }

    // Check for common characters in str2
    for (char ch : str2.toCharArray()) {
      if (ch != ' ' && hashSet.contains(ch)) {
        commonChars.add(ch);
      }
    }

    // Print the result
    System.out.print("Common characters: ");
    for (char ch : commonChars) {
      System.out.print(ch + " ");
    }
  }
}
