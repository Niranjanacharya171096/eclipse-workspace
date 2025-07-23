package numbers;

import java.util.Scanner;

public class P06_ReverseNumberCheckPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    reverseNumber(num);
  }

  public static void reverseNumber(int number) {
    int temp = number;
    int reversedNumber = 0;

    while (temp != 0) {
      int digit = temp % 10;
      temp = temp / 10;
      reversedNumber = reversedNumber * 10 + digit;
    }

    System.out.println("Reversed number is " + reversedNumber);

    if (reversedNumber == number)
      System.out.println(number + " is palindrome");
    else
      System.out.println(number + " is not palindrome");
  }
}
