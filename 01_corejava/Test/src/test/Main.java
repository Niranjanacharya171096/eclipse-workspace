package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Main {
  public static void main(String args[]) {
    String str = "!niRnja88N && 12 a5ch*a3rYa   #say118ee3D kH1an?";

    String[] whiteSpaces = str.split("\\S+");
    String[] nonWhiteSpaces = str.split("\\s+");
    String[] words = str.split("\\W+"); // (" ")
    String[] nonWords = str.split("\\w+");
    String[] digits = str.split("\\D+");
    String[] nonDigits = str.split("\\d+");

    System.out.println(Arrays.toString(whiteSpaces));
    System.out.println(Arrays.toString(nonWhiteSpaces));
    System.out.println(Arrays.toString(words));
    System.out.println(Arrays.toString(nonWords));
    System.out.println(Arrays.toString(digits));
    System.out.println(Arrays.toString(nonDigits));

    char[] ch = str.toCharArray();
    System.out.println(Arrays.toString(ch));

    System.out.println(str.charAt(5) + " == " + ch[5] + " ?? " + (str.charAt(5) == ch[5]));

    System.out.println(Integer.parseInt(digits[1])); // str -> int
    System.out.println(Integer.valueOf(digits[5])); // str -> Integer

    List list1 = Arrays.asList(nonWhiteSpaces);
    System.out.println(list1);
    for (int i = 0; i < list1.size(); i++) {
      System.out.println(list1.get(i));
    }

    List list2 = new ArrayList(Arrays.asList(words));
    System.out.println(list2);
    for (Object word : list2) {
      System.out.println(word);
//      list2.add("Hi");
    }

    List list3 = new ArrayList(Arrays.asList(nonWords));
    Iterator it = list3.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
      it.remove();
    }
    System.out.println(list3);

    List list4 = new ArrayList(Arrays.asList(digits));
    ListIterator listit = list4.listIterator();
    while (listit.hasNext()) {
      System.out.println(listit.next());
      listit.remove();
    }
    System.out.println(list4);
  }
}
