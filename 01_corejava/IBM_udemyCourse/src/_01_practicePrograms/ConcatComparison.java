package _01_practicePrograms;
//Given an array of words, build a single sentence by concatenating them with a space separator—
// once using String concatenation (+) and again using StringBuilder. 
// Compare performance for large arrays.

import java.util.*;

class ConcatComparison {
    public static void main(String[] args) {
        int n = 10000;
        String[] words = new String[n];
        Arrays.fill(words, "word");
        // System.out.println(Arrays.toString(words));

        long t1 = System.nanoTime();
        concatWithPlus(words);
        long dt1 = System.nanoTime() - t1;

        long t2 = System.nanoTime();
        concatWithBuilder(words);
        long dt2 = System.nanoTime() - t2;

        System.out.printf("Plus:   %d ms%n", dt1/1_000_000);
        System.out.printf("Builder:%d ms%n", dt2/1_000_000);
    }
    static String concatWithPlus(String[] words) {
        String res = "";
        for (String w : words) {
            res += w + " ";
        }
        return res.trim();
    }
    static String concatWithBuilder(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(w).append(" ");
        }
        return sb.toString().trim();
    }
}