package com.geeksforgeeks;


import java.io.*; 

interface Vehicle {      
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 
  
class Bicycle1 implements Vehicle{ 
      
    int speed; 
    int gear; 
      

     // to change gear 
    @Override
    public void changeGear(int newGear){  
        System.out.println("speed: " + speed + " gear: " + gear); 
        gear = newGear; 
    } 
      
    // to increase speed 
    @Override
    public void speedUp(int increment){ 
        System.out.println("speed: " + speed + " gear: " + gear); 
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){ 
        speed = speed - decrement; 
    } 
    public void printStates() { 
         System.out.println("speed: " + speed + " gear: " + gear); 
    } 
} 
  
class Bike implements Vehicle { 
      
    int speed; 
    int gear; 
      
    // to change gear 
    @Override
    public void changeGear(int newGear) { 
        gear = newGear; 
    } 
      
    // to increase speed 
    @Override
    public void speedUp(int increment) { 
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed + " gear: " + gear); 
    } 
}

class InterfaceExample { 
    public static void main (String[] args) { 
        // creating an inatance of Bicycle1  
        // doing some operations  
        Bicycle1 Bicycle1 = new Bicycle1(); 
        Bicycle1.changeGear(2); 
        Bicycle1.speedUp(3); 
        Bicycle1.applyBrakes(1); 
          
        System.out.println("Bicycle1 present state:"); 
        Bicycle1.printStates(); 
          
        // creating instance of the bike. 
        Bike bike = new Bike(); 
        bike.changeGear(1); 
        bike.speedUp(4); 
        bike.applyBrakes(3); 
          
        System.out.println("Bike present state:"); 
        bike.printStates(); 
    } 
} 