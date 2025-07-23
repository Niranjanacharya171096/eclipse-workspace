package arrays;

import java.util.Arrays;

public class P09_RightShiftAllZerosRemove {
  public static void main(String[] args) {
    int[] numArr = { 1, 0, 2, 0, 3, 0, 0, 0 };
    System.out.println(Arrays.toString(numArr));

    if (numArr.length == 1) {
      System.out.println(Arrays.toString(numArr));
    } else {
      int[] newArray = new int[numArr.length];
      int count = 0;
      for (int num : numArr) {
        if (num != 0) {
          newArray[count] = num;
          count++;
        }
      }
      System.out.println(count);
      System.out.println("Array after shifting zeros:" + Arrays.toString(newArray));
    }

    int count = 0;
    for (int num : numArr) {
      if (num != 0) {
        count++;
      }
    }

    // Create a new array without zeros
    int[] result = new int[count];
    int index = 0;
    for (int num : numArr) {
      if (num != 0) {
        result[index++] = num;
      }
    }

    // Print the new array
    System.out.println("Array after removing zeros: " + Arrays.toString(result));
  }
}
