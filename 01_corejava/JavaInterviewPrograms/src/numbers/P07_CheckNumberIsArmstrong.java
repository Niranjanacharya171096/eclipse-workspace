package numbers;

import java.util.Scanner;

public class P07_CheckNumberIsArmstrong {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    checkNumberIsArmstrong(num);
  }

  static void checkNumberIsArmstrong(int num) {
    int cube = 0, digit, temp;

    temp = num;
    while (temp > 0) {
      digit = temp % 10;
      temp = temp / 10;
      cube = cube + (digit * digit * digit);
    }

    if (num == cube) {
      System.out.println(num + " is an Armstrong number");
    } else
      System.out.println(num + " is not an armstrong number");
  }
}
