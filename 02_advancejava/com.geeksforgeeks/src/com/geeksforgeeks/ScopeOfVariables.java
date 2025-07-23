package com.geeksforgeeks;

class Scope{
	static int z = 12;
	private int a = 15;
	public void method() {
		int b = 0;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}

public class ScopeOfVariables {
	static int x = 11;
    private int y = 33;
    
    public void method1(int x) {
    	//ScopeOfVariables t = new ScopeOfVariables();
        //this.x = x;
        y = 44;
        System.out.println("x: " + x);
        System.out.println("this.x: " + this.x);
        System.out.println("Test.x: " + ScopeOfVariables.x);     
        System.out.println("y: " + y);
    }
 
    public static void main(String args[]){
    	
    	ScopeOfVariables t = new ScopeOfVariables();
        
        System.out.println("x: " + x);
        System.out.println("ScopeOfVariables.x: " + ScopeOfVariables.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        t.method1(5);
        
        Scope s = new Scope();
        //System.out.println("z: " + z);
        System.out.println("Scope.z: " + Scope.z);
        System.out.println("s.z: " + s.z);
        //System.out.println(a + s.a + Scope.a);
        s.method();
        //System.out.println(b + s.b + Scope.b);
    }
}
