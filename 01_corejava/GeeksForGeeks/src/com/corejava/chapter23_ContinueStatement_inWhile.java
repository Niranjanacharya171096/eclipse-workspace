package com.corejava;

public class chapter23_ContinueStatement_inWhile {   
  public static void main(String args[]) { 
    int count = 20; 
    
    //While loop for iteration 
    while (count >= 0) { 
      if (count == 7 || count == 15) { 
        count--; 
        //Decrementing variable initialized above 
        //Showing continue execution inside loop skipping when count==7 or count==15 
        continue; 
      } 
    
      //Printing values after continue statement 
      System.out.print(count + " "); 
      //Decrementing the count variable 
      count--; 
    } 
  } 
}
