package numbers;

import java.util.Scanner;

public class P02_SwapTwoNumbers {
  public static void main(String[] args) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("Before swapping\n a = " + a + "\n b = " + b);

    c = a;
    a = b;
    b = c;
    System.out.println("After swapping\n a = " + a + "\n b = " + b);
  }
}
