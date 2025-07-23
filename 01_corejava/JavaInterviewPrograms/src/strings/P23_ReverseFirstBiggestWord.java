package strings;

public class P23_ReverseFirstBiggestWord {
  public static void main(String[] args) {
    String str = "Find the longest word and reverse it";
    String result = reverseBiggestWord1(str);
    System.out.println(result);

    String res = reverseBiggestWord2(str);
    System.out.println(res);
  }

  public static String reverseBiggestWord1(String str) {
    String[] words = str.split(" ");
    String biggest = "";

    // Find the biggest word
    for (String word : words) {
      if (word.length() > biggest.length()) {
        biggest = word;
      }
    }

    // Manually reverse the biggest word
    String reversed = "";
    for (int i = biggest.length() - 1; i >= 0; i--) {
      reversed += biggest.charAt(i);
    }

    // Rebuild the string with the first occurrence of the biggest word reversed
    String result = "";
    boolean replaced = false;
    for (int i = 0; i < words.length; i++) {
      if (!replaced && words[i].equals(biggest)) {
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

  public static String reverseBiggestWord2(String str) {
    String[] words = str.split("\\s+");
    String biggest = "";

    for (String word : words) {
      if (word.length() > biggest.length()) {
        biggest = word;
      }
    }

    StringBuilder reversed = new StringBuilder(biggest).reverse();

    // Replace only the first occurrence of the biggest word
    return str.replaceFirst("\\b" + biggest + "\\b", reversed.toString());
  }
}
