package numbers;

import java.util.Scanner;

public class P09_FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nhow many numbers? :: ");
    int num = sc.nextInt();
    printFibonacciSeries(num);

    System.out.print("\nEnter the range :: ");
    int start = sc.nextInt();
    int end = sc.nextInt();
    System.out.println("Fibonacci Series :: ");
    printFibonacciSeriesInRange(start, end);
  }

  static void printFibonacciSeries(int num) {
    int first = 0, second = 1;
    while (num != 0) { // for (int i = 0; i < num; i++) {
      System.out.print(first + " ");
      int next = first + second;
      first = second;
      second = next;
      num--;
    }
  }

  static void printFibonacciSeriesInRange(int start, int end) {
    int first = 0, second = 1;

    while (first <= end) { // for (int i = 0; first <= end; i++) {
      if (first >= start) {
        System.out.print(first + " ");
      }
      int next = first + second;
      first = second;
      second = next;
    }
  }
}
