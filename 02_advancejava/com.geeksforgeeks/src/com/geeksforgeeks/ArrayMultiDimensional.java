package com.geeksforgeeks;

class ArrayMultiDimensional { 
  public static void main(String args[]) { 
    // declaring and initializing 2D array 
    int arr[][] = { 
          {2,7,9},
          {3,6,1},
          {7,4,2} 
    }; 
    
    // printing 2D array 
    for (int i=0; i<3 ;i++) { 
    for (int j=0; j<3 ;j++) 
    System.out.print(arr[i][j] + " "); 
    System.out.println(); 
    } 
  } 
} 

//class GFG { 
//  public static void main(String[] args) { 
//    int[][] arr = new int[10][20]; 
//    arr[0][0] = 1; 
//    
//    System.out.println("arr[0][0] = " + arr[0][0]); 
//  } 
//} 

//class GFG { 
//  public static void main(String[] args) {  
//    int[][] arr = { { 1, 2 }, { 3, 4 } }; 
//    
//    for (int i = 0; i< 2; i++) 
//      for (int j = 0; j< 2; j++) 
//        System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]); 
//  } 
//} 

//class GFG { 
//  public static void main(String[] args) { 
//    int[][] arr = { { 1, 2 }, { 3, 4 } }; 
//    System.out.println("arr[0][0] = " + arr[0][0]); 
//  } 
//} 

//class GFG { 
//  public static void main(String[] args) { 
//    int[][] arr = { { 1, 2 }, { 3, 4 } }; 
//    
//    for (int i = 0; i< 2; i++) { 
//      for (int j = 0; j < 2; j++) { 
//        System.out.print(arr[i][j] + " "); 
//      } 
//      System.out.println(); 
//    } 
//  } 
//} 

//class GFG { 
//  public static void main(String[] args) { 
//    int[][][] arr = new int[10][20][30]; 
//    arr[0][0][0] = 1; 
//    
//    System.out.println("arr[0][0][0] = " + arr[0][0][0]); 
//  } 
//} 

//class GFG { 
//  public static void main(String[] args) { 
//    int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } }; 
//    
//    for (int i = 0; i< 2; i++) 
//    for (int j = 0; j< 2; j++) 
//    for (int z = 0; z< 2; z++) 
//    System.out.println("arr[" + i + "]["+ j + "]["+ z + "] = " + arr[i][j][z]); 
//  } 
//} 

//class GFG { 
//  public static void main(String[] args) { 
//    int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } }; 
//
//    System.out.println("arr[0][0][0] = " + arr[0][0][0]); 
//  } 
//} 

//class GFG { 
//  public static void main(String[] args) { 
//    int[][][] arr = { { { 1, 2 }, { 3, 4 } }, 
//                      { { 5, 6 }, { 7, 8 } } 
//                    }; 
//      
//    for (int i = 0; i< 2; i++) { 
//      for (int j = 0; j< 2; j++) { 
//        for (int k = 0; k< 2; k++) { 
//          System.out.print(arr[i][j][k] + " "); 
//        } 
//        System.out.println(); 
//      } 
//      System.out.println(); 
//    } 
//  } 
//} 


