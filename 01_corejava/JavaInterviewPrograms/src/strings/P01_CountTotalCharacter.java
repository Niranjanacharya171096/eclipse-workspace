package strings;

import java.util.Scanner;

public class P01_CountTotalCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();// "The best of both worlds";

    System.out.println("Length of the str: " + str.length());

    int count = 0;
    // Counts each character except space
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ')
        count++;
    }

    // Displays the total number of characters present in the given str
    System.out.println("Total number of characters in a \"" + str + "\" :: " + count);
  }
}
