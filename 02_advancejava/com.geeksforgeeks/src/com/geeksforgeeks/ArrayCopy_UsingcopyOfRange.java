package com.geeksforgeeks;
import java.util.Arrays;

class ArrayCopy_UsingcopyOfRange {
  public static void main(String[] args) {
    int a[] = { 1, 8, 3, 5, 9, 10 };  
    // Create an array b[]Copy elements of a[] to b[]
    int b[] = Arrays.copyOfRange(a, 2, 6);
    // Change b[] to verify thatb[] is different from a[]
    System.out.println("Contents of a[] ");
    for (int i = 0; i<a.length; i++)
      System.out.print(a[i] + " ");
    
    System.out.println("\n\nContents of b[] ");
    for (int i = 0; i<b.length; i++)
      System.out.print(b[i] + " ");
  }
}
