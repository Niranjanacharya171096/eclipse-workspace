package com.corejava;
/** 
* <h1>Find average of three numbers!</h1>
* The FindAvg program implements an application that 
* simply calculates average of three integers and Prints 
* the output on the screen. 
* 
* @author  Pratik Agarwal 
* @version 1.0 
* @since   2017-02-18 
*/
public class chapter13_Comments_CommentTags { 
/** 
  * This method is used to find average of three integers. 
  * @paramnumA This is the first parameter to findAvg method 
  * @paramnumB  This is the second parameter to findAvg method 
  * @paramnumC  This is the second parameter to findAvg method 
  * @return int This returns average of numA, numB and numC. 
  */
  public int findAvg(int numA, int numB, int numC) { 
    return (numA + numB + numC)/3; 
  } 

/** 
  * This is the main method which makes use of findAvg method. 
  * @paramargs Unused. 
  * @return Nothing. 
  */

  public static void main(String args[]) { 
    chapter13_Comments_CommentTags obj = new chapter13_Comments_CommentTags(); 
    int avg = obj.findAvg(10, 20, 30); 

    System.out.println("Average of 10, 20 and 30 is:" + avg); 
  } 
} 
