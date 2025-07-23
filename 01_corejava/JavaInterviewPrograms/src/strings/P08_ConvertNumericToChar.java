package strings;

public class P08_ConvertNumericToChar {
  public static void main(String[] args) {
    String str = "a2b3c4 d5a2"; // output = aabbbccccdddddaa
    convertNumToChar(str);
  }

  static void convertNumToChar(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      if (Character.isAlphabetic(str.charAt(i))) {
        result += str.charAt(i);
//        System.out.println(str.charAt(i));
      } else {
        if (str.charAt(i) != ' ') {
          char ch = str.charAt(i);
//        int num = ch - '0';
//        int num = Character.digit(ch, 10);
//        int num = Character.getNumericValue(ch);
//        int num = Integer.parseInt(Character.toString(ch));
          int num = Integer.parseInt(String.valueOf(ch));

          for (int j = 1; j < num; j++) {
            result += str.charAt(i - 1);
//            System.out.println(str.charAt(i - 1));
          }
        }
      }
    }
    System.out.println(result);
  }
}
