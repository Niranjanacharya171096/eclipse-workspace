package strings;

import java.util.Scanner;

public class P25_ReverseFullString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = "Java is good";// sc.nextLine();
    System.out.println(str);

    reverseString(str);
    System.out.println(reverse(str));
  }

  static void reverseString(String str) {
    String revStr = "";

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      revStr = ch + revStr;
    }
    System.out.println("Reversed String is : " + revStr);
  }

  static String reverse(String str) {
    char[] chars = str.toCharArray();

    int left = 0, right = chars.length - 1;

    while (left < right) {
      char temp = chars[left];
      chars[left++] = chars[right];
      chars[right--] = temp;
    }
    return new String(chars);
  }
}
