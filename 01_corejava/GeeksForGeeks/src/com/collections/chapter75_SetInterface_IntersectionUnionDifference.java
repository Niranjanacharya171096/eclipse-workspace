package com.collections;

import java.util.*; 

public class chapter75_SetInterface_IntersectionUnionDifference { 
  public static void main(String args[]) {
    Set<Integer> hSet1 = new HashSet<Integer>();
    hSet1.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
    Set<Integer> hSet2 = new HashSet<Integer>();
    hSet2.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

    System.out.println("First Set: "+hSet1);
    System.out.println("Second Set: "+hSet2);

    // To find union
    Set<Integer> union = new HashSet<Integer>(hSet1);
    union.addAll(hSet2);
    System.out.print("Union of the two Set");
    System.out.println(union);

    // To find intersection
    Set<Integer> intersection = new HashSet<Integer>(hSet1);
    intersection.retainAll(hSet2);
    System.out.print("Intersection of the two Set");
    System.out.println(intersection);

    // To find the symmetric difference
    Set<Integer> difference = new HashSet<Integer>(hSet1);
    difference.removeAll(hSet2);
    System.out.print("Difference of the two Set");
    System.out.println(difference);
  }
}
