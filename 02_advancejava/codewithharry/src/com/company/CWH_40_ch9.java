package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class CWH_40_ch9 {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
        
        MyEmployee john = new MyEmployee();
        john.setName("JohnCena");
        System.out.println(john.getName());
        john.setId(88);
        System.out.println(john.getId());

    }
}
