package _01_practicePrograms;
// Rotate an integer array left by one position, moving the first element to the end.
// Input: [1, 2, 3, 4, 5]
// Output: [2, 3, 4, 5, 1]

import java.util.*;

class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateLeftByOne(arr)));
    }

    static int[] rotateLeftByOne(int[] arr) {
        if(arr == null || arr.length < 2) {
            return arr;
        }

        int first = arr[0];
        for(int i=0; i<arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;

        return arr;
    }
}