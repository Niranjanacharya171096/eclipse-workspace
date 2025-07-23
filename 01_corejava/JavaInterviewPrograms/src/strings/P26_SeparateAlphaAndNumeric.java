package strings;

import java.util.Scanner;

public class P26_SeparateAlphaAndNumeric {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    System.out.println("Original String is: " + str);

    separateAlphaAndNumeric(str);
  }

  public static void separateAlphaAndNumeric(String str) {
    StringBuilder alphaPart = new StringBuilder();
    StringBuilder numericPart = new StringBuilder();

    for (char ch : str.toCharArray()) {
      if (Character.isLetter(ch)) {
        alphaPart.append(ch);
      } else if (Character.isDigit(ch)) {
        numericPart.append(ch);
      }
    }
    System.out.println("Output in Alpha: " + alphaPart.toString());
    System.out.println("Output in Numeric:" + numericPart.toString());
  }
}