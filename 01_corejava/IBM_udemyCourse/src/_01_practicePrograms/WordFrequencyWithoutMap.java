package _01_practicePrograms;
// From an input sentence, strip out all punctuation/special characters, then count how many times each remaining word appears—without using any Map or HashMap.
// Input: "Hello Hi there !! Welcome to Pune Pune Hi !!"
// Output:
// Hi -> 2  
// Pune -> 2

import java.util.*;

class WordFrequencyWithoutMap {
    public static void main(String[] args) {
        String str = "Hello Hi there !! Welcome to Pune Pune Hi !!";
        wordFrequencyWithoutMap(str);
    }

    static void wordFrequencyWithoutMap(String str){
        String cleaned = str.replaceAll("[^A-Za-z0-9]"," ");
        // System.out.println(cleaned);
        String[] words = cleaned.split("\\s+");
        // System.out.println(Arrays.toString(words));

        List<String> uniqueWord = new ArrayList<>();
        List<Integer> totalCount = new ArrayList<>();

        for(String word : words) {
            int index = uniqueWord.indexOf(word); // returns index of the word if it is in the list
            // System.out.println(index);
            if (index >= 0) {
                totalCount.set(index, totalCount.get(index) + 1);
            } else {
                uniqueWord.add(word);
                totalCount.add(1);
            }
        }

        for (int i = 0; i < uniqueWord.size(); i++) {
            if (totalCount.get(i) > 1) {
                System.out.println(uniqueWord.get(i) + " :: " + totalCount.get(i));
            }
        }
    }
}
