package strings;

import java.util.Scanner;

public class P02_CompareTwoStrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first string");
    String str1 = sc.nextLine(); // The world
    System.out.println("Enter second string");
    String str2 = sc.nextLine(); // The world

    // using string function
    compare(str1, str2);

    // without using string function
    boolean areEqual = compareStrings(str1, str2);

    if (areEqual) {
      System.out.println("The strings are equal.");
    } else {
      System.out.println("The strings are not equal.");
    }
  }

  public static void compare(String str1, String str2) {
    if (str1.equals(str2)) { // str1.compareTo(str2) == 0
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }
  }

  public static boolean compareStrings(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }

    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        return false;
      }
    }
    return true; // Strings are equal
  }
}