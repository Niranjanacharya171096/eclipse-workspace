package strings;

import java.util.Arrays;

public class RegexSplitDemo {
  public static void main(String[] args) {
    String input = "Java123 is@fun_to#learn!15K";
    System.out.println(input + " :: " + input.length());

    // Define regex patterns to split on
    String[] regexPatterns = { "\\s", // Split on whitespace
        "\\d", // Split on digits
        "\\D", // Split on non-digits
        "\\w", // Split on word characters (letters, digits, _)
        "\\W" // Split on non-word characters (symbols, spaces)
    };

    String[] patternNames = { "\\s (whitespace)", "\\d (digit)", "\\D (non-digit)", "\\w (word char)",
        "\\W (non-word char)" };

    // Apply each pattern and print result
    for (int i = 0; i < regexPatterns.length; i++) {
      System.out.println("Split using pattern " + patternNames[i] + ":");
      String[] result = input.split(regexPatterns[i]);
      System.out.println(Arrays.toString(result));
      System.out.println(result.length);
      System.out.println("-----");
    }
  }
}
