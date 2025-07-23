package com.durga;

//class Student1{
//String name;
//int rollno;
//Student1(String name, int rollno){
//this.name=name;
//this.rollno=rollno;
//}
//}
//public class Chapter08_toString_Method {
//public static void main(String args[]){
//Student1 s1=new Student1("saicharan",101);
//Student1 s2=new Student1("ashok",102);
//System.out.println(s1); //Object class toString() method will be executed
//System.out.println(s1.toString());
//System.out.println(s2);
//}
//}

class Test{
public String toString(){
return "Test";
}
}
public class Chapter08_toString_Method {
public static void main(String[] args){
Integer i=new Integer(10);
String s=new String("ashok");
Sample t=new Sample();
System.out.println(i); //i.toString(10)
System.out.println(s); //s.toString(ashok)
System.out.println(t); //t.toString()
}
}
