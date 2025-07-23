package strings;

class P15_PrintEvenWords {
  // 1st way
  public static void printWords(String str) {
    String[] words = str.split(" ");

    for (String word : words)
      if (word.length() % 2 == 0)
        System.out.println(word);
  }

  // 2nd way
  public static void printWords2(String str) {
    String[] words = str.split(" ");

    int[] wordLengths = new int[words.length];

    // Calculate the length of each word and store in the array
    for (int i = 0; i < words.length; i++) {
      wordLengths[i] = words[i].length();
    }

    // Check if the length of each word is even and print if true
    for (int i = 0; i < words.length; i++) {
      if (wordLengths[i] % 2 == 0) {
        System.out.println(words[i]);
      }
    }
  }

  public static void main(String[] args) {
    String str = "online online online there is a will there is a way";
    System.out.println("1st way :: ");
    printWords(str);
    System.out.println("2nd way :: ");
    printWords2(str);
  }
}
