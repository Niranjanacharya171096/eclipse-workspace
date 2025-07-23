package strings;

public class P24_ReverseEachWord {
  public static void main(String[] args) {
    reverseEachWordOfString("Java is good programming langauges");
  }

  static void reverseEachWordOfString(String str) {
    String[] words = str.split(" ");
    String reverseString = "";

    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      String revWord = "";
      char ch;

      for (int j = 0; j < word.length(); j++) {
        ch = word.charAt(j);
        revWord = ch + revWord;
      }
      reverseString = reverseString + revWord + " ";
    }
    System.out.println(str);
    System.out.println(reverseString.trim()); // to trim last spaces
  }
}
