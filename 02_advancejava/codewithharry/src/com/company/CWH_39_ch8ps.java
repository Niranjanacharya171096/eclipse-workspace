package com.company;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    float l, b;
    public float area(){
        return l*b;
    }
    public float perimeter(){
        return 2*(l+b);
    }
}

class Circle{
    double r, pi = 3.14;
    public double area(){
        return pi*r;
    }
    public double perimeter(){
        return 2*pi*r;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class CWH_39_ch8ps {
    public static void main(String[] args) {
        
        // Problem 1
        Employee1 harry = new Employee1();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        // Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();


        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        
        // Problem 4
        Rectangle ra = new Rectangle();
        ra.l = (float)6.3;
        ra.b = 3;        
        System.out.println(ra.area());
        System.out.println(ra.perimeter());
        
        // Problem 5
        Circle cr = new Circle();
        cr.r = 5;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
        
        // Problem 6
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
