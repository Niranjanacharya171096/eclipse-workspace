package com.corejava;

class chapter53_ThrowThrows_throw {
  static void fun() {
    try {
      throw new NullPointerException("demo");
    } catch(NullPointerException e) {
      System.out.println("Caught inside fun().");
      throw e; // rethrowing the exception
    }
  }
  public static void main(String args[]) {
    try {
      fun();
    } catch(NullPointerException e) {
      System.out.println("Caught in main.");
    }
  }
}
