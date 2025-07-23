package chapter3_DataStorages;

import java.io.*; 
import chapter3_DataStorages.ImplementSerializable;

class DeSerializableFile {   
  public static void main (String [] args) throws Exception {
//Step 1
    ImplementSerializable emp = new ImplementSerializable (); 
//Step 2
    FileInputStream fis = new FileInputStream ("employee.txt"); 
//Step 3
    ObjectInputStream ois = new ObjectInputStream (fis);      
//Step 4
    Object obj = ois.readObject ();     
//Step 5
    emp = (ImplementSerializable) obj; 
//Step 6
    System.out.println ("EMP NO : "+emp.getEmpno ()); 
    System.out.println ("EMP NAME : "+emp.getEname ()); 
    System.out.println ("EMP SALARY : "+emp.getSal ()); 
//Step 7
    ois.close ();     
    fis.close (); 
  } 
} 
