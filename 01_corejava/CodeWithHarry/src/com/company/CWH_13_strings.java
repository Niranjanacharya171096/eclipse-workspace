package com.company;

import java.util.Scanner;

public class CWH_13_strings{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = new String();
		
		str = sc.nextLine(); //"  NiRanJan  acharya n ";
			 //012345678901234567890//  
		
		System.out.println(str);
		System.out.println("0123456789012345678901\n");
		
		System.out.println("str.length: " + str.length());
		System.out.println("str.toLowerCase: " + str.toLowerCase());
		System.out.println("str.toUpperCase: " + str.toUpperCase());
		System.out.println("str.charAt(3): " + str.charAt(3));
		System.out.println("str.startsWith(\"ni\"): " + str.startsWith("ni"));
		System.out.println("str.endsWith(\" \"): " + str.endsWith(" "));	
		System.out.println("str.trim(): " + str.trim());
		System.out.println("str.indent(2): " + str.indent(2));
		System.out.println("str.indexOf(\"an\"): " + str.indexOf("an"));
		System.out.println("str.indexOf(\"a\", 13): " + str.indexOf("a", 13));
		System.out.println("str.lastIndexOf(\"a\"): " + str.lastIndexOf("a"));
		System.out.println("str.lastIndexOf(\"a\", 13): " + str.lastIndexOf("a", 13));
		System.out.println("str.equals(\"  NiRanJan  acharya n \"): " + str.equals("  NiRanJan  acharya n "));
		System.out.println("str.equalsIgnoreCase(\"  nIrANjAN  AcHaRya n \"): " + str.equalsIgnoreCase("  nIrANjAN  AcHaRya n "));
		System.out.println("str.replace(\"a\", \"A\"): " + str.replace("a", "A"));
		System.out.println("str.replaceAll(\"an\", \"ab\"): " + str.replaceAll("an", "ab"));
		System.out.println("str.substring(3): " + str.substring(3));
		System.out.println("str.substring(4, 13): " + str.substring(4, 13));
		System.out.println("str.subSequence(5, 13): " + str.subSequence(5, 13));
		
//		int a = 6;
//        float b = 5.6454f;
//        System.out.printf("The value of a is %d and value of b is %5.2f \n", a, b);
//        System.out.format("The value of a is %d and value of b is %f", a, b);
//        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);

	
        
	}
}
