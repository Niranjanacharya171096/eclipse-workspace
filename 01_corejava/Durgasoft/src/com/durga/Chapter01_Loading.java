package com.durga;

import java.lang.reflect.*;

class Student {
private String name;
private int rollNo;
public String getName() {
return name;
}
public void setRollNo(int rollNo) { 
this.rollNo=rollNo; 
}
} 

public class Chapter01_Loading {
public static void main(String args[]) {
Student s=new Student();
Class c=s.getClass();
System.out.println(c.getName());
Method[] m=c.getDeclaredMethods();
for (int i=0; i<m.length; i++)
System.out.println(m[i]);
Field[] f=c.getDeclaredFields();
for (int i=0; i<f.length; i++)
System.out.println(f[i]);
}
}