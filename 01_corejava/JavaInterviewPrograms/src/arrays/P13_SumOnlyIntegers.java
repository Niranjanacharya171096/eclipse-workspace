package arrays;

public class P13_SumOnlyIntegers {
  public static void main(String[] args) {
    String[] strArr = { "5", "2", "9", "a", "1", "6", "#", "3" };

    int sum = sumIntegers(strArr);
    System.out.println("Sum of integers in the strArr: " + sum);
  }

  public static int sumIntegers(String[] strArr) {
    int sum = 0;
    for (String str : strArr) {
      try {
        int num = Integer.parseInt(str);
        sum += num;
      } catch (NumberFormatException e) {
        System.out.println(str + " is string");// Ignore non-integer elements
      }
    }
    return sum;
  }
}