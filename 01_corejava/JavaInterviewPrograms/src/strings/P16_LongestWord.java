package strings;

class P16_LongestWord {
  public static void main(String[] args) {
    String str = "longest even / odd length of word in the string";

    String[] words = str.split("\\W+");

    longestWord(words);
    longestEvenOddWords(words);
  }

  static void longestWord(String[] words) {
    String longestWord = "";
    for (String word : words) {
      if (word.length() >= longestWord.length()) {
        longestWord = word;
      }
    }
    System.out.println("Longest Word :: " + longestWord);
  }

  static void longestEvenOddWords(String[] words) {
    int evnlen = 0;
    int oddlen = 0;
    String evnWord = "";
    String oddWord = "";

    for (int i = 0; i < words.length; i++) {
//      System.out.println(words[i] + " - " + words[i].length());
      if ((words[i].length()) % 2 == 0) {
        int longestEvenLen = words[i].length();
        if (longestEvenLen > evnlen) {
          evnlen = longestEvenLen;
          evnWord = words[i];
        }
      } else {
        int longestOddLen = words[i].length();
        if (longestOddLen > oddlen) {
          oddlen = longestOddLen;
          oddWord = words[i];
        }
      }
    }
    System.out.println("Longest Even Word :: " + evnWord);
    System.out.println("Longest Odd Word :: " + oddWord);
  }
}
