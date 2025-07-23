package com.corejava;

class classA { 
  /*protected*/interface Interface { 
    void show(); 
  } 
} 

class Testing implements classA.Interface { 
  public void show() { 
    System.out.println("show method of interface"); 
  } 
} 

class chapter56_NestedInterface_inClass { 
  public static void main(String[] args) { 
    classA.Interface obj; 
    Testing t = new Testing(); 
    obj=t; 
    obj.show(); 
  } 
} 
