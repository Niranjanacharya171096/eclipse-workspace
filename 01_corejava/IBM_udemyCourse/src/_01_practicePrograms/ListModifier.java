package _01_practicePrograms;
// Write a method that takes a List<String> of arbitrary size, 
// inserts the string "START" at the beginning and "END" at the end, 
// then returns the modified list.

import java.util.*;

class ListModifier {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>(List.of("A", "B", "C"));
        System.out.println(wrapWithStartEnd(data));
    }

    static List<String> wrapWithStartEnd(List<String> alist) {
        if(alist == null) {
            throw new IllegalArgumentException("List must not be null");
        }
        
        alist.add(0, "START");
        alist.add("END");

        return alist;
    }
}
