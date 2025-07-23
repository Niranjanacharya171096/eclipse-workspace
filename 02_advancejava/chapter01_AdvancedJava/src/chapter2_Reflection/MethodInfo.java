package chapter2_Reflection;

import java.lang.reflect.*; 

class MethodInfo {
  public static void main (String [] args) {
    try { 
      if (args.length==0) { 
        System.out.println ("PLEASE PASS THE CLASS NAME..!"); 
      } else { 
        Class cls=Class.forName (args [0]);       
        printMethods (cls); 
      } 
    } catch (ClassNotFoundException cnfe) { 
      System.out.println (args [0]+" DOES NOT EXISTS..."); 
    } 
  }
  static void printMethods (Class cls) { 
    Method mtd []=cls.getMethods (); 
    System.out.println ("NUMBER OF METHODS = "+mtd.length);     
    System.out.println ("NAME OF THE CLASS : "+cls.getName ());     
    for (int i=0; i<mtd.length; i++) { 
      Class cls1=mtd [i].getReturnType (); 
      String rtype=cls1.getName (); 
      String mname=mtd [i].getName (); 
      System.out.print (rtype+" "+mname+"(");       
      Class mtdParam []=mtd [i].getParameterTypes ();   
      
      for (int j=0; j<mtdParam.length; j++) { 
        String ptype=mtdParam [i].getName (); 
        System.out.print (ptype+","); 
      } 
      System.out.println ("\b"+")"); 
    } 
  } 
}
