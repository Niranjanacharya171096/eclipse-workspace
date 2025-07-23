package collections;

import java.util.HashMap;

public class P05_FirstNonRepeatingCharacteInString {
  public static void main(String[] args) {
    System.out.println(firstNonRepeat("niranjan"));
  }

  public static char firstNonRepeat(String str) {
    HashMap<Character, Integer> charCount = new HashMap<>();
    System.out.println(charCount);

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      // System.out.println(ch);
      // System.out.println(charCount.containsKey(ch));
      if (charCount.containsKey(ch)) {
        // System.out.println(charCount.get(ch));
        charCount.put(ch, charCount.get(ch) + 1);
        // System.out.println(charCount);
      } else {
        charCount.put(ch, 1);
        // System.out.println(charCount);
      }
    }

    System.out.println(charCount);

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (charCount.get(ch) == 1)
        return ch;
    }
    return '_';
  }
}
