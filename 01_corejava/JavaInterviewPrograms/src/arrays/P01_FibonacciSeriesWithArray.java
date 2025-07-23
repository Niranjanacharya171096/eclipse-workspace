package arrays;

import java.util.Scanner;

public class P01_FibonacciSeriesWithArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int fiblength = sc.nextInt();

    int[] numArr = new int[fiblength];
    // Assign values 0 and 1 to the 0 and 1 indices of the defined array
    numArr[0] = 0;
    numArr[1] = 1;

    // Logic for getting the values of all the indices of the array using for loop
    for (int i = 2; i < fiblength; i++) {
      numArr[i] = numArr[i - 1] + numArr[i - 2];
    }

    System.out.print("fibonacci series :: ");
    for (int i = 0; i < fiblength; i++) {
      System.out.print(numArr[i] + " ");
    }
  }
}