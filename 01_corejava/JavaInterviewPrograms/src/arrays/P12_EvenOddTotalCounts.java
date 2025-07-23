package arrays;

public class P12_EvenOddTotalCounts {
  public static void main(String[] args) {
    int[] numArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    int[] count = countOddAndEven(numArr);
    System.out.println("Total Even numbers count: " + count[0]);
    System.out.println("Total Odd numbers count: " + count[1]);
  }

  public static int[] countOddAndEven(int[] numArr) {
    int[] count = new int[2]; // Index 0 for odd count, Index 1 for even count
    for (int num : numArr) {
      if (num % 2 == 0) {
        count[0]++; // Increment even count
      } else {
        count[1]++; // Increment odd count
      }
    }
    return count;
  }
}