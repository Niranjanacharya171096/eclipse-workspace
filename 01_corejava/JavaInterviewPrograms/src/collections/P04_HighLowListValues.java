package collections;

import java.util.Collections;
import java.util.LinkedList;

public class P04_HighLowListValues {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(44);
    list.add(11);
    list.add(22);
    list.add(33);
// Use max() and min() methods of COllections class
    System.out.println(Collections.max(list));
    System.out.println(Collections.min(list));
// Sort the collection and get the first and last element
    Collections.sort(list);
    System.out.println(list.get((list.size() - 1)));
    System.out.println(list.get(0));
  }
}
