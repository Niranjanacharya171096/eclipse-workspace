package strings;

public class SubstringCountFromString {
  public static void main(String[] args) {
    String str = "RADRHYRADRAD";
    String sub = "RAD";
//1st way
    countSubstring(str, sub);
//2nd way
    str = str.replaceAll(sub, "_");
    System.out.println(str);
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '_') {
        count++;
      }
    }
    System.out.println(count);
  }

  static void countSubstring(String str, String sub) {
    int count = 0;

    for (int i = 0; i <= str.length() - sub.length(); i += sub.length()) {
      String part = str.substring(i, i + sub.length());
      if (part.equals(sub)) {
        count++;
      }
    }

    System.out.println("Occurrences of \"" + sub + "\": " + count);
  }
}
