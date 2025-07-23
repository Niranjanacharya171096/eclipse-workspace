package collections;

import java.util.ArrayList;
import java.util.List;

class RemoveByIndex {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(List.of(71, 82, 21, 33, 9));
    System.out.println(list);
    System.out.println(removeAt(list, 3));
  }

  static List<Integer> removeAt(List<Integer> list, int index) {
    if (index < 0 || index >= list.size()) {
      throw new IndexOutOfBoundsException("Invalid index: " + index);
    }
    list.remove(index);
    return list;
  }
}
