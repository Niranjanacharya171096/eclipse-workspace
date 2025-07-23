package com.durga;

class PopCorn{
public void taste(){
System.out.println("spicy");
}
}
class Chapter22_InnerClasses{
public static void main(String[] args){
PopCorn p=new PopCorn(){public void taste(){System.out.println("salty");}};
p.taste();//salty
PopCorn p1=new PopCorn();
p1.taste();//spicy
}
}

//public class Chapter22_InnerClasses {
//    int x=100;
//    class Inner{
//      int x=200;
//    public void methodOne(){
//      int x=300;
//    System.out.println(x);//300
//    System.out.println(this.x);//200
//    System.out.println(Chapter22_InnerClasses.this.x);//100
//    }
//    }
//    
//    public static void main(String[] args){
//    new Chapter22_InnerClasses().new Inner().methodOne();
//    }
//    }
