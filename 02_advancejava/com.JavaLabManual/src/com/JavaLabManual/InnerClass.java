package com.JavaLabManual;

class outer
{
	private int x=10;
	protected int z=30;
	
	class inner
	{
	private int x=20;
	protected int z=85;
	}
	public static void main(String args[])
	{
	outer obj1=new outer();
	inner obj2=new outer().new inner();
	System.out.println("Through Outer Class, x = "+obj1.x);
	System.out.println("Through Inner Class, x = "+obj2.x);
	}
}
class InnerClass
{
public static void main(String args[])
{
outer ob1=new outer();
outer.inner ob2=new outer().new inner();
System.out.println("Through Different Class, Outer's protected z ="+ob1.z);
System.out.println("Through Different Class, Inner's protected z ="+ob2.z);
}
}