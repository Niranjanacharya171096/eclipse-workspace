package com.corejava;

import java.io.*;
import java.lang.*;
import java.util.*;

class one2 {
  public void print_geek() {
    System.out.println("Geeks");
  }
}

class two2 extends one2 {
  public void print_for() { 
    System.out.println("for"); 
  }
}

class three2 extends two2 { 
  public void print_geek() {
    System.out.println("Geeks");
  }
}

// Drived class
public class chapter46_Inheritance_MultilevelInheritance {
  public static void main(String[] args) {
    three2 g = new three2();
    g.print_geek();
    g.print_for();
    g.print_geek();
  }
}
