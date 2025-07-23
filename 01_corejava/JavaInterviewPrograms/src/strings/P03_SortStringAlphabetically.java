package strings;

import java.util.Arrays;

public class P03_SortStringAlphabetically {
  public static void main(String[] args) {
    String str = "dfgf yGusa";
    System.out.println("Original String: " + str);

//using Arrays.sort()
    char[] chArray = str.toCharArray();
    Arrays.sort(chArray);
    String sortedStr = new String(chArray);
    System.out.println("Sorted String: " + sortedStr);

// without using Arrays.sort()
    String sortedString = sortString(str);
    System.out.println("Sorted String: " + sortedString); // ANaaaachijnnrry
  }

  public static String sortString(String str) {
    // Convert the string to a character array
    char[] chArray = str.toCharArray();

    // Bubble Sort algorithm to sort the characters
    for (int i = 0; i < chArray.length; i++) {
      for (int j = i + 1; j < chArray.length; j++) {
        if (chArray[i] > chArray[j]) {
          // Swap characters
          char temp = chArray[i];
          chArray[i] = chArray[j];
          chArray[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(chArray)); // [ , A, N, a, a, a, a, c, h, i, j, n, n, r, r, y]
    // Convert the sorted character array back to a string
    return new String(chArray);
  }
}
