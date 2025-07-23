package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P09_RemoveDuplicatesFromArray {
  public static void main(String[] args) {
    int[] array = { 5, 2, 9, 1, 6, 2, 5 };
    System.out.println(Arrays.toString(array));

    int[] uniqueArray = removeDuplicates(array);
    System.out.println("Array with duplicates removed:");
    System.out.println(Arrays.toString(uniqueArray));

    for (int num : uniqueArray) {
      System.out.println(num);
    }
  }

  static int[] removeDuplicates(int[] array) {
    Set<Integer> set = new HashSet<>();
    for (int num : array) {
      set.add(num);
    }
    int[] result = new int[set.size()];
    int i = 0;
    for (int num : set) {
      result[i++] = num;
    }
    return result;
  }
}