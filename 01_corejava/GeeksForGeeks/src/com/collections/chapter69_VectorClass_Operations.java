package com.collections;

import java.util.Vector;

public class chapter69_VectorClass_Operations {
  public static void main(String args[]) {
    // Java program to add elements in a Vector
    // create default vector
    Vector vec1 = new Vector();

    // Add elements using add() method
    vec1.add(1);
    vec1.add(2);
    vec1.add("geeks");
    vec1.add("forGeeks");
    vec1.add(3);

    // print the vector to the console
    System.out.println("Vector vec1 is " + vec1);

    // create generic vector
    Vector<Integer> vec2 = new Vector<Integer>();

    vec2.add(1);
    vec2.add(2);
    vec2.add(3);
    System.out.println("Vector vec2 is " + vec2);
    // Java program to change elements in a Vector
    // Creating an empty Vector
    Vector<Integer> vec3 = new Vector<Integer>();

    // Use add() method to add elements in the vector
    vec3.add(12);
    vec3.add(23);
    vec3.add(22);
    vec3.add(10);
    vec3.add(20);

    // Displaying the Vector
    System.out.println("Vector: " + vec3);

    // Using set() method to replace 12 with 21
    System.out.println("The Object that is replaced is: " + vec3.set(0, 21) + " with " + vec3.get(0));

    // Using set() method to replace 20 with 50
    System.out.println("The Object that is replaced is: " + vec3.set(4, 50) + " with " + vec3.get(4));

    // Displaying the modified vector
    System.out.println("The new Vector is:" + vec3);
    // Java program to remove elements in a Vector
    // create default vector of capacity 10
    Vector vec4 = new Vector();

    // Add elements using add() method
    vec4.add(5);
    vec4.add(6);
    vec4.add("Geeks");
    vec4.add("forGeeks");
    vec4.add(4);

    System.out.println("before removal: " + vec4);
    // removing first occurrence element at 1
    vec4.remove(1);

    // checking vector
    System.out.println("after removal: " + vec4);
    // Java program to iterate the elements in an Vector
    // create an instance of vector
    Vector<String> vec5 = new Vector<>();

    // Add elements using add() method
    vec5.add("Geeks");
    vec5.add("Geeks");
    vec5.add(1, "For");

    System.out.println("Vector iteration: " + vec5);

    // Using the Get method and the for loop
    for (int i = 0; i < vec5.size(); i++)
      System.out.print(vec5.get(i) + " ");

    System.out.println();

    // Using the for each loop
    for (String str : vec5)
      System.out.print(str + " ");
  }
}