package strings;

class ReverseStringWithoutReversingWords {
  public static void main(String[] args) {
    String str = "Java is good";
    System.out.println("Original string :: " + str);

    System.out.println(reverseWords1(str));
    System.out.println(reverseWords2(str));
  }

  static String reverseWords1(String str) {
    String[] words = str.split("\\s+");
    String reverse = "";
    for (String word : words) {
      if (!word.equals(words[0])) // this adds " " after the last word
        reverse = word + " " + reverse;
    }
//    for (int i = words.length - 1; i > 0; i--) {
//      reverse += words[i] + " ";
//    }
    reverse += words[0];
    return reverse; // reverse.trim(); // to trim last spaces
  }

  static String reverseWords2(String str) {
    String[] words = str.split("\\s+");
    int i = 0, j = words.length - 1;

    while (i < j) {
      // System.out.println(i +" "+j);
      String temp = words[i];
      words[i++] = words[j]; // i=0, i++
      words[j--] = temp;
      // System.out.println(Arrays.toString(words));

    }
    return String.join(" ", words);
  }
}
