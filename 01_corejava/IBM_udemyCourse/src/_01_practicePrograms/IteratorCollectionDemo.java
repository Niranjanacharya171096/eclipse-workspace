package _01_practicePrograms;
// Given a List<String>, remove all strings whose length is odd using an Iterator, 
// then sort the remaining strings in reverse (descending) order using Collections.sort and Collections.reverseOrder().

import java.util.*;

public class IteratorCollectionDemo {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>(List.of("one","two","three","four","five","six"));
        System.out.println(filterAndSort(data));
    }
    
    static List<String> filterAndSort(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().length() % 2 != 0) {
                it.remove();
            }
        }
        Collections.sort(list, Collections.reverseOrder());

        return list;
    }
}
