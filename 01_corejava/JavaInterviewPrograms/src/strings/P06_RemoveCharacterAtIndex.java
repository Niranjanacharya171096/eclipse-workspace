package strings;

public class P06_RemoveCharacterAtIndex {
  public static void main(String[] args) {
    String str = "Online class"; // Example string
    int indexToRemove = 3; // Index of character to remove
    String result = removeCharacterAtIndex(str, indexToRemove);
    System.out.println("Updated string: " + result);
  }

  public static String removeCharacterAtIndex(String str, int index) {
    if (index < 0 || index >= str.length()) {
      return str; // Return original string if index is out of bounds
    }

    String result = "";
    for (int i = 0; i < str.length(); i++) {
      if (i != index) { // Skip the character at the given index
        result += str.charAt(i);
      }
    }
    return result;
  }
}
