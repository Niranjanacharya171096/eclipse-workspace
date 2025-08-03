package strings;

class P23_ReverseFirstLongestWord {
  public static void main(String[] args) {
    String str = "Find the longest word and reverse it";
    String result = reverseLongestWord1(str);
    System.out.println(result);

    String res = reverseLongestWord2(str);
    System.out.println(res);
  }

  public static String reverseLongestWord1(String str) {
    String[] words = str.split(" ");
    String longestWord = "";
    for (String word : words) {
      if (word.length() >= longestWord.length()) {
        longestWord = word;
      }
    }
    System.out.println("Longest Word :: " + longestWord);

    // Manually reverse the biggest word
    String reversed = "";
    for (int i = longestWord.length() - 1; i >= 0; i--) {
      reversed += longestWord.charAt(i);
    }

    // Rebuild the string with the first occurrence of the longest word reversed
    String result = "";
    boolean replaced = false;
    for (int i = 0; i < words.length; i++) {
      if (!replaced && words[i].equals(longestWord)) {
        result += reversed;
        replaced = true;
      } else {
        result += words[i];
      }

      if (i < words.length - 1) {
        result += " ";
      }
    }

    return result;
  }

  public static String reverseLongestWord2(String str) {
    String[] words = str.split("\\s+");
    String longestWord = "";
    for (String word : words) {
      if (word.length() >= longestWord.length()) {
        longestWord = word;
      }
    }
    System.out.println("Longest Word :: " + longestWord);
 
    StringBuilder reversed = new StringBuilder(longestWord).reverse();

    // Replace only the first occurrence of the longest word
    return str.replaceFirst("\\b" + longestWord + "\\b", reversed.toString());
  }
}
