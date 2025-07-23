package com.durga;

public class Chapter01_HeapArea {
  public static void main(String[] args) {
    long mb = 1024 * 1024;
    Runtime r = Runtime.getRuntime();
    System.out.println("Max Memory: " + r.maxMemory() / mb);
    System.out.println("Total Memory: " + r.totalMemory() / mb);
    System.out.println("Free Memory: " + r.freeMemory() / mb);
    System.out.println("Consumed memory:" + (r.totalMemory() - r.freeMemory()) / mb);

    long kb = 1024;
    System.out.println("Max Memory: " + r.maxMemory() / kb);
    System.out.println("Total Memory: " + r.totalMemory() / kb);
    System.out.println("Free Memory: " + r.freeMemory() / kb);
    System.out.println("Consumed memory:" + (r.totalMemory() - r.freeMemory()) / kb);
  }
}
