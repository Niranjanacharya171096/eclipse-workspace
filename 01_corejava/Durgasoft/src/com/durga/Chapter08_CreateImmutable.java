package com.durga;

final class CreateImmutable {
private int i;//must declared as final
CreateImmutable(int i) {
  System.out.println("Constructor line "+i);
  this.i=i;
}
public CreateImmutable modify(int i) {
  System.out.println("\nObject "+this+"."+this.i+"==?"+i);
if(this.i==i) {
  System.out.println("first line "+this+"."+i);
  return this;
}
else
{
  CreateImmutable c=new CreateImmutable(i);
  System.out.println("Second line "+c);
  return (c);
}
}
}

public class Chapter08_CreateImmutable {
public static void main(String[] args) {
CreateImmutable c1=new CreateImmutable(10);
CreateImmutable c2=c1.modify(100);
CreateImmutable c3=c1.modify(10);
CreateImmutable c4=c1.modify(100);
System.out.println("\nC1 "+c1+"\nC2 "+c2+"\nC3 "+c3);
System.out.println(c1==c2);//false
System.out.println(c1==c3);//true
System.out.println(c2==c4);//false
}
} 
