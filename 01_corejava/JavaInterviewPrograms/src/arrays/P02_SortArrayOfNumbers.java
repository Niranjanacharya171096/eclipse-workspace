package arrays;

import java.util.Arrays;

public class P02_SortArrayOfNumbers {
  public static void main(String[] args) {
    int[] numArr = { 324, 4, 45, 88, 897, 34 }; // 6
    // Sorting using sort()
    System.out.print("Sorted Array using Arrays.sort(): ");
    Arrays.sort(numArr);
    for (int num : numArr) {
      System.out.print(num + " ");
    }
    System.out.println(Arrays.toString(numArr));
//or
    // Sorting using Bubble Sort
    System.out.print("Sorted Array using bubbleSort: ");
    bubbleSort(numArr);
    for (int num : numArr) {
      System.out.print(num + " ");
    }

    System.out.println(Arrays.toString(numArr));
  }

  public static void bubbleSort(int[] numArr) {
    for (int i = 0; i < numArr.length; i++) {
      for (int j = i + 1; j < numArr.length; j++) {
        if (numArr[i] > numArr[j]) {
          int temp = numArr[i];
          numArr[i] = numArr[j];
          numArr[j] = temp;
        }
      }
    }
  }
}