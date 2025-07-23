package arrays;

import java.util.Arrays;

public class P04_SecondMinMaxNumberInArray {
  public static void main(String[] args) {
    int[] numArr = { 2, 55, 33, 6, 9, 22 };

    System.out.println("1st way ::");
    System.out.println("Second Largest Number: " + findSecondLargest(numArr));
    System.out.println("2nd way ::");
    findSecondSmallestLargestNumber(numArr);
  }

  static void findSecondSmallestLargestNumber(int[] numArr) {
    for (int i = 0; i < numArr.length; i++) {
      for (int j = i + 1; j < numArr.length; j++) {
        if (numArr[i] > numArr[j]) {
          int temp = numArr[i];
          numArr[i] = numArr[j];
          numArr[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(numArr));
    System.out.println("Second Minimum number in the numArr[]: " + numArr[1]);
    System.out.println("Second Maximum number in the numArr[]: " + numArr[numArr.length - 2]);
  }

  static int findSecondLargest(int[] arr) {
    if (arr == null || arr.length < 2) {
      throw new IllegalArgumentException("Array must have at least two elements");
    }

    int firstLargest = Integer.MIN_VALUE; // -2147483648
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
      if (num > firstLargest) {
        secondLargest = firstLargest;
        firstLargest = num;
      } else if (num > secondLargest && num != firstLargest) {
        secondLargest = num;
      }
    }

    if (secondLargest == Integer.MIN_VALUE) {
      throw new IllegalArgumentException("No second largest element found");
    }

    return secondLargest;
  }
}