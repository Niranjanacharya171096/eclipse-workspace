package com.corejava;

import java.lang.reflect.Field;  
import java.lang.reflect.Method;

//Java code to demonstrate use of Class object created by JVM
public class chapter07_JVMWorking_ClassObjectCreation {
  public static void main(String[] args) {
    // String class is loaded by bootstrap loader, and
    // bootstrap loader is not Java object, hence null
    System.out.println(String.class.getClassLoader());
      
    // chapter07_ClassObjectCreation class is loaded by Application loader
    System.out.println(chapter07_JVMWorking_ClassObjectCreation.class.getClassLoader());
    
    Student stdnt1 = new Student();
    System.out.println(stdnt1);
    
    // Getting hold of Class object created by JVM.
    Class cls1 = stdnt1.getClass();
    System.out.println(stdnt1.getClass() + "\n" + cls1);
    
    // Printing type of object using cls1.
    System.out.println(cls1.getName());
    
    // getting all methods in an array
    Method mtd[] = cls1.getDeclaredMethods();
    for (Method method: mtd)
      System.out.println(method.getName());
        
    // getting all fields in an array
    Field fld[] = cls1.getDeclaredFields();
    for (Field field: fld)
      System.out.println(field.getName());
       
    Student stdnt2 = new Student();
    System.out.println(stdnt2);
    // cls2 will point to same object where cls1 is pointing
    Class cls2 = stdnt2.getClass();
    System.out.println(cls1==cls2); // true
  } 
}

//A sample class whose information is fetched above using its Class object.
class Student {
  private String name;
  private int roll_No;

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public int getRoll_no() { return roll_No; }
  public void setRoll_no(int roll_no) { this.roll_No = roll_no; }
}
