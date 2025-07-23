package arrays;

import java.util.Arrays;

public class P10_RemoveDuplicateNumbers {
  public static void main(String[] args) {
    int[] numArr = { 8, 2, 3, 2, 9, 3, 6 };
    System.out.println("Array before removing duplicates: " + Arrays.toString(numArr));

    // Remove duplicates from the numArr
    int[] result = removeDuplicates(numArr);

    // Print the result
    System.out.println("Array after removing duplicates: " + Arrays.toString(result));
  }

  public static int[] removeDuplicates(int[] numArr) {
    // If the numArr is empty or has only one element, no need to remove duplicates
    if (numArr.length <= 1) {
      System.out.println(numArr);
      return numArr;
    }

    // Create a new numArr to store the unique elements
    int[] tempArray = new int[numArr.length];
    int tempIndex = 0;

    for (int i = 0; i < numArr.length; i++) {
      int count = 1;
      // Check if the current element is already in the tempArray
      for (int j = i + 1; j < numArr.length; j++) {
        if (numArr[i] == numArr[j]) {
          count++;
          numArr[j] = 0;
        }
      }

      // If not a duplicate, add it to the tempArray
      if (numArr[i] != 0) {
        System.out.println(numArr[i]);
        tempArray[tempIndex] = numArr[i];
        tempIndex++;
      }
    }
    System.out.println(tempIndex);
    System.out.println(Arrays.toString(tempArray));
    tempArray = Arrays.copyOf(tempArray, tempIndex);

// Copy the unique elements back to the result numArr
    return tempArray;
  }
}
