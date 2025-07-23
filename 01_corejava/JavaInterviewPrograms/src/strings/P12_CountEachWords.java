package strings;

import java.util.Scanner;

public class P12_CountEachWords {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a str:");
    String str = // scanner.nextLine();
        // "where there is a will there is a way"
        "online online online there is a will there is a way";

    scanner.close();

    countDuplicateWords(str);
  }

  public static void countDuplicateWords(String str) {
    // Convert to lowercase and split words by non-word characters
    String[] words = str.toLowerCase().split(" ");// ("\\W+");
    String result = "";

    System.out.println("Duplicate words and their counts:");

    int totalCount = 0;
    for (int i = 0; i < words.length; i++) {
      int count = 1;
      for (int j = i + 1; j < words.length; j++) {
        if (words[i].equals(words[j])) {
          count++;
          words[j] = " "; // Mark word as counted // null gives exception
        }
      }

      // if count > 1 :: prints duplicate chars
      // if count = 1 :: prints unique characters/ removes duplicates
      // if there is no count :: counts of each and prints all characters once

      if (words[i] != " ") {// && count > 1) {
        result += words[i] + " ";
        System.out.println(words[i] + " :: " + count);
        totalCount += count;
      }
    }
    System.out.println("Total Count of words :: " + totalCount);
    if (result.isEmpty()) {
      System.out.println("No duplicates in :: " + str);
    } else {
      System.out.println("All unique characters in :: " + str);
      System.out.println(" is :: " + result);
    }
  }
}
