package strings;

import java.util.Scanner;

public class P19_DoubleEachChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");

    String str = sc.nextLine();
    String doubledString = doubleCharacters(str);
    System.out.println("Doubled characters: " + doubledString);
  }

  public static String doubleCharacters(String str) {
    String doubled = "";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      for (int j = 0; j < 2; j++)
        doubled += ch;
    }

//    StringBuilder doubled = new StringBuilder();
//    for (int i = 0; i < str.length(); i++) {
//    char ch = str.charAt(i);
//    doubled.append(ch).append(ch); // Append each character
//    }
    return doubled.toString();
  }
}