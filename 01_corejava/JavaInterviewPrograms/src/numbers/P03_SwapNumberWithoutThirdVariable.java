package numbers;

public class P03_SwapNumberWithoutThirdVariable {
  public static void main(String[] args) {
    swap(35, 40);
  }

  static void swap(int a, int b) {
    System.out.println("Before swapping\n a= " + a + "\n b = " + b);

    // 1st way: risk of overflow if a + b exceeds Integer.MAX_VALUE
    // a = a+b;
    // b = a-b;
    // a = a-b;
    // System.out.println("After swap: a = " + a + ", b = " + b);

    // 2nd way: Bitwise XOR: No overflow but works only on integer types.
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("After swap: a = " + a + ", b = " + b);
  }
}
