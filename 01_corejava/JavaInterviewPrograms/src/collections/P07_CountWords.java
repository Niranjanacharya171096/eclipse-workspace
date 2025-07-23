package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P07_CountWords {
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a str:");
    String str = // scanner.nextLine();
        "hi, how are you? are you fine! are";
    System.out.println(str);
//    scanner.close();
    String cleaned = str.replaceAll("[^A-Za-z0-9]", " ");
    System.out.println("After cleaning :: " + cleaned);
    String[] words = cleaned.split("\\s+");
    System.out.println(Arrays.toString(words));

    System.out.println("\nStore Count in the List and Print");
    wordFrequencyWithoutMap(words);

    System.out.println("Count Words Using List");
    countCharactersUsingList(words); // without return

    System.out.println("\nCount Words Using Set");
    System.out.println(countCharactersUsingSet(words)); // with return

    System.out.println("\nCount Words Using Map");
    Map<String, Integer> countWords = countCharactersUsingMap(words);
    System.out.println("Iterating using stream() ::");
    countWords.entrySet().stream().filter(e -> e.getValue() > 1)
        .forEach(e -> System.out.println(e.getKey() + " :: " + e.getValue()));
  }

  static void wordFrequencyWithoutMap(String[] words) {
    List<String> uniqueWord = new ArrayList<>();
    List<Integer> totalCount = new ArrayList<>();

    for (String word : words) {
      int index = uniqueWord.indexOf(word); // returns index of the word if it is in the list
      // System.out.println(index);
      if (index >= 0) {
        totalCount.set(index, totalCount.get(index) + 1);
      } else {
        uniqueWord.add(word);
        totalCount.add(1);
      }
    }

    for (int i = 0; i < uniqueWord.size(); i++) {
//    if (totalCount.get(i) > 1) {
      System.out.println(uniqueWord.get(i) + " :: " + totalCount.get(i));
//    }
    }
  }

  public static void countCharactersUsingList(String[] words) {
    List<String> wordList = new ArrayList<>();
    List<String> duplicateList = new ArrayList<>(); // Stores already printed duplicates

    System.out.println("List = " + wordList);
    // Populate wordList with characters from string
    for (String word : words) {
      wordList.add(word);
    }
    System.out.println("List = " + wordList + " :: " + wordList.size());

    System.out.println("Words and their occurrences:");
    // Iterate through the list and find duplicates
    for (int i = 0; i < wordList.size(); i++) {
      String word = wordList.get(i);
      int count = 0;

      // Count occurrences of char in the list
      for (int j = 0; j < wordList.size(); j++) {
        if (word.equals(wordList.get(j))) {
          count++;
        }
      }

      // Print only if count > 1 and not printed before
      if (!duplicateList.contains(word) && count > 1) {
        System.out.println(word + " :: " + count);
        duplicateList.add(word); // Mark as printed
      }
    }
    System.out.println("Duplicate List = " + duplicateList);
  }

  public static Set<String> countCharactersUsingSet(String[] words) {
//    String[] words = str.split("\\W+");

    Set<String> seenSet = new HashSet<>(); // Stores unique characters
    Set<String> duplicateSet = new HashSet<>(); // Stores duplicates

    System.out.println("Seen Set = " + seenSet);
    System.out.println("Duplicate Set = " + duplicateSet);
    // First pass: Identify duplicates
    for (String word : words) {
      if (!seenSet.add(word)) { // If already in seenSet, it's a duplicate
        duplicateSet.add(word);
      }
    }
    System.out.println("Seen Set = " + seenSet);
    System.out.println("Duplicate Set = " + duplicateSet);

    System.out.println("Words and their occurrences:");

    // Second pass: Count occurrences of duplicates
    for (String seenWord : seenSet) {
      int count = 0;
      for (String word : words) {
        if (word.equals(seenWord)) {
          count++;
        }
      }
      System.out.println(seenWord + " : " + count);
    }
    System.out.println("Duplicate Set = ");
    return duplicateSet;
  }

  public static Map<String, Integer> countCharactersUsingMap(String[] words) {
    Map<String, Integer> wordCountMap = new HashMap<>();

    for (String word : words) {
      wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
    }
    System.out.println(wordCountMap);

    System.out.println("Words and their occurrences:");
    System.out.println(wordCountMap.entrySet());

    for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
//      if (entry.getValue() > 1)
      System.out.println(entry.getKey() + " :: " + entry.getValue());
    }

    return wordCountMap;
  }
}