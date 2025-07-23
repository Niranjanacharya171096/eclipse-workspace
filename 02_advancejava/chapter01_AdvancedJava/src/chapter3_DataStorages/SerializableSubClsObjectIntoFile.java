package chapter3_DataStorages;

import java.io.*;
import chapter3_DataStorages.ImplementSerializable;

public class SerializableSubClsObjectIntoFile {
  public static void main (String [] args) throws Exception{
//Step 1
    ImplementSerializable emp = new ImplementSerializable ();
//Step 2
    emp.setEmpno (88);
    emp.setEname ("Niranjan");
    emp.setSal (3000.00f);
//Step 3
    FileOutputStream fos = new FileOutputStream ("employee.txt");
//Step 4
    ObjectOutputStream oos = new ObjectOutputStream (fos);
//Step 5
    oos.writeObject (emp);
//Step 6
    System.out.println ("EMPLOYEE OBJECT SAVED SUCCESSFULLY in employee.txt file..."+emp);
    oos.close ();
    fos.close ();
  }
}
