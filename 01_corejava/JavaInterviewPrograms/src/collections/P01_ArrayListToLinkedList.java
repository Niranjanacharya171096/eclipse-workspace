package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P01_ArrayListToLinkedList {
  public static void main(String[] args) {
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Mango");
    linkedlist.add("Banana");
    linkedlist.add("Pear");
    linkedlist.add("Apple");
    linkedlist.add("Orange");

// Converting LinkedList to ArrayList
    ArrayList<String> list = new ArrayList<String>(linkedlist);
    System.out.println(list);

// Converting ArrayList to LinkedList
    List<String> list1 = new LinkedList<String>(list);
    System.out.println(list1);
  }
}
