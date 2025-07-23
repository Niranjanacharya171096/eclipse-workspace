package com.company;

import java.util.*;

class MyMainEmployee{
	private int id;
    private String name;
    
    Scanner sc = new Scanner(System.in);
    
    public MyMainEmployee(){
        id = sc.nextInt(); //0;
        name = sc.next(); //"Your-Name-Here";
    }
    public MyMainEmployee(String myName){
        id = 88;
        name = myName;
    }
    public MyMainEmployee(int myId, String myName){
        id = myId;
        name = myName;
    }
   
//    public void setName(String n){
//        this.name = n;
//    }
    public String getName(){
        return name;
    }
   
//    public void setId(int i){
//        this.id = i;
//    }
    public int getId(){
        return id;
    }
}

public class CWH_42_constructors {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
        MyMainEmployee harry = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println("ID: " + harry.getId());
        System.out.println("NAME: " + harry.getName());
        
        harry = new MyMainEmployee(sc.nextLine());//"CodeWithHarry");
        System.out.println("ID: " + harry.getId());
        System.out.println("NAME: " + harry.getName());
        
        harry = new MyMainEmployee(sc.nextInt(), sc.next()); //"ProgrammingWithHarry", 12);
        System.out.println("ID: " + harry.getId());
        System.out.println("NAME: " + harry.getName());        
    }
}