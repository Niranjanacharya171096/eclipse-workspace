package com.geeksforgeeks;

class Addition {
	 
    // adding two integer values.
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
 
    // adding three integer values.
    public int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
 
    // adding three double values.
    public double add(double a, double b, double c) {
        double sum = a + b + c;
        return sum;
    }
}

class Geek {
    public void geekIdentity(String name, int id) {
        System.out.println("geekName:" + name + " "+ "Id:" + id);
    }
 
    public void geekIdentity(int id, String name) {
        System.out.println("Id:" + id + " "+ "geekName:" + name);
    }
}

public class MethodOverloading {
	public static void main(String[] args) {
        Addition ob = new Addition();

        int sum1 = ob.add(1, 2);
        System.out.println("sum of the two integer value:" + sum1);

        int sum2 = ob.add(1, 2, 3);
        System.out.println("sum of the three integer value:" + sum2);
        
        double sum3 = ob.add(1.0, 2.0, 3.0);
        System.out.println("sum of the three double value:" + sum3);
        
        Geek geek = new Geek();
        
        geek.geekIdentity("Mohit", 1);
        geek.geekIdentity(2, "shubham");


    }
}
