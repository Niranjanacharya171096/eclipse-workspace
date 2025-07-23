package chapter2_Reflection;

import java.lang.reflect.Field; 

class Fieldcls { 
  void printFields (Class cls) { 
    Field fld []=cls.getFields (); 
    System.out.println ("NUMBER OF FIELDS : "+fld.length);    
    for (int i=0; i<fld.length; i++) { 
      String fldName=fld [i].getName (); 
      Class rtype=fld [i].getType (); 
      String fldType=rtype.getName (); 
      System.out.println (fldType+" "+fldName); 
    } 
  } 
}

class FieldsDemo {
  public static void main (String [] args) { 
    if (args.length==0) { 
      System.out.println ("PLEASE PASS THE CLASS NAME..!"); 
    } else {        
      try { 
        Class cls=Class.forName (args [0]);         
        Fieldcls flds=new Fieldcls ();          
        flds.printFields (cls); 
      } catch (ClassNotFoundException cnfe) { 
        System.out.println (args [0]+"NOT FOUND..."); 
      } 
    } 
  } 
} 
