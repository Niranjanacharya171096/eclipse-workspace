package com.durga;

//interface Interf{
//int x=10;
//}
interface Left { public void methodOne();}
interface Right { public int methodOne(int i);}

public class Chapter14_Interfaces implements Left, Right {
public static void main(String[] args) {

//  int x=30;
//  System.out.println(Interf.x);
//  System.out.println(x);
}

@Override
public int methodOne(int i) {
  // TODO Auto-generated method stub
  return 0;
}

@Override
public void methodOne() {
  // TODO Auto-generated method stub
  
}

}
