//step-1
package chapter3_DataStorages; 

import java.io.*;

//ImplementSerializable (step-2) & Serializable (step-3)
public class ImplementSerializable implements Serializable {
//data members (step-4)
  int empno;
  String ename;
  float sal;
  
// above set methods (step-5)
  public void setEmpno (int empno){
    this.empno=empno;
  }
  public void setEname (String ename){
    this.ename=ename;
  }
  public void setSal (float sal){
    this.sal=sal;
  } 
  
// above get methods (step-6)
  public int getEmpno (){
    return empno;
  }
  public String getEname (){
    return ename;
  }
  public float getSal (){
    return sal;
  } 
}