package strings;

import java.util.Arrays;

class ConcatenationSpeedComparison {
  public static void main(String[] args) {
    int n = 10_000;
    String[] words = new String[n];
    Arrays.fill(words, "word");
    // System.out.println(Arrays.toString(words));

    long t1 = System.nanoTime();
    concatWithPlus(words);
    long dt1 = System.nanoTime() - t1;

    long t2 = System.nanoTime();
    concatWithBuilder(words);
    long dt2 = System.nanoTime() - t2;

    System.out.printf("Plus: %d ms%n", dt1 / 1_000_000);
    System.out.printf("Builder: %d ms%n", dt2 / 1_000_000);
  }

  static String concatWithPlus(String[] words) {
    String res = "";
    for (String word : words) {
      res += word + " ";
    }
    return res.trim();
  }

  static String concatWithBuilder(String[] words) {
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      sb.append(word).append(" ");
    }
    return sb.toString().trim();
  }
}
