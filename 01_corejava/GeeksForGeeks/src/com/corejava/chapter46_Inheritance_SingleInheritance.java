package com.corejava;

import java.io.*; 
import java.lang.*;
import java.util.*;

class one1 {
  public void print_geek() {
    System.out.println("Geeks");
  }
}

class two1 extends one1 {
  public void print_for() { 
    System.out.println("for"); 
  }
}

// Driver class
public class chapter46_Inheritance_SingleInheritance {
  public static void main(String[] args) {
    two1 g = new two1();
    g.print_geek();
    g.print_for();
    g.print_geek();
  }
}
