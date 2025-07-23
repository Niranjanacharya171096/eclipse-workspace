package _01_practicePrograms;
// Given an input sentence, return a new string in which the order of words is reversed.
// Input: "harry is tester"
// Output: "tester is harry"

class ReverseWords {
    public static void main(String[] args) {
        String str = "harry is tester";
        System.out.println(reverseWords(str));
    }

    static String reverseWords(String str) {
        String[] words = str.split("\\s+");
        int i=0, j=words.length-1;

        while(i<j) {
            //System.out.println(i +" "+j);
            String temp = words[i];
            words[i++] = words[j]; //i=0, i++
            words[j--] = temp; 
            //System.out.println(Arrays.toString(words));

        }
        return String.join(" ", words);
    }
}