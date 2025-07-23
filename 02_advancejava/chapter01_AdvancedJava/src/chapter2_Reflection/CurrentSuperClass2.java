package chapter2_Reflection;

public class CurrentSuperClass2 {
  public static void main (String [] args) { 
    if (args.length==0) { 
      System.out.println ("PLEASE PASS THE CLASS NAME..!"); 
    } else { 
      try { 
        Class cls=Class.forName (args [0]);       
        printSuperclass (cls); 
      } catch (ClassNotFoundException cnfe) { 
        System.out.println (args [0]+" DOES NOT EXISTS..."); 
      } 
    } 
  }
  static void printSuperclass (Class cls) { 
    String clsName=cls.getName (); 
    Class sprcls=cls.getSuperclass (); 
    String sprclsName=sprcls.getName (); 
    System.out.println (sprcls); 

    System.out.println (sprclsName+" IS THE SUPER CLASS OF "+clsName); 
  }
}
