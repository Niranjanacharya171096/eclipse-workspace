package com.durga;

class Cat1 {
int j;
Cat1(int j) {
this.j=j;
}
}

class Dog1 implements Cloneable{
Cat1 c;
int i;
Dog1(Cat1 c, int i) {
this.c=c;
this.i=i;
}
@Override
public Object clone() 
throws CloneNotSupportedException {
return super.clone();
}
}

public class Chapter08_ShallowCloning {
public static void main(String[] args) throws CloneNotSupportedException {
Cat1 c=new Cat1(20);
Dog1 d1=new Dog1(c, 10);
System.out.println(d1.i +"......"+d1.c.j); //10......20
Dog1 d2=(Dog1)d1.clone();
d1.i=888;
d1.c.j=999;
System.out.println(d1.i +"......"+d1.c.j); //888......999
System.out.println(d2.i +"......"+d2.c.j); //10......999
}
}
