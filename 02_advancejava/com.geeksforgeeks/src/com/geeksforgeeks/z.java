package com.geeksforgeeks;

import java.util.*;

public class z{
  static int max = 26;
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
//    for(;;) {
      String str = sc.nextLine();
      int n = str.length();
//      System.out.println(n);

      String s = StringChallenge(str.toCharArray(), n);
      System.out.println(s);
//    }
  }
  
  static String StringChallenge(char[] strch, int n){
    Map<Character, Character> map = new HashMap<>();
    String str2 = "", str3 = "";
    for (char c: strch) {
      if(Character.isAlphabetic(c)) 
        str2 += Character.toString((char)(((c-'a'+1)%max)+'a'));
      else
        str2 += Character.toString((char)(c)); 
//      System.out.println(str2);
    }
    
    char[] str2ch = str2.toCharArray();
    for (int i = 0; i < n; i++) {
      if (str2ch[i] == 'a' || str2ch[i] == 'e' || str2ch[i] == 'i' || str2ch[i] == 'o' ||str2ch[i] == 'u') {
        char c = Character.toUpperCase(str2ch[i]);
        str2ch[i] = c;
      }
      str3 += Character.toString((char)(str2ch[i])); 
//      System.out.println(str3);
    }

    return str3; 
  }
}