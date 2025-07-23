package arrays;

import java.util.Arrays;

class LeftRotateArrayByTwoIndex {
  public static void main(String[] args) {
    int[] arr = { 5, 8, 88, 99, 100 };
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(rotateLeftByTwo(arr)));
  }

  static int[] rotateLeftByTwo(int[] arr) {
    if (arr == null || arr.length < 2) {
      return arr;
    }

    int first = arr[0];
    for (int i = 0; i < arr.length - 2; i++) {
      arr[i] = arr[i + 2];
    }
    arr[arr.length - 1] = first;

    return arr;
  }
}
