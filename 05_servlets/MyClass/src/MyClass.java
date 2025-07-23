// class A{
////	public A() {
////		System.out.println("A");
////	}
//	public void xyz() {
//		System.out.println("A-xyz");
//	}
//}
// class B extends A{
////	public B() {
////		System.out.println("B");
////	}
//	public void xyz() {
//		System.out.println("B-xyz");
//
//	}
//}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class P{
  public void run(){
    System.out.println("Pr");
    walk();}
  public void walk(){
    System.out.println("Pw");

  }
}
class C extends P{
  public void run(){
    System.out.println("Cr");
    super.run();}
  public void walk(){
    System.out.println("Cw");
    super.walk();}
}

public class MyClass {
  //
  //	public static void main(String args[]) {
  //		A a=new B();
  //		a.xyz();
  //	}
  public static void main(String[] args) {
    System.out.println("Hello, World!"); 
    P p = new C();
    p.run();
  }
}
