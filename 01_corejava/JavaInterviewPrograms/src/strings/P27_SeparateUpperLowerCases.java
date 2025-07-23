package strings;

import java.util.Scanner;

public class P27_SeparateUpperLowerCases {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    System.out.println("Original String is: " + str);
    separateCharacters(str);
  }

  public static void separateCharacters(String str) {
    StringBuilder lowerCase = new StringBuilder();
    StringBuilder upperCase = new StringBuilder();
    for (char ch : str.toCharArray()) {
      if (Character.isLowerCase(ch)) {
        lowerCase.append(ch);
      } else {
        upperCase.append(ch);
      }
    }
    System.out.println("Output in lowercase: " + lowerCase);
    System.out.println("Output in uppercase " + upperCase);
  }
}