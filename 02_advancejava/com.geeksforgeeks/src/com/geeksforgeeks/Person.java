package com.geeksforgeeks;

class Male { }
class Boy extends Male implements MyInterface{ }
interface MyInterface{ }

class Person {
  public static void main(String[] args) {
    Male obj1 = new Male();
    Male obj2 = new Boy();

    // As obj is of type person, it is not an instance of Boy or interface
    System.out.println("obj1 instanceof Person: "+ (obj1 instanceof Male));
    System.out.println("obj1 instanceof Boy: "+ (obj1 instanceof Boy));
    System.out.println("obj1 instanceofMyInterface: "+ (obj1 instanceof MyInterface));
    
    // Since obj2 is of type boy,whose parent class is person and it implements the interface
    //Myinterface…it is instance of all of these classes
    System.out.println("obj2 instanceof Person: "+ (obj2 instanceof Male));
    System.out.println("obj2 instanceof Boy: "+ (obj2 instanceof Boy));
    System.out.println("obj2 instanceofMyInterface: "+ (obj2 instanceof MyInterface));
  }
}
