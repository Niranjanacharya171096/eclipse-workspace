package strings;

public class RegexShorthandExample {
  public static void main(String[] args) {
    String str = "Java_Regex 123!";

    System.out.println("Word characters (\\w): " + str.replaceAll("\\W", "")); // Removes non-word characters
    System.out.println("Non-word characters (\\W): " + str.replaceAll("\\w", "")); // Removes word characters
    System.out.println("Digits (\\d): " + str.replaceAll("\\D", "")); // Removes non-digits
    System.out.println("Non-digits (\\D): " + str.replaceAll("\\d", "")); // Removes digits
    System.out.println("Whitespace (\\s): " + str.replaceAll("\\S", "_")); // Replaces non-spaces with '_'
    System.out.println("Non-whitespace (\\S): " + str.replaceAll("\\s", "_")); // Replaces spaces with '_'
  }
}
