package strings;

public class P09_ConvertCharToNumeric {
  public static void main(String[] args) {
    String str = "aabbbccccdddddaa";

    System.out.println(compressString1(str));
    System.out.println(compressString2(str));
    System.out.println(compressString3(str));
  }

  public static String compressString1(String str) {
    String result = "";
    char[] ch = str.toCharArray();

    int count;
    for (int i = 0; i < str.length(); i++) {
      count = 1;
      for (int j = i + 1; j < str.length(); j++) {
        if (ch[i] == ch[j]) {
          count++;
          ch[j] = ' ';
        } else {
          break;
        }
      }
      if (ch[i] != ' ')
        result += ch[i] + Integer.toString(count);
    }
    return result;
  }

  public static String compressString2(String str) {
    String result = "";
    int count = 1;

    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(i - 1)) {
        count++;
      } else {
        result += str.charAt(i - 1) + Integer.toString(count);// String.valueOf(count);
        count = 1;
      }
    }
    result += str.charAt(str.length() - 1) + String.valueOf(count);

    return result;
  }

//or
  public static String compressString3(String str) {
    StringBuilder result = new StringBuilder();
    int count = 1;
    for (int i = 0; i < str.length(); i++) {
      // If the next character is the same, increase the count
      if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
        count++;
      } else {
        // Append the character and its count to the result
        result.append(str.charAt(i)).append(count);
        count = 1; // Reset the count
      }
    }
    return result.toString();
  }
}
