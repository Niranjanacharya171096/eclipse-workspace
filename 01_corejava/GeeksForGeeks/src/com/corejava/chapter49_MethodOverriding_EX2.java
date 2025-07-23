package com.corejava;

//Base Class 
class Employee2 { 
  public static int base = 10000; 
  int salary() { 
    return base; 
  } 
} 

//Inherited class 
class Manager extends Employee2 { 
  //This method overrides salary() of Parent 
  int salary() { 
    return base + 20000; 
  } 
} 

//Inherited class 
class Clerk extends Employee2 { 
  //This method overrides salary() of Parent 
  int salary() { 
    return base + 10000; 
  } 
} 

//Driver class 
class chapter49_MethodOverriding_EX2 { 
  //This method can be used to print the salary of 
  //any type of employee using base class reference 
  static void printSalary(Employee2 e) { 
    System.out.println(e.salary()); 
  } 
  
  public static void main(String[] args) { 
    Employee2 obj1 = new Manager(); 
  
    //We could also get type of employee using one more overridden method.lokegetType() 
    System.out.print("Manager's salary: "); 
    printSalary(obj1); 
    
    Employee2 obj2 = new Clerk(); 
    System.out.print("Clerk's salary: "); 
    printSalary(obj2); 
  } 
}
