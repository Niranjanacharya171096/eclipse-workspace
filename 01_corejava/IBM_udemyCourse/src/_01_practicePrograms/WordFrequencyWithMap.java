package _01_practicePrograms;
// From an input sentence, strip out all punctuation/special characters, then count how many times each remaining word appears—using a HashMap.
// Input: "Hello Hi there !! Welcome to Pune Pune Hi !!"
// Output:
// Hi -> 2  
// Pune -> 2

import java.util.*;

class WordFrequencyWithMap {
    public static void main(String[] args) {
        String str = "Hello Hi there !! Welcome to Pune Pune Hi !!";

        Map<String, Integer> countWords = wordFrequencyWithMap(str);

        countWords.entrySet().stream().filter(e->e.getValue()>1)
            .forEach(e->System.out.println(e.getKey() +" :: "+e.getValue()));
    }

    static Map<String, Integer> wordFrequencyWithMap(String str){
        String cleaned = str.replaceAll("[^A-Za-z0-9]"," ");
        System.out.println(cleaned);
        String[] words = cleaned.split("\\s+");
        System.out.println(Arrays.toString(words));

        Map<String, Integer> count = new HashMap<>();
        
        for(String word : words) {
            // if(word.isEmpty()) continue;
            count.put(word, count.getOrDefault(word,0)+1);
        }
        System.out.println(count);
        return count;
    }
}
