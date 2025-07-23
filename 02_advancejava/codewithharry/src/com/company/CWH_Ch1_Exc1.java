package com.company;

import java.util.Scanner;

public class CWH_Ch1_Exc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float eng, phy, chem, math, comp;
		double total, avg, percentage;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: eng, phy, chem, math, comp");
		eng = sc.nextFloat();
		phy = sc.nextFloat();
		chem = sc.nextFloat();
		math = sc.nextFloat();
		comp = sc.nextFloat();
        //System.out.println(sc.hasNextInt());
		total = eng + phy + chem + math + comp;
		avg = total/5;
		percentage = (total/500)*100;
	
		System.out.println("Total: " + total);
		System.out.println("Average: " + avg);
		System.out.println("Perentage: " + percentage + "%");
	}
}
