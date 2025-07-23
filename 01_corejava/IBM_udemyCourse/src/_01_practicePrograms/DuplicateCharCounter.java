package _01_practicePrograms;
// Identify all characters in a given string that occur more than once, and print each such character alongside its total occurrence count.
// Input: "winwtriiinting"
// Output:
// i -> 5
// n -> 3
// w -> 2
// t -> 2

import java.util.*;

class DuplicateCharCounter {
    public static void main(String[] args) {
        String str = "winwtriiinting";
        Map<Character, Integer> map = duplicateCharCounter(str);

        map.entrySet().stream().filter(e->e.getValue()>1)
            .forEach(e->System.out.println(e.getKey()+" :: "+e.getValue()));
    }

    static Map<Character, Integer> duplicateCharCounter(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> counts = new HashMap<>();

        for(char ch : chars) {
            counts.put(ch, counts.getOrDefault(ch, 0)+1);
        }

        return counts;
    }
}