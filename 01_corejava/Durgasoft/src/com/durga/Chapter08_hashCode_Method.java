package com.durga;

//class Test1{
//int i;
//Test1(int i){
//this.i=i;
//}
//public int hashCode(){
//return i;
//}
//}
//public class Chapter08_hashCode_Method {
//public static void main(String[] args){
//Test1 t1=new Test1(10);
//Test1 t2=new Test1(100);
//System.out.println(t1);
//System.out.println(t2);
//}
//}

  class Test1{
    int i;
    Test1(int i){
    this.i=i;
    }
    public int hashCode(){
      System.out.println("hashCode()");
    return i;
    }
    public String toString(){
      System.out.println("toString()");
    return i+"";
    }
  }
  public class Chapter08_hashCode_Method {
    public static void main(String[] args){
    Test1 t1=new Test1(10);
    Test1 t2=new Test1(100);
    System.out.println(t1);
    System.out.println(t2);
    }
    }
