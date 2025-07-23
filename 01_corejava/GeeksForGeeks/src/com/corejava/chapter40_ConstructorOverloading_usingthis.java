package com.corejava;

class Box2 { 
  double width, height, depth; 
  int boxNo; 
    
  // constructor used when all dimensions and boxNo specified 
  Box2(double w, double h, double d, int num) { 
    width = w; 
    height = h; 
    depth = d; 
    boxNo = num; 
  } 
    
    // constructor used when no dimensions specified 
  Box2() { 
    // an empty box 
    width = height = depth = 1; 
  } 
    
  // constructor used when only boxNo specified 
  Box2(int num) { 
    // this() is used for calling the default constructor from parameterized constructor 
    this(); 
    boxNo = num; 
  } 
} 

// Driver code 
public class chapter40_ConstructorOverloading_usingthis { 
  public static void main(String[] args) { 
    // create box using only boxNo
    Box2 box2 = new Box2(5); 

    // getting initial width of box2 
    System.out.println(box2.width); 
  } 
}
