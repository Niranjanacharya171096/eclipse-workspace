package _01_practicePrograms;
// Reverse words using Java’s Collection framework and an Iterator.
// Input: "harry is tester"
// Output: "tester is harry"

import java.util.*; 

class ReverseWithIterator {
    public static void main(String[] args) {
        String str = "harry is tester";
        System.out.println(reverseWords(str));
    }

    static String reverseWords(String str) {
        String[] words = str.split("\\s+");
        LinkedList<String> ll = new LinkedList<>();
        for(String word:words){
            ll.add(word);
        }
        // System.out.println(ll.toString());

        StringBuilder sb = new StringBuilder();

        Iterator<String> desc = ll.descendingIterator();
        while(desc.hasNext()){
            sb.append(desc.next());
            // System.out.println(sb);

            if(desc.hasNext())
                sb.append(" ");
        }
        return sb.toString();
    }
}