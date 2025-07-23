package chapter2_Reflection;

class ConstructorInfo {   
  public static void main (String [] args) { 
    if (args.length==0) { 
      System.out.println ("PLEASE PASS THE CLASS NAME..!"); 
    } else {        
      try { 
        Class cls=Class.forName (args [0]);         
        printConsts (cls); 
      } catch (ClassNotFoundException cnfe) { 
        System.out.println (args [0]+" DOES NOT EXISTS..."); 
      } 
    } 
  } 
  static void printConsts (Class cls) { 
    java.lang.reflect.Constructor cons []=cls.getConstructors ();
    
    System.out.println ("NUMBER OF CONSTRUCTORS = "+cons.length);   
    System.out.println ("NAME OF THE CLASS : "+cls.getName());
    
    for (int i=0; i<cons.length; i++) { 
      System.out.print (cls.getName ()+"(");        
      Class clsParam []=cons [i].getParameterTypes ();        
      for (int j=0; j<clsParam.length; j++) { 
        System.out.print (clsParam [j].getName ()+")"); 
      } 
      System.out.println ("\b"+")"); 
    } 
  } 
} 
