package numbers;

import java.util.Scanner;

public class P10_FactorialNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number ");
    int num = sc.nextInt();// 5;

    factorialNumber(num);

    int start = sc.nextInt();
    int end = sc.nextInt();
    System.out.println("Factorial Series :: ");
    factorialNumberInRange(start, end);
  }

  static void factorialNumber(int num) {
    int factorial = 1;
    for (int i = 1; i <= num; i++) {
      factorial = factorial * i;
    }
    System.out.println("Factorial number is :" + factorial);
  }

  static void factorialNumberInRange(int start, int end) {
    int factorial = 1;

    // int i = 1;
    for (int i = 1; factorial <= end; i++) { // while (factorial <= end) {
      if (factorial >= start) {
        System.out.print(factorial + " ");
      }
      // i++;
      factorial = factorial * (i);
    }
  }
}