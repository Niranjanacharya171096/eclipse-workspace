package com.corejava;

public class chapter29_MultiDimensionalArrays_All3DArrays {
  public static void main(String args[]) { 
    System.out.print("1D - ARRAY\n"); 
    // declares an Array of integers. 
    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
    for (int i = 0; i < intArray.length; i++) 
      System.out.print(intArray[i] + " ");
    System.out.println(" ");
    int[] arr1d; 
            
    // allocating memory for 5 integers. 
    arr1d = new int[5]; 
      
    // initialize the first elements of the array 
    arr1d[0] = 10; 
        
    // initialize the second elements of the array 
    arr1d[1] = 20; 
        
    //so on... 
    arr1d[2] = 30; 
    arr1d[3] = 40; 
    arr1d[4] = 50; 
        
    // accessing the elements of the specified array 
    for (int i = 0; i < arr1d.length; i++) 
      System.out.println("arr1d[" + i +  "]: "+ arr1d[i]);           

    System.out.print("\n2D - ARRAY\n"); 
    int[][] arr2d = { { 1, 2 , 3}, { 4, 5, 6 } }; 
      
    for (int i = 0; i < arr2d.length; i++) { //2
      for (int j = 0; j < arr2d[i].length; j++) { //3 
        System.out.print("arr2d["+i+"]["+j+"]: " + arr2d[i][j] + " "); 
      } 
      System.out.println(); 
    } 
    
    System.out.print("\n3D - ARRAY\n"); 
    int[][][] arr3d = { 
        { { 1, 2, 3}, { 4, 5, 6} }, 
        { { 7, 8, 9}, { 10, 11, 12} },
        { { 13, 14, 15}, { 16, 17, 18} }, 
        { { 19, 20, 21}, { 22, 23, 24} } 
    }; 

    for (int[][] a2d : arr3d) { 
      for (int[] a1d : a2d) { 
        for (int item : a1d) { 
          System.out.print(item + " "); 
        } 
        System.out.println(); 
      }   
      System.out.println(); 
    } 
    
    for (int arrays = 0; arrays < arr3d.length; arrays++) { //4
      for (int rows = 0; rows < arr3d[arrays].length; rows++) { //2 
        for (int columns = 0; columns < arr3d[arrays][rows].length; columns++) { //3 
          System.out.print("arr3d["+arrays+"]["+rows+"]["+columns+"]: " + arr3d[arrays][rows][columns] + " "); 
        } 
        System.out.println(); 
      }   
      System.out.println(); 
    }
    System.out.println(arr3d.length + " " + arr3d[0].length + " " + arr3d[0][0].length + arr3d[0][0].length ); 
  } 
}
