package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class ComparatorInterface2 {
  // instance member variables
  String Name;
  int Age;
  
  // parameterized constructor
  public ComparatorInterface2(String Name, Integer Age) {
    this.Name = Name;
    this.Age = Age;
  }
  
  public String getName() {
    return Name;
  }
  
  public void setName(String Name) {
    this.Name = Name;
  }
  
  public Integer getAge() {
    return Age;
  }
  
  public void setAge(Integer Age) {
    this.Age = Age;
  }
  
  // overriding toString() method
  @Override
  public String toString() {
    return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
  }
  
  static class CustomerSortingComparator implements Comparator<ComparatorInterface2> {
    @Override
    public int compare(ComparatorInterface2 customer1, ComparatorInterface2 customer2) {
      // for comparison
      int NameCompare = customer1.getName().compareTo(customer2.getName());
      int AgeCompare = customer1.getAge().compareTo(customer2.getAge());
      
      // 2-level comparison using if-else block
      if (NameCompare == 0) {
        return ((AgeCompare == 0) ? NameCompare: AgeCompare);
      } else {
        return NameCompare;
      }
    }
  }
}

class chapter61_ComparatorInterface_CollectionSort2 {
  public static void main(String[] args) {
    // create ArrayList to store ComparatorInterface2
    List<ComparatorInterface2> al = new ArrayList<>();
  
    // create customer objects using constructor initialization
    ComparatorInterface2 obj1 = new ComparatorInterface2("Ajay A", 27);
    ComparatorInterface2 obj2 = new ComparatorInterface2("Sneha NN", 23);
    ComparatorInterface2 obj3 = new ComparatorInterface2("Simran", 37);
    ComparatorInterface2 obj4 = new ComparatorInterface2("Ajay", 22);
    ComparatorInterface2 obj5 = new ComparatorInterface2("Ajay", 29);
    ComparatorInterface2 obj6 = new ComparatorInterface2("Sneha NP", 22);
    
    // add customer objects to ArrayList
    al.add(obj1);
    al.add(obj2);
    al.add(obj3);
    al.add(obj4);
    al.add(obj5);
    al.add(obj6);
    
    // before Sorting arraylist: iterate using Iterator
    Iterator<ComparatorInterface2> custIterator = al.iterator();
  
    System.out.println("Before Sorting:\n");
    while (custIterator.hasNext()) {
      System.out.println(custIterator.next());
    }
  
    // sorting using Collections.sort(al, comparator);
    Collections.sort(al, new ComparatorInterface2.CustomerSortingComparator());
    
    // after Sorting arraylist: iterate using enhanced for-loop
    System.out.println("\n\nAfter Sorting:\n");
    for (ComparatorInterface2 customer: al) {
      System.out.println(customer);
    }
  }
}
