package numbers;

import java.util.Scanner;

public class P05_CheckNumberIsPrime {
  public static void main(String[] args) {
    System.out.println("Enter input number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    checkNumberIsPrime(num);

    int start = sc.nextInt();
    int end = sc.nextInt();

    System.out.println("Prime numbers between " + start + " and " + end + " are:");
    System.out.println("1st way :: ");
    printPrimeNumbers(start, end);

    System.out.println("2nd way :: ");
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        System.out.print("\n" + i);
      }
    }
  }

  static void checkNumberIsPrime(int num) {
    boolean flag = false;
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag) {
      System.out.println(num + " is a prime number");
    } else {
      System.out.println(num + " is not a prime number");
    }
  }

  public static void printPrimeNumbers(int start, int end) {
    for (int i = start; i <= end; i++) {
      int count = 0;

      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          count++;
        }
      }

      // A prime number has exactly 2 divisors: 1 and itself
      if (count == 2) {
        System.out.print(i + " ");
      }
    }
  }

  public static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }
    for (int i = 2; i <= (num) / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
