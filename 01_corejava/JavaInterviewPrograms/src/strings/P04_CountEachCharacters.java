package strings;

import java.util.Arrays;
import java.util.Scanner;

public class P04_CountEachCharacters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string:");
    String str = // sc.nextLine();
        // your name is?
        "niranjan";
    System.out.println("Original String :: " + str);

    String result = "";
    String replace = "";
    String strCharAndCount = "";

    char[] chArray = str.toCharArray();
    System.out.println("chArray = " + Arrays.toString(chArray));

    int totalCount = 0;
    for (int i = 0; i < chArray.length; i++) {
      int count = 1;

      for (int j = i + 1; j < chArray.length; j++) {
        if (Character.toLowerCase(chArray[i]) == Character.toLowerCase(chArray[j])) {
          count++;
          chArray[j] = '0';
        }
      }
      replace += chArray[i];

      // if count > 1 :: prints duplicate chars
      // if count = 1 :: prints unique characters/ removes duplicates
      // if there is no count :: counts of each and prints all characters once
      if (chArray[i] != '0') {// && count == 1) {// && chArray[i] >= 'A') {
        result += chArray[i];
        System.out.println(chArray[i] + " :: " + count);
        strCharAndCount += chArray[i] + Integer.toString(count);
        totalCount += count;
      }
    }

    System.out.println("Total Characters :: " + totalCount);
    System.out.println("Duplicate replaced with 0 :: " + replace);
    System.out.println("Duplicate replaced with its count :: " + strCharAndCount);

    System.out.println("Result chArray = " + Arrays.toString(chArray));

    if (result.isEmpty()) {
      System.out.println("No duplicates in :: " + str);
    } else {
      System.out.print("All unique characters in :: " + str);
      System.out.println(" is :: " + result);
    }

    System.out.println("Unique characters in \"" + str + "\":");
    printUniqueCharacters(str);
  }

  public static void printUniqueCharacters(String str) {
    // Assume ASCII characters (0-127), use boolean array to track
    // character occurrences
    boolean[] unique = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (!unique[ch]) {
        unique[ch] = true;
        System.out.print(ch);
      }
    }

    System.out.println();
    String res = "";
    char[] ch = str.toCharArray();

    int index = 0, i, j;
    for (i = 0; i < str.length(); i++) {
      for (j = 0; j < i; j++) {
        if (ch[i] == ch[j]) {
          break;
        }
      }

      if (i == j) {
        ch[index++] = ch[i]; // ch[index] ; index = index+1
        res += ch[i];
      }
    }

    System.out.println(String.valueOf(Arrays.copyOf(ch, index)));
    System.out.println(res);
  }
}