package com.durga;

public class Chapter08_SCP {
public static void main(String[] args) {
  String s1="bhaskar";
  String s2=s1.toString();
  String s3=s1.toUpperCase();
  String s4=s1.toLowerCase();
  
  System.out.println("s1: "+ s1 +"\ns2: "+ s2 + "\ns3: "+ s3 +"\ns4: "+s4);
  System.out.println(s1==s2);//true
  System.out.println(s1==s3);//false
  System.out.println(s1==s4);//true

  String s5=new String("ashok"); 
  String s6=s5.toString();
  String s7=s5.toUpperCase();
  String s8=s5.toLowerCase();
  String s9=s8.toUpperCase();
  String s10=s7.toLowerCase();
  
  System.out.println("\ns5: "+ s5 +"\ns6: "+ s6 + "\ns7: "+ s7);
  System.out.println("s8: "+ s8 +"\ns9: "+ s9 + "\ns10: "+ s10);
  System.out.println(s5==s6);//true
  System.out.println(s5==s7);//false
  System.out.println(s5==s8);//true
  System.out.println(s5==s9);//false
  System.out.println(s5==s10);//false
}
}
