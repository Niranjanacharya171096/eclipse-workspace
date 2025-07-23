package strings;

import java.util.Scanner;

public class P21_PrintEvenIndexed {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    System.out.println("Even indexed characters in \"" + str + "\":");
    printEvenIndexedCharacters(str);
  }

  public static void printEvenIndexedCharacters(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) {
        System.out.print(str.charAt(i));
      }
    }
  }
}