package strings;

import java.util.Scanner;

public class P22_RemoveSpaces {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string with spaces: ");
    String str = sc.nextLine();

    String stringWithoutSpaces = removeSpaces(str);
    System.out.println("String without spaces: " + stringWithoutSpaces);
  }

  public static String removeSpaces(String str) {
//    StringBuilder result = new StringBuilder();

    String result = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        result += str.charAt(i); // result.append(str.charAt(i));
      }
    }
    return result.toString();
  }
}