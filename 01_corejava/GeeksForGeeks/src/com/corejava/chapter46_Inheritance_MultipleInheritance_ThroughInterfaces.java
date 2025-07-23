package com.corejava;

import java.io.*;
import java.lang.*;
import java.util.*;

interface one {
  public void print_geek();
}

interface two {
  public void print_for();
}

interface three extends one, two {
  public void  print_geek2();
}

class child implements three {
  @Override
  public void print_geek(){
    System.out.println("Geeks");
  }
  
  @Override
  public void print_for() {
    System.out.println("For");    
  }
  
  @Override
  public void  print_geek2() {
    System.out.println("Geeks");
  }
}

// Derived class
public class chapter46_Inheritance_MultipleInheritance_ThroughInterfaces {
  public static void main(String[] args) {
    child c = new child();
    c.print_geek();
    c.print_for();
    c.print_geek();
  }
}
