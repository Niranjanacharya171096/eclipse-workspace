package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class chapter79_NavigableSetInterface {
  public static void main(String[] args) {
    NavigableSet<Integer> tSet = new TreeSet<>();
    // Get a reverse view of the navigable set
    NavigableSet<Integer> reverseNs = tSet.descendingSet();
    
    tSet.add(0);
    tSet.add(1);
    tSet.add(2);
    tSet.add(3);
    tSet.add(4);
    tSet.add(5);
    tSet.add(6);

    // Print the normal and reverse views
    System.out.println("Normal order: " + tSet);
    System.out.println("Reverse order: " + reverseNs);

    NavigableSet<Integer> threeOrMore = tSet.tailSet(3, true);
    System.out.println("3 or  more:  " + threeOrMore);
    System.out.println("lower(3): " + tSet.lower(3));
    System.out.println("floor(3): " + tSet.floor(3));
    System.out.println("higher(3): " + tSet.higher(3));
    System.out.println("ceiling(3): " + tSet.ceiling(3));
    
    System.out.println("pollFirst(): " + tSet.pollFirst());
    System.out.println("Navigable Set:  " + tSet);
    
    System.out.println("pollLast(): " + tSet.pollLast());
    System.out.println("Navigable Set:  " + tSet);
    
    System.out.println("pollFirst(): " + tSet.pollFirst());
    System.out.println("Navigable Set:  " + tSet);

    System.out.println("pollFirst(): " + tSet.pollFirst());
    System.out.println("Navigable Set:  " + tSet);
    
    System.out.println("pollFirst(): " + tSet.pollFirst());
    System.out.println("Navigable Set:  " + tSet);
    
    System.out.println("pollFirst(): " + tSet.pollFirst());
    System.out.println("Navigable Set:  " + tSet);
    
    System.out.println("pollLast(): " + tSet.pollLast());
    System.out.println("Navigable Set:  " + tSet);
  }  
}
