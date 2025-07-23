package strings;

import java.util.Arrays;

class CommonWordsIn2Strings {
  public static void main(String[] args) {
    String str1 = "my name is raj";
    String str2 = "india is my country my";
    String[] words1 = str1.split("\\W+");
    String[] words2 = str2.split("\\W+");
// 1st way
    int size = (words1.length >= words2.length) ? words2.length : words1.length;
    String[] result = new String[size];
    System.out.println(result.length);
    int index = 0;
    for (int i = 0; i < words1.length; i++) {
      for (int j = 0; j < words2.length; j++) {
        if (words1[i].equals(words2[j])) {
          boolean alreadyAvailable = false;
          for (int k = 0; k < index; k++) {
            if (result[k].equals(words1[i])) {
              alreadyAvailable = true;
              break;
            }
          }
          if (!alreadyAvailable) {
            result[index++] = words1[i];
          }
          break;
        }
      }
    }

    System.out.println("Common words: " + Arrays.toString(result));
    // Print the common words stored in array
    if (index == 0) {
      System.out.println("No common words found.");
    } else {
      System.out.println("Common words:");
      for (int i = 0; i < index; i++) {
        System.out.println(result[i]);
      }
    }
  }
}