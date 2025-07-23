package arrays;

import java.util.Scanner;

public class P11_LinearSearchElement {
  public static void main(String[] args) {
    int[] numArr = { 5, 2, 9, 1, 6, 3 };

    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();

    int index = linearSearch(numArr, target);
    if (index != -1) {
      System.out.println("Element " + target + " found at index: " + index);
    } else {
      System.out.println("Element " + target + " not found in the numArr.");
    }
  }

  public static int linearSearch(int[] numArr, int target) {
    for (int i = 0; i < numArr.length; i++) {
      if (numArr[i] == target) {
        return i; // Element found, return index
      }
    }
    return -1; // Element not found
  }
}