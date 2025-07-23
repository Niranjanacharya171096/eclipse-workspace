package com.JavaLabManual;

import java.util.Scanner;
public class MainProgram {
public static void main(String[] args) {
int ch;
Scanner s = new Scanner(System.in);
Account a = new Account();
while (true) {
System.out.println("1:Deposit\t2:Withdraw\t3:Balance\t4:Exit\n");
System.out.println("Enter your choice:");
ch = s.nextInt();
switch (ch) {
case 1:
a.deposit();
break;
case 2:
a.withdraw();
break;
case 3:
a.display_balance();
break;
case 4:
return;
default:
System.out.println("Invalid choice\n");
return;
}
}
}
}