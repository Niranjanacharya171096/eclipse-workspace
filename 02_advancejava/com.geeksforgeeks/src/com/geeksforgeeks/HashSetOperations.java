package com.geeksforgeeks;

import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) { 
        // Instantiate an object 
        // of HashSet 
        HashSet<String> hs1 = new HashSet<String>(); 
  
        // Elements are added using add() method 
        hs1.add("Geek"); 
        hs1.add("For"); 
        hs1.add("Geeks"); 
  
        // Print the contents on the console 
        System.out.println("HashSet elements: " + hs1); 
        // Instantiate an object 
        // of HashSet 
        
        HashSet<String> hs2 = new HashSet<String>(); 
  
        // Elements are added using add() method 
        hs2.add("Geek"); 
        hs2.add("For"); 
        hs2.add("Geeks"); 
        hs2.add("A"); 
        hs2.add("B"); 
        hs2.add("Z"); 
  
        // Print the contents on the console 
        System.out.println("Initial HashSet " + hs2); 
  
        // Removing the element B 
        hs2.remove("B"); 
  
        // Print the contents on the console 
        System.out.println("After removing element " + hs2); 
  
        // Returns false if the element is not present 
        System.out.println("Element AC exists in the Set: " + hs2.remove("AC")); 
        System.out.println("Element A exists in the Set: " + hs2.remove("A")); 

        // Instantiate an object of HashSet 
        HashSet<String> hs3 = new HashSet<String>(); 
  
        // Elements are added using add() method 
        hs3.add("Geek"); 
        hs3.add("For"); 
        hs3.add("Geeks"); 
        hs3.add("A"); 
        hs3.add("B"); 
        hs3.add("Z"); 
  
        // Iterating though the HashSet 
        Iterator itr = hs3.iterator(); 
        while (itr.hasNext()) 
            System.out.print(itr.next() + ", "); 
        System.out.println(); 
  
        // Using enhanced for loop 
        for (String s: hs3) 
            System.out.print(s + ", "); 
        System.out.println(); 

    }
}
