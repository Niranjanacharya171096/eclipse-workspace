package com.company;

class Cylinder{
    private int radius;
    private int height;

//    public Cylinder(int radius, int height) {
//        this.radius = radius;
//        this.height = height;
//    }
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setHeight(int height) {
		this.height = height;
	}
    
    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }


    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class CWH_44_ps09 {
    public static void main(String[] args) {
        
        // Problem 1
        Cylinder myCylinder = new Cylinder();//Problem 9, 12);
        myCylinder.setRadius(9);
        System.out.println("Cylinder Radius: " + myCylinder.getRadius());
        myCylinder.setHeight(12);
        System.out.println("Cylinder Height: " + myCylinder.getHeight());
        
        
        // Problem 2
        System.out.println("Cylinder SurfaceArea: " + myCylinder.surfaceArea());
        System.out.println("Cylinder Volume: " + myCylinder.volume());

        // Problem 3
        Rectangle1 r = new Rectangle1(12, 56);
        System.out.println("Rectangle Length: " + r.getLength());
        System.out.println("Rectangle Breadth: " + r.getBreadth());
    }
}
