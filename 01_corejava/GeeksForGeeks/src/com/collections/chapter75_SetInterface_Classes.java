package com.collections;

import java.util.*; 

enum enm { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ };

public class chapter75_SetInterface_Classes { 
  public static void main(String[] args) {
    Set<String> hSet = new HashSet<String>();
    
    // Adding elements into the HashSet using add()
    hSet.add("India");
    hSet.add("Australia");
    hSet.add("South Africa");
    
    // Adding the duplicate element
    hSet.add("India");
    
    // Displaying the HashSet
    System.out.println(hSet);
    
    // Removing items from HashSet using remove()
    hSet.remove("Australia");
    System.out.println("Set after removing "+ "Australia:" + hSet);
    
    // Iterating over hash set items
    System.out.println("Iterating over set:");
    Iterator<String> itr = hSet.iterator();
    while (itr.hasNext())
      System.out.println(itr.next());

    // Creating a set
    Set<enm> eSet;

    // Adding the elements
    eSet = EnumSet.of(enm.QUIZ, enm.CONTRIBUTE, enm.LEARN, enm.CODE);

    System.out.println("eSet : " + eSet);

    Set<String> lhSet = new LinkedHashSet<String>();
  
    // Adding elements into the LinkedHashSet using add()
    lhSet.add("India");
    lhSet.add("Australia");
    lhSet.add("South Africa");
    
    // Adding the duplicate element
    lhSet.add("India");
    
    // Displaying the LinkedHashSet
    System.out.println(lhSet);
  
    // Removing items from LinkedHashSet using remove()
    lhSet.remove("Australia");
    System.out.println("Set after removing "
                           + "Australia:" + lhSet);
  
    // Iterating over linked hash set items
    System.out.println("Iterating over set:");
    itr = lhSet.iterator();
    while (itr.hasNext())
      System.out.println(itr.next());
    
    Set<String> tSet = new TreeSet<String>();
      
    // Adding elements into the TreeSet using add()
    tSet.add("India");
    tSet.add("Australia");
    tSet.add("South Africa");
    
    // Adding the duplicate element
    tSet.add("India");
      
    // Displaying the TreeSet
    System.out.println(tSet);
    
    // Removing items from TreeSet using remove()
    tSet.remove("Australia");
    System.out.println("Set after removing "+ "Australia:" + tSet);
    
    // Iterating over Tree set items
    System.out.println("Iterating over set:");
    itr = tSet.iterator();
    while (itr.hasNext())
      System.out.println(itr.next());
  }
}
