package arrays;

public class P03_MinMaxNumberInArray {
//  static int numArr[] = { 21, 98, 13, 9, 34 };

  public static void main(String[] args) {
    int[] numArr = { 21, 98, 13, 9, 34 };

    // sort and print first and last num

    int[] minmax = findSmallestLargestNumber(numArr);
    System.out.println("Minimum number in the numArr[]: " + minmax[0]);
    System.out.println("Maximum number in the numArr[]: " + minmax[1]);
  }

  static int[] findSmallestLargestNumber(int[] numArr) {
    if (numArr.length == 0) {
      throw new IllegalArgumentException("Array must not be empty");
    }

    int min = numArr[0];
    int max = numArr[0];

    for (int i = 0; i < numArr.length; i++) {
      if (numArr[i] < min)
        min = numArr[i];
      if (numArr[i] > max)
        max = numArr[i];
    }

    return new int[] { min, max };
  }
}
