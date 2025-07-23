package numbers;

import java.util.Scanner;

public class P01_NumberOfDigits {
  public static void main(String[] args) {
    int num = 0, digCount = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any number : ");
    num = scanner.nextInt();

    if (num == 0) {
      num = 1;
    }

    if (num < 0) {
      num = num * -1; // make it +ve num
    }

    while (num >= 0) {
      num = num / 10;
      digCount++;
    }

    System.out.println("Total digits in given number is :: " + digCount);
  }
}