package arrays;

public class P08_FirstAndLastPositionOfNum {
  public static void main(String[] args) {
    int[] numArr = { 5, 7, 7, 8, 8, 10 };
    int target = 8;

    int firstIndex = -1;
    int lastIndex = -1;

    for (int i = 0; i < numArr.length; i++) {
      if (numArr[i] == target && firstIndex == -1) {
        firstIndex = i;
      }

      if (numArr[i] == target && firstIndex != -1) {
        lastIndex = i;
      }
    }

    System.out.println("First Index is: " + firstIndex + "\nLast Index is: " + lastIndex);
  }
}