package com.durga;

class Student2{
String name;
int rollno;
Student2(String name,int rollno){
this.name=name;
this.rollno=rollno;
}
}
public class Chapter08_equals_Method {
public static void main(String[] args){ 
Student2 s1=new Student2("vijayabhaskar",101); 
Student2 s2=new Student2("bhaskar",102); 
Student2 s3=new Student2("vijayabhaskar",102);
Student2 s4=new Student2("vijayabhaskar",101);
Student2 s5=s1;
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s1.equals(s5));
}
}
