package com.geeksforgeeks;

class Dog {  
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
 
    // Constructor Declaration of Class
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
 
    // method 1
    public String getName() {
        return name;
    }
 
    // method 2
    public String getBreed() {
        return breed;
    }
 
    // method 3
    public int getAge() {
        return age;
    }
 
    // method 4
    public String getColor() {
        return color;
    }
 
//    @Override
//    public String toString() {
//        return("Name:"+this.name+"breed:"+this.getBreed()+"age:"+this.getAge()+"color:"+this.getColor());
//    }
}
public class ToStringFunc {
	public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy);
        System.out.println(tuffy.toString());
    }
}
