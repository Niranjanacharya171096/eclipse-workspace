package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class collection {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    HashSet hs=new HashSet();   
    hs.add("A");   
    hs.add("B");   
    hs.add("C");   
    hs.add("D");   
    System.out.println(hs); //[D, A, B, C]
    HashSet hs1=new HashSet();   
    System.out.println(hs1.addAll(hs)); // true 
    System.out.println(hs1); //[D, A, B, C]
    System.out.println(hs1.addAll(hs)); // false 
    System.out.println(hs1); //[D, A, B, C]



  }

}
