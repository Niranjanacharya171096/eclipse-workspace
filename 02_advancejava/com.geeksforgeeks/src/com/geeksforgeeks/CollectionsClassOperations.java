package com.geeksforgeeks;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;


//Java program to demonstrate adding 
//elements using addAll() method
class AddingElementsCollectionExample {
 public static void AddingElementsCollectionExample(List<String> items) {
     // Add one or more elements
     Collections.addAll(items, "Fruits", "Bat", "Ball");
     
     System.out.println(items);
     // print the list contents
     for (int i = 0; i < items.size(); i++) {
         System.out.print(items.get(i) + " ");
     }
 }
}

//Java program to demonstrate sorting
//a Collections using sort() method
class SortingCollectionExample {
 public static void SortingCollectionExample(List<String> items) {
     // add one or more elements
     Collections.addAll(items, "Fruits", "Bat", "Mouse");

     System.out.println(items);

     // sorting according to default ordering
     Collections.sort(items);

     System.out.println(items);

     // print the elements
     for (int i = 0; i < items.size(); i++) {
         System.out.print(items.get(i) + " ");
     }
     System.out.println();

     // sorting according to reverse ordering
     Collections.sort(items, Collections.reverseOrder());
     System.out.println(items);

     // print the reverse order
     for (int i = 0; i < items.size(); i++) {
         System.out.print(items.get(i) + " ");
     }
 }
}

//Java program demonstrating Binary Search
//using Collections.binarySearch()
class BinarySearchOnACollection {
 public static void BinarySearchOnACollection(List<String> items) {
     // Add elements
     items.add("Shoes");
     items.add("Toys");
     items.add("Horse");
     items.add("Ball");
     items.add("Grapes");

     System.out.println(items);

     // sort the list
     Collections.sort(items);
     System.out.println(items);

     // binarySearch on the list
     System.out.println("The index of Horse is "+ Collections.binarySearch(items, "Horse"));

     // binarySearch on the list
     System.out.print("The index of Dog is " + Collections.binarySearch(items, "Dog"));
 }
}

class CopyOneCollectionToAnother {
    public static void CopyOneCollectionToAnother(List<String> items) {
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

//Java Program to demostrate the
//working of the disjoint function

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

public class CollectionsClassOperations {
	 public static void main(String[] args) {
		// create a list
	     List<String> items = new ArrayList<>();

	     // add items to the list
	     items.add("Shoes");
	     items.add("Toys");
	     System.out.println(items);

	     System.out.println("\tAddingElementsCollectionExample");
		 AddingElementsCollectionExample ac = new AddingElementsCollectionExample();
		 ac.AddingElementsCollectionExample(items);

		 System.out.println();
		 
	     System.out.println("\n\tSortingCollectionExample");
		 SortingCollectionExample sc = new SortingCollectionExample();
		 sc.SortingCollectionExample(items);

		 System.out.println();

		 System.out.println("\n\tBinarySearchOnACollection");
		 BinarySearchOnACollection bsc = new BinarySearchOnACollection();
		 bsc.BinarySearchOnACollection(items);

		 System.out.println();

		 System.out.println("\n\tCopyOneCollectionToAnother");
		 CopyOneCollectionToAnother cc = new CopyOneCollectionToAnother();
		 cc.CopyOneCollectionToAnother(items);

		 System.out.println();

		 System.out.println("\n\tDisjointCollectionsExample");
		 DisjointCollectionsExample dc = new DisjointCollectionsExample();
		 dc.DisjointCollectionsExample(items);
	 }
}