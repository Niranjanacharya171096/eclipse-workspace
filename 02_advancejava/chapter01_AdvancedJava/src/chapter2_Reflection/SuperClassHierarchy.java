package chapter2_Reflection;

class SuperClassHierarchy {   
  public static void main (String [] args) { 
    if (args.length==0) { 
      System.out.println ("PLEASE PASS THE CLASS NAME..!"); 
    } 
    else {        
      try { 
        Class cls=Class.forName (args [0]);         
        printHierarchy (cls); 
      } 
      catch (ClassNotFoundException cnfe) { 
        System.out.println (args [0]+" DOES NOT EXISTS..."); 
      } 
    } 
  } 
  static void printHierarchy (Class cls) { 
    Class cls1=cls; 
    String clsName=cls1.getName (); 
    System.out.println (clsName);   
    Class sprcls=cls1.getSuperclass ();   
    while (sprcls!=null) { 
      clsName=sprcls.getName ();      
      System.out.println (clsName); 
      cls1=sprcls; 
      sprcls=cls1.getSuperclass (); 
    } 
  } 
}
