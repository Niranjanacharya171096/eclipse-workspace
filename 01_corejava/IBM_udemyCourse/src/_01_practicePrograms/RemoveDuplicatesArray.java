package _01_practicePrograms;
//Given an int[] array, return a new array containing 
// only the unique elements in their original order of first appearance.

import java.util.*;

class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] data = {1, 2, 2, 3, 1, 4, 3};
        System.out.println(Arrays.toString(uniqueArray(data)));
    }
    static int[] uniqueArray(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int v : arr) {
            set.add(v);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int v : set) {
            result[i++] = v;
        }
        return result;
    }
}
