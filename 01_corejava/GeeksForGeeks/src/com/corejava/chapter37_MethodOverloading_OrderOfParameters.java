package com.corejava;

import java.io.*;

class Geek1 {
  public void geekIdentity(String name, int id) {
    System.out.println("geekName:" + name + " "+ "Id:" + id);
  }
  public void geekIdentity(int id, String name) {
    System.out.println("Id:" + id + " "+ "geekName:" + name);
  }
}

class chapter37_MethodOverloading_OrderOfParameters {
  public static void main(String[] args) {
    Geek1 geek1 = new Geek1();
    
    geek1.geekIdentity("Mohit", 1);
    geek1.geekIdentity("shubham", 2);
  }
}
