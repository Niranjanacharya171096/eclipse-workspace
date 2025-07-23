package com.durga;

abstract class Parent1{
Parent1(){
System.out.println("\nParent1: "+this.hashCode()); //here this means child class object
}
}
class Child1 extends Parent1{
Child1(){
System.out.println("Child1: "+this.hashCode());//11394033
}
}
class Child2 extends Child1{
Child2(){
System.out.println("Child2: "+this.hashCode());//11394055
}
}
public class Chapter12_Constructors {
public static void main(String[] args){
Child1 c1=new Child1();
System.out.println("c1: "+c1.hashCode());//11394033
Child2 c2=new Child2();
 System.out.println("c2: "+c2.hashCode());//11394055
}
}