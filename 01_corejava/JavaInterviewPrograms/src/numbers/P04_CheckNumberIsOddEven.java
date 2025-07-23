package numbers;

import java.util.Scanner;

public class P04_CheckNumberIsOddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int inputNumber = sc.nextInt();
    checkNumberIsOddEven(inputNumber);

    int start = sc.nextInt();
    int end = sc.nextInt();

    printOddEvenNumbers(start, end);
  }

  public static void checkNumberIsOddEven(int num) {
    if (num % 2 == 0) {
      System.out.println(num + " is even");
    } else {
      System.out.println(num + " is odd");
    }
  }

  public static void printOddEvenNumbers(int start, int end) {
    System.out.println("Odd numbers ::");
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    System.out.println("Even numbers ::");
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}
