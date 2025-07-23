package com.durga;

class Test2 {
public void methodOne(int i) {System.out.println("int -arg method:"+i);}
public void methodOne(float f) /*overloaded*/ {System.out.println("float-arg method:"+f);}
}
public class Chapter11_Overloading {
  public static void main(String[] args){
    Test2 t=new Test2();
    t.methodOne('a');//int -arg method:97
    t.methodOne(10l);//float-arg method:10.0
    t.methodOne(0);//CE:cannot find symbol
    }
}
