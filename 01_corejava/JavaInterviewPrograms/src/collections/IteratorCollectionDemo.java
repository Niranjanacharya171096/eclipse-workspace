package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class IteratorCollectionDemo {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
    System.out.println(list);
    System.out.println("After removing odd length strings = " + filterAndSort(list));
  }

  static List<String> filterAndSort(List<String> list) {
    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
      if (it.next().length() % 2 != 0) {
        it.remove();
      }
    }

    Collections.sort(list, Collections.reverseOrder());
    // Comparator - Collections.reverseOrder()

    return list;
  }
}
