package arrays;

public class P07_MissingNumberInArray {
  public static void main(String[] args) {
    // Sorted Array
    int[] numArr = { 2, 3, 4, 5, 7, 10 };
    findMissingNumber(numArr);
  }

  public static void findMissingNumber(int[] numArr) {
    int min = numArr[0]; // Start from the minimum expected number
    int max = numArr[numArr.length - 1];

    System.out.print("Missing numbers: ");
    int i = 0;
    int missing = min;
    while (missing <= max) {
      if (i < numArr.length && numArr[i] == missing) {
        i++;
      } else {
        System.out.print(missing + " "); // Missing number found
      }
      missing++; // Move to the next expected number
// or
//    for (int missing = min; missing <= max; missing++) {
//      if (i < numArr.length && numArr[i] == missing) {
//        i++; // Move to the next element in the array
//      } else {
//        System.out.print(missing + " "); // Missing number found
//      }
//    }
    }
  }
}