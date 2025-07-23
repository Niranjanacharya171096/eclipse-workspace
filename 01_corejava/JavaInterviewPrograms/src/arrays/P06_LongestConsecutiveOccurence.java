package arrays;

public class P06_LongestConsecutiveOccurence {
  public static void main(String[] args) {
    int[] numArr = { 4, 25, 25, 6, 7, 8, 8, 8, 2, 3, 10 };// {1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 4, 4, 4};
    findLongestConsecutiveOccurrence(numArr);
  }

  public static void findLongestConsecutiveOccurrence(int[] numArr) {
    if (numArr == null || numArr.length == 0) {
      System.out.println("Array is empty");
      return;
    }

    int maxElement = numArr[0];
    int maxCount = 1;
    int currentElement = numArr[0];
    int currentCount = 1;

    for (int i = 1; i < numArr.length; i++) {
      if (numArr[i] == currentElement) {
        currentCount++;
      } else {
        currentElement = numArr[i];
        currentCount = 1;
      }

      if (currentCount > maxCount) {
        maxCount = currentCount;
        maxElement = currentElement;
      }
    }

    System.out.println("Element: " + maxElement + ", Count: " + maxCount);
  }
}
