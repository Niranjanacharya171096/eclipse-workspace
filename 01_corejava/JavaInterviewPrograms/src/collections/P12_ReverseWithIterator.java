package collections;

import java.util.Iterator;
import java.util.LinkedList;

class P12_ReverseWithIterator {
  public static void main(String[] args) {
    String str = "Java is good";
    System.out.println(str);
    System.out.println(reverseWords(str));
  }

  static String reverseWords(String str) {
    String[] words = str.split("\\s+");

    LinkedList<String> ll = new LinkedList<>();
    for (String word : words) {
      ll.add(word);
    }
    // System.out.println(ll.toString());

    StringBuilder sb = new StringBuilder();

    Iterator<String> desc = ll.descendingIterator(); // method is only available in LinkedList
    while (desc.hasNext()) {
      sb.append(desc.next());
      // System.out.println(sb);

      if (desc.hasNext())
        sb.append(" ");
    }
    return sb.toString();
  }
}
