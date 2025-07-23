package com.durga;

class Parent {
public void property(){ 
System.out.println("cash"); 
}
public void marry() { 
System.out.println("Parent marry"); 
//overridden method 
}
} class Child extends Parent{ 
//overriding
public void marry() {
System.out.println("Child marry"); 
}
}
public class Chapter11_Overriding {
public static void main(String[] args) {
Parent p=new Parent();
p.property();
p.marry();//Parent marry (parent method)
Child c=new Child();
c.property();
c.marry();//Child marry (child method)
Parent p1=new Child();
p1.property();
p1.marry();//Child marry (child method)
}
}

