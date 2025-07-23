package strings;

public class P10_CountCapitalLetters {
  public static void main(String[] args) {
    System.out.println(getCapsWordsInString("Niranjan Acharya"));
  }

  public static int getCapsWordsInString(String str) {
    int counter = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        counter++;
      }
    }
    return counter;
  }
}
