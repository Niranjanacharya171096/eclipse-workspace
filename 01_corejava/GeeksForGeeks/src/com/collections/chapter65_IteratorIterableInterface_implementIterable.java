package com.collections;

import java.util.*; 

//Custom Linked List class using Generics 
class List<T> implements Iterable<T> { 
  Node<T> head, tail; 
 
  // add new Element at tail of the linked list in O(1) 
  public void add(T data) { 
    Node<T> node = new Node<>(data, null); 
    System.out.println("\nNode: " + node); 
    
    if (head == null) {
      tail = head = node; 
      System.out.println("Head: " + head + " Tail: " + tail ); 
    } else { 
      tail.setNext(node); 
      tail = node; 
      System.out.println("Tail: " + tail + " Node: " + node ); 
    } 
  } 
   
  // return Head 
  public Node<T> getHead() { 
    System.out.println("Head: " + head); 
    return head; 
  } 
   
  // return Tail 
  public Node<T> getTail() { 
    System.out.println(" Tail: " + tail); 
    return tail; 
  } 
   
  // return Iterator instance 
  public Iterator<T> iterator() { 
    return new ListIterator<T>(this); 
  }
}

class ListIterator<T> implements Iterator<T> { 
  Node<T> current; 
     
  // initialize pointer to head of the list for iteration 
  public ListIterator(List<T> list) { 
    current = list.getHead(); 
    System.out.println("Current: " + current); 
  } 
   
  // returns false if next element does not exist 
  public boolean hasNext() { 
    return current != null; 
  }  
   
  // return current data and update pointer 
  public T next() { 
    T data = current.getData(); 
    current = current.getNext(); 
    System.out.println("Data: " + data + " Current: " + current); 

    return data; 
  } 
   
  // implement if needed 
  public void remove() { 
    throw new UnsupportedOperationException(); 
  }  
} 

//Constituent Node of Linked List 
class Node<T> { 
  T data; 
  Node<T> next; 
  public Node(T data, Node<T> next) { 
    this.data = data; 
    this.next = next; 
    System.out.println("Data: " + data + " Next: " + next); 
  } 
   
  // Setter getter methods for Data and Next Pointer 
  public void setData(T data) { 
    this.data = data; 
    System.out.println("SetData: " + data); 
  }  
   
  public void setNext(Node<T> next) { 
    this.next = next; 
    System.out.println("SetNext: " + next); 
  } 
   
  public T getData() { 
    System.out.println("getData: " + data); 
    return data; 
  } 
   
  public Node<T> getNext() { 
    System.out.println(" getNext: " + next); 
    return next; 
  } 
} 

//Driver class 
class chapter65_IteratorIterableInterface_implementIterable { 
  public static void main(String[] args) { 
    // Create Linked List 
    List<String> myList = new List<>(); 
       
    // Add Elements 
    myList.add("abc"); 
    myList.add("mno"); 
    myList.add("pqr"); 
    myList.add("xyz"); 

    System.out.println(myList); 
    
    // Iterate through the list using For Each Loop 
    for (String string: myList) 
      System.out.println(string); 
  } 
} 