package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class P06_CountCharacters {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a str:");
    String str = // scanner.nextLine();
        "hi, how are you? are you fine!";
    // Convert to lowercase and remove spaces and punctuation
//  String text = str.toLowerCase().replaceAll("[^a-zA-Z]", "");
//  System.out.println(text);

    scanner.close();

    countCharactersUsingList(str);
    countCharactersUsingSet(str);
    countCharactersUsingMap(str);

    Map<Character, Integer> map = duplicateCharCounter(str);

    map.entrySet().stream().filter(e -> e.getValue() > 1)
        .forEach(e -> System.out.println(e.getKey() + " :: " + e.getValue()));
  }

  public static void countCharactersUsingList(String str) {
    List<Character> charList = new ArrayList<>();
    List<Character> duplicateList = new ArrayList<>(); // Stores already printed duplicates

    System.out.println("List = " + charList);
    // Populate charList with characters from string
    for (char ch : str.toCharArray()) {
      charList.add(ch);
    }
    System.out.println("List = " + charList);

    System.out.println("Characters and their occurrences:");
    // Iterate through the list and find duplicates
    for (int i = 0; i < charList.size(); i++) {
      char ch = charList.get(i);
      int count = 0;

      // Count occurrences of char in the list
      for (int j = 0; j < charList.size(); j++) {
        if (charList.get(j) == ch) {
          count++;
        }
      }

      // Print only if count > 1 and not printed before
      if (!duplicateList.contains(ch)) {// && count > 1) {
        System.out.println(ch + " : " + count);
        duplicateList.add(ch); // Mark as printed
      }
    }
  }

  public static void countCharactersUsingSet(String str) {
    Set<Character> seenSet = new HashSet<>(); // Stores unique characters
    Set<Character> duplicateSet = new HashSet<>(); // Stores duplicates

    System.out.println("Seen Set = " + seenSet);
    System.out.println("Duplicate Set = " + duplicateSet);
    // First pass: Identify duplicates
    for (char ch : str.toCharArray()) {
      if (!seenSet.add(ch)) { // If already in seenSet, it's a duplicate
        duplicateSet.add(ch);
      }
    }
    System.out.println("Seen Set = " + seenSet);
    System.out.println("Duplicate Set = " + duplicateSet);

    System.out.println("Characters and their occurrences:");

    // Second pass: Count occurrences of duplicates
    for (char ch : seenSet) {
      int count = 0;
      for (char c : str.toCharArray()) {
        if (c == ch) {
          count++;
        }
      }
      System.out.println(ch + " : " + count);
    }
  }

  public static void countCharactersUsingMap(String str) {
    // Use a HashMap to store character counts
    Map<Character, Integer> charCountMap = new HashMap<>();
    System.out.println(charCountMap);

    for (char ch : str.toCharArray()) {
      charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
    }
    System.out.println(charCountMap);

    // Print duplicate characters and their occurrences
    System.out.println("Characters and their occurrences:");
    System.out.println(charCountMap.entrySet());

    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//      if (entry.getValue() > 1)
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }

  static Map<Character, Integer> duplicateCharCounter(String str) {
    char[] chars = str.toCharArray();
    Map<Character, Integer> counts = new HashMap<>();

    for (char ch : chars) {
      counts.put(ch, counts.getOrDefault(ch, 0) + 1);
    }

    return counts;
  }
}
