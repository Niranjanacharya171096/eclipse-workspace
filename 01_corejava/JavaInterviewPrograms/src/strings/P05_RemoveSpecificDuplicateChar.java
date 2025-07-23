package strings;

public class P05_RemoveSpecificDuplicateChar {
  public static void main(String[] args) {
    String str = "Online class"; // Example string
    char target = 'l'; // Character to remove duplicates of

    String result = removeDuplicateCharacter(str, target);
    System.out.println("Updated string: " + result);
  }

  public static String removeDuplicateCharacter(String str, char target) {
    String result = ""; // New string to store result
    boolean found = false; // Flag to track first occurrence

    for (int i = 0; i < str.length(); i++) { // for (char ch : str.toCharArray()) {
      char ch = str.charAt(i);

      if (ch == target) {
// Keep the first occurrence
        if (!found) {
          result += ch;
          found = true;
        }
// Skip duplicate occurrences
      } else {
        result += ch; // Keep other characters
      }
    }
    return result;
  }
}
