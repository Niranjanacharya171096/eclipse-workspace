package com.collections;

import java.util.*; 

class chapter70_StackClass_ArrayDeque { 
  public static void main (String[] args) { 
    Deque<Character> stack = new ArrayDeque<Character>(); 
    stack.push('A'); 
    stack.push('B'); 
    System.out.println(stack.peek()); 
    System.out.println(stack.pop()); 
  } 
} 
