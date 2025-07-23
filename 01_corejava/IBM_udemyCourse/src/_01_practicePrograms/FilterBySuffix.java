package _01_practicePrograms;
// Given a list of strings, remove all elements whose last three characters equal "abc".
// Example:
// Input:  ["fooabc", "bar", "testabc", "hello"]  
// Output: ["bar", "hello"]

import java.util.*;

class FilterBySuffix {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(List.of("fooabc", "bar", "testabc", "hello", "abcx"));
        System.out.println(filterSuffix(str));
    }

    static List<String> filterSuffix(List<String> str) {
        // Iterator<String> it = str.iterator();
        // while(it.hasNext()) {
        //     if((it.next()).endsWith("abc"))
        //         it.remove();
        // }
        str.removeIf(s -> s.length() >= 3 && s.endsWith("abc"));
        return str;
    }
}