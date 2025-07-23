package strings;

public class P13_RemoveSpecificDuplicateWord {
  public static void main(String[] args) {
    String str = "where there is a will way there is a way";
    String target = "way";
    String result = removeDuplicateCharacter(str, target);
    System.out.println("Updated string: " + result);
  }

  public static String removeDuplicateCharacter(String str, String target) {
    String result = ""; // New string to store result
    boolean found = false; // Flag to track first occurrence

    String[] word = str.split(" ");

    for (int i = 0; i < word.length; i++) {

      if (word[i].equals(target)) {
// Keep the first occurrence
        if (!found) {
          result += word[i] + " ";
          found = true;
        }
        // Skip duplicate occurrences
      } else {
        result += word[i] + " "; // Keep other characters
      }
    }
    return result;
  }
}
