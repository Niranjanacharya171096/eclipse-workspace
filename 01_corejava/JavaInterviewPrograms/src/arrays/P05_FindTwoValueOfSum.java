package arrays;

public class P05_FindTwoValueOfSum {
  static int numArr[] = { 21, 98, 13, 9, 34 };
  static int sum = 34;

  public static void main(String[] args) {
    try {
      int[] res = findTwoNumber(sum);

      for (int i = 0; i < res.length; i++)
        System.out.println("Two number in the array: " + res[i]);
    } catch (java.lang.NullPointerException e) {
      System.out.println("No number in the array");
    }
  }

  private static int[] findTwoNumber(int sum) {
//    int[] res;
    int total = 0;

    for (int i = 0; i < numArr.length; i++) {
      for (int j = 0; j < numArr.length; j++) {
        total = numArr[i] + numArr[j];
        if (total == sum) {
          int[] res = new int[2];
          res[0] = numArr[i];
          res[1] = numArr[j];

          return res;
        }
      }
    }
    return null;
  }
}
