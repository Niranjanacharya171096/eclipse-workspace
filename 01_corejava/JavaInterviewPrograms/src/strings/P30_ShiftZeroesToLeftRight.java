package strings;

public class P30_ShiftZeroesToLeftRight {
  public static void main(String[] args) {
    String str = "32400121200";
    char[] arr = str.toCharArray();

    int zeroCount = 0;
    StringBuilder result = new StringBuilder();

    for (char ch : arr) {
      if (ch == '0') {
        zeroCount++;
      } else {
        result.append(ch);
      }
    }

    shiftZeroesToLeft(result, zeroCount);
    shiftZeroesToRight(result, zeroCount);
  }

  public static void shiftZeroesToLeft(StringBuilder result, int zeroCount) {
    // Create a new result with zeroes at the beginning
    StringBuilder finalResult = new StringBuilder();

    for (int i = 0; i < zeroCount; i++) {
      finalResult.append('0');
    }

    finalResult.append(result); // Add the non-zero characters after

    System.out.println("Result: " + finalResult.toString());
  }

  public static void shiftZeroesToRight(StringBuilder result, int zeroCount) {

    for (int i = 0; i < zeroCount; i++) {
      result.append('0');
    }

    System.out.println("Result: " + result.toString());
  }
}
