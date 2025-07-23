package com.durga;

class Cat2 {
int j;
Cat2(int j) {
this.j=j;
}
}

class Dog2 implements Cloneable{
Cat2 c;
int i;
Dog2(Cat2 c, int i) {
this.c=c;
this.i=i;
}
public Object clone() 
throws CloneNotSupportedException {
Cat2 c1=new Cat2(c.j);
Dog2 d1=new Dog2(c1, i);
return d1;
}
}

public class Chapter08_DeepCloning {
public static void main(String[] args) throws CloneNotSupportedException {
Cat2 c=new Cat2(20);
Dog2 d1=new Dog2(c, 10);
System.out.println(d1.i +"......"+d1.c.j); //10......20
Dog2 d2=(Dog2)d1.clone();
d1.i=888;
d1.c.j=999;
System.out.println(d1.i +"......"+d1.c.j); //888......999
System.out.println(d2.i +"......"+d2.c.j); //10......20
}
}
