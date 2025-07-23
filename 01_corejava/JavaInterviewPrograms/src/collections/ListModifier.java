package collections;

import java.util.ArrayList;
import java.util.List;

class ListModifier {
  public static void main(String[] args) {
    List<String> data = new ArrayList<>(List.of("A", "B", "C"));
    System.out.println(wrapWithStartEnd(data));
  }

  static List<String> wrapWithStartEnd(List<String> alist) {
    if (alist == null) {
      throw new IllegalArgumentException("List must not be null");
    }

    alist.add(0, "START");
    alist.add("END");

    return alist;
  }
}
