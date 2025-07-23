package com.durga;

abstract class Parent2{
  private int a;

  Parent2(int a){
    this.a=a;
    
    System.out.println(this.hashCode()+"::"+a);
  }
}
class child3 extends Parent2{
  private int b;
  private int c;

  child3(int a, int b, int c){
    super(a);
    this.b=b;
    this.c=c;
    System.out.println(this.hashCode()+"::"+a+" "+b+" "+c);
  }
}
//class child4 extends Parent2{
//  child4(){
//    System.out.println(this.hashCode());
//  }
//}
//class child5 extends Parent2{
//  child5(){
//    System.out.println(this.hashCode());
//  }
//}

public class Chapter14_Interfaces2 {
  public static void main(String[] args) {
    child3 c=new child3(3,5,6); 
  //  System.out.println(c.hashCode()); 
//    child5 c5=new child5(); 
    System.out.println(c.hashCode()); 
  }
}
