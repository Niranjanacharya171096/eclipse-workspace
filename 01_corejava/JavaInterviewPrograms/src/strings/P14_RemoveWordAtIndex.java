package strings;

public class P14_RemoveWordAtIndex {
  public static void main(String[] args) {
    String str = // "where there is a will way there is a way";
        "Java is a powerful programming language";
    int wordIndexToRemove = 3; // Index of character to remove
    String result = removeWordAtIndex(str, wordIndexToRemove);
    System.out.println("Updated string: " + result);
  }

  public static String removeWordAtIndex(String str, int index) {
    String[] words = str.split("\\s+");

    // Validate index
    if (index < 0 || index >= words.length) {
      System.out.println("Invalid index!");
      return "Invalid index!";
    }

    // Construct the new str without the word at the given index
    String result = "";
    for (int i = 0; i < words.length; i++) {
      if (i != index) {
        result += words[i] + " "; // Append word with space
      }
    }

    // Trim and print the modified str
//    result = result.trim();
//    System.out.println("Modified Sentence: " + result);
    return result;
  }
}
