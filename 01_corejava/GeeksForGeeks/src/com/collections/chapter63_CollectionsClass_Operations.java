package com.collections;

import java.util.Collections;
import java.util.ArrayList;  
import java.util.List;

class AddingElementsCollectionExample {
  public static void AddingElementsCollectionExample(List<String> aList) {
    // Add one or more elements
    Collections.addAll(aList, "Fruits", "Bat", "Ball");
    
    System.out.println(aList);
    // print the list contents
    for (int i = 0; i < aList.size(); i++) {
      System.out.print(aList.get(i) + " ");
    }
  }
}

class SortingCollectionExample {
  public static void SortingCollectionExample(List<String> aList) {
    // add one or more elements
    Collections.addAll(aList, "Fruits", "Bat", "Mouse");
    
    System.out.println(aList);
    
    // sorting according to default ordering
    Collections.sort(aList);

    System.out.println(aList);

    // print the elements
    for (int i = 0; i < aList.size(); i++) {
      System.out.print(aList.get(i) + " ");
    }
    System.out.println();

    // sorting according to reverse ordering
    Collections.sort(aList, Collections.reverseOrder());
    System.out.println(aList);
    
    // print the reverse order
    for (int i = 0; i < aList.size(); i++) {
      System.out.print(aList.get(i) + " ");
    }
  }
}

class BinarySearchOnACollection {
  public static void BinarySearchOnACollection(List<String> aList) {
    // Add elements
    aList.add("Shoes");
    aList.add("Toys");
    aList.add("Horse");
    aList.add("Ball");
    aList.add("Grapes");

    System.out.println(aList);
     
    // sort the list
    Collections.sort(aList);
    System.out.println(aList);
    
    // binarySearch on the list
    System.out.println("The index of Horse is "+ Collections.binarySearch(aList, "Horse"));
    
    // binarySearch on the list
    System.out.print("The index of Dog is " + Collections.binarySearch(aList, "Dog"));
  }
}

class CopyOneCollectionToAnother {
  public static void CopyOneCollectionToAnother(List<String> aList) {
    // create destination list
    List<String> destination_List = new ArrayList<>();
    
    // add elements
    destination_List.add("Shoes");
    destination_List.add("Toys");
    destination_List.add("Horse");
    destination_List.add("Tiger");
    
    // print the elements
    System.out.println("The Original Destination list is ");
    System.out.println(destination_List);
    for (int i = 0; i < destination_List.size(); i++) {
      System.out.print(destination_List.get(i) + " ");
    }
    System.out.println();
 
    // create source list
    List<String> source_List = new ArrayList<>();
    source_List.add("Bat");
    source_List.add("Frog");
    source_List.add("Lion");
    System.out.println(source_List);

    // copy the elements from source to destination
    Collections.copy(destination_List, source_List);
    System.out.println(destination_List);
 
    // printing the modified list
    System.out.println("The Destination List After copying is ");
    for (int i = 0; i < destination_List.size(); i++) {
      System.out.print(destination_List.get(i) + " ");
    }
  }
}

class DisjointCollectionsExample {
  public static void DisjointCollectionsExample(List<String> list1) {
    // add elements to list1
    list1.add("Shoes");
    list1.add("Toys");
    list1.add("Horse");
    list1.add("Tiger");
    System.out.println(list1);

    // create list2
    List<String> list2 = new ArrayList<>();
     
    // add elements to list2
    list2.add("Bat");
    list2.add("Frog");
    list2.add("Lion");
    System.out.println(list2);
    
    // check if disjoint or not
    System.out.println(Collections.disjoint(list1, list2));
    System.out.println(list1);
    System.out.println(list2);
  }
}

public class chapter63_CollectionsClass_Operations {
  public static void main(String[] args) {
    // create a list
    List<String> aList = new ArrayList<>();

    // add aList to the list
    aList.add("Shoes");
    aList.add("Toys");
    System.out.println(aList);

    System.out.println("\tAddingElementsCollectionExample");
    AddingElementsCollectionExample ac = new AddingElementsCollectionExample();
    ac.AddingElementsCollectionExample(aList);

    System.out.println();
		 
    System.out.println("\n\tSortingCollectionExample");
    SortingCollectionExample sc = new SortingCollectionExample();
    sc.SortingCollectionExample(aList);

    System.out.println();

    System.out.println("\n\tBinarySearchOnACollection");
    BinarySearchOnACollection bsc = new BinarySearchOnACollection();
    bsc.BinarySearchOnACollection(aList);

    System.out.println();

    System.out.println("\n\tCopyOneCollectionToAnother");
    CopyOneCollectionToAnother cc = new CopyOneCollectionToAnother();
    cc.CopyOneCollectionToAnother(aList);

    System.out.println();

    System.out.println("\n\tDisjointCollectionsExample");
    DisjointCollectionsExample dc = new DisjointCollectionsExample();
    dc.DisjointCollectionsExample(aList);
  }
}