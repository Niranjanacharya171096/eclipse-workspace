package chapter2_Reflection;

class A {
  void printA () { 
    Class cls = getClass (); 
    Class sprcls = cls.getSuperclass (); 
    System.out.println("\t*****class A - printA()*****");
    System.out.println ("NAME OF CURRENT CLASS : "+cls.getName ()); 
    System.out.println ("NAME OF THE SUPER CLASS : "+sprcls.getName ()); 
  }
}

class CurrentSuperClass {   
  static void printSuperclass (Object str) { 
    Class cls = str.getClass (); 
    Class sprcls = cls.getSuperclass (); 
    System.out.println("\t*****main() - printSuperclass()*****");
    System.out.println ("NAME OF CURRENT CLASS : "+cls.getName ()); 
    System.out.println ("NAME OF THE SUPER CLASS : "+sprcls.getName ()); 
  } 

  public static void main (String [] args) { 
//Pre-Defined Class
    String str = new String ("HELLO");      
    printSuperclass (str);
//User Defined class 
    A a = new A();
    a.printA (); 
  }
}
