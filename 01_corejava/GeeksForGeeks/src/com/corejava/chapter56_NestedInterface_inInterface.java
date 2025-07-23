package com.corejava;

interface Interface1 { 
  interface Interface2 { 
    void show();     
  } 
} 

class Testing1 implements Interface1.Interface2 { 
  public void show() { 
    System.out.println("show method of interface"); 
  }  
}  

class chapter56_NestedInterface_inInterface { 
  public static void main(String[] args) { 
    Interface1.Interface2 obj; 
    Testing1 t = new Testing1(); 
    obj = t; 
    obj.show(); 
  }  
}
