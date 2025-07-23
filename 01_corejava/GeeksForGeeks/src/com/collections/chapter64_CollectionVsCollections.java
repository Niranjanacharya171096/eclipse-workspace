package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class chapter64_CollectionVsCollections { 
  public static void main (String[] args) {  
    // Creating an object of List<String>
    List<String> aList = new ArrayList<String>();  
 
    // Adding elements to aList
    aList.add("geeks"); 
    aList.add("for"); 
    aList.add("geeks");     
    System.out.println("Adding Elements: "+aList); 
    
    // Adding all the specified elements to the specified collection 
    Collections.addAll(aList, "web", "site"); 
    System.out.println("Adding all Elements using addAll(): "+aList); 
    
    
    // Sorting all the elements of the specified collection according to default sorting order 
    Collections.sort(aList); 
    System.out.println("Sorting Elements: "+aList);      
  } 
}
