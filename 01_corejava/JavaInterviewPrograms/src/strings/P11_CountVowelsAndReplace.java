package strings;

public class P11_CountVowelsAndReplace {
  public static void main(String[] args) {
    String str = "Java Programming Language";

    int totalVowelCount = totalCountVowels(str);
    System.out.println("Total number of vowels: " + totalVowelCount);

    countEachVowel(str);
    replaceVowelsWithStar(str);
  }

  public static int totalCountVowels(String str) {
    str = str.toLowerCase();
    int count = 0;

    for (char ch : str.toCharArray()) {
      if ("aeiou".indexOf(ch) != -1) { // Check if character is a vowel
        count++;
      }
    }

    return count;
  }

  public static void countEachVowel(String str) {
    str = str.toLowerCase();
    int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
    int consonantsCount = 0;

    for (char ch : str.toCharArray()) {
      if (ch != ' ') {
        switch (ch) {
        case 'a':
          aCount++;
          break;
        case 'e':
          eCount++;
          break;
        case 'i':
          iCount++;
          break;
        case 'o':
          oCount++;
          break;
        case 'u':
          uCount++;
          break;
        default:
          consonantsCount++;
        }
      }
    }

    // Display the results
    System.out.println("Occurrences of vowels:");
    System.out.println("a: " + aCount);
    System.out.println("e: " + eCount);
    System.out.println("i: " + iCount);
    System.out.println("o: " + oCount);
    System.out.println("u: " + uCount);
    System.out.println("Consonants : " + consonantsCount);
  }

  public static void replaceVowelsWithStar(String str) {
    String result = "";
    for (char ch : str.toCharArray()) {
//      System.out.println("aeiou".indexOf(ch));
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//      if ("aeiou".indexOf(ch) != -1) { // prints index from "aeiou" if ch is in that
        result += '*';
      } else {
        result += ch;
      }
    }
    System.out.println(result);
  }
}
