package com.company;

import java.util.*;
//import java.util.Scanner;

class Computer
{
    String ID;
    double process;
    double ram;
    double disk;
    double price;

    void setID (String _id)
    {
        ID = _id;
    }
    void setProcess (double _Process)
    {
        process = _Process;
    }
    void setRam (double _Ram)
    {
        ram = _Ram;
    }
    void setDisk (double _Disk)
    {
        disk = _Disk;
    }
    void setPrice (double _Price)
    {
        price = _Price;
    }

    String getID()
    {
        return ID;
    }
    double getProcess()
    {
        return process;
    }
    double getRam()
    {
        return ram;
    }
    double getDisk()
    {
        return disk;
    }
    double getPrice()
    {
        return price;
    }

    void displayComputer()
    {
        System.out.println("Computer ID: " + getID());
        System.out.println("Processor Speed: " + getProcess());
        System.out.println("RAM: " + getRam());
        System.out.println("Harddisk: " + getDisk());
        System.out.println("Price: " + getPrice());
    }
}

 class Desktop extends Computer {
    public String toString() {
        return "Desktop [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
 class Laptop extends Computer {
    public String toString() {
        return "Laptop [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
public class Main{
	public static void main (String args[]) 
    {
        String input;
        Scanner scanner = new Scanner(System.in);
        List<Object> listOfObject = new ArrayList<>();
        do
        {
            System.out.println("Computer Menu");  
            System.out.println("1. Add a new Desktop Information");
            System.out.println("2. Add a new Laptop Information");
            System.out.println("3. Display all Computer Information");
            System.out.println("4. Quit");

            System.out.print("Please enter either 1 to 4: "); 
            input =(scanner.nextLine());
            if (input.equals("1")){
                Desktop desktop1 = new Desktop();
                listOfObject.add(desktop1);
            }else if (input.equals("2")){
                Laptop laptop1 = new Laptop();
                listOfObject.add(laptop1);
             }else if(input.equals("3")){
                 for(Object obj : listOfObject){
                     if(obj instanceof Desktop){
                        Desktop d1 = (Desktop)obj;
                        System.out.println(d1.toString());
                     }else if(obj instanceof Laptop){
                         Laptop l1 = (Laptop)obj;
                         System.out.println(l1.toString());
                     }
                 }
             }
        }while(!input.equals("4"));
    }
}