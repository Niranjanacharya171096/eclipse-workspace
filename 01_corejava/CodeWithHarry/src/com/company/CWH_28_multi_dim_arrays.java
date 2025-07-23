package com.company;

import java.util.*;

public class CWH_28_multi_dim_arrays {
    public static void main(String[] args) {
//        int [] marks; // A 1-D Array
//        int [][] flats; // A 2-D Array
    	  String [][] flats = new String[3][5]; //5 rooms in 3 floors
    	  
    	  Scanner sc = new Scanner(System.in);
    	  
    	  for(int i = 0; i < 3; i++) {
    		  for(int j = 0; j < 5; j++) {
    			  System.out.print("Enter " + i + "th floor " + (j+1) + "th room name/num : " );
    			  flats[i][j] = sc.nextLine();
        	  }
    	  }
    	  System.out.println(flats.length + " " + flats[0].length);
    	  for(int i=0;i<flats.length;i++){
              for(int j=0;j<flats[i].length;j++) {
                  System.out.print(flats[i][j]);
                  System.out.print(" ");
              }
              System.out.println("");
          }
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
        
        // Displaying the 2-D Array (for loop)
//        System.out.println("Printing a 2-D array using for loop");
//        for(int i=0;i<flats.length;i++){
//            for(int j=0;j<flats[i].length;j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
//        System.out.println(flats.length);
//        System.out.println(flats[0].length);
//        System.out.println(flats[1].length);
//        System.out.println(flats[2].length);
//        System.out.println(flats[3].length);
//        System.out.println(flats[4].length);
//        System.out.println(flats[5].length);
//        System.out.println(flats[6].length);
    }
}
