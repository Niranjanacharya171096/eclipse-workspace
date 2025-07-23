package com.JavaLabManual;

import java.util.Scanner;
public class Account {
int curBalance, amt;
public Account() {
curBalance = 500;
}
void deposit() {
Scanner s = new Scanner(System.in);
System.out.println("Enter the amount :");
amt = s.nextInt();
curBalance += amt;
System.out.println("Current balance is :" + curBalance);
}
void withdraw() {
Scanner s = new Scanner(System.in);
System.out.println("Enter the amount :");
amt = s.nextInt();
try {
if ((curBalance - amt) < 500)
throw new LessBalanceException(amt);
curBalance -= amt;
System.out.println("\nBalance left :" + curBalance);
} catch (LessBalanceException e) {
System.out.println(e);
}
}
void display_balance() {
System.out.println("Balance in your a/c :" + curBalance);
}
}
class LessBalanceException extends Exception {
int amt;
LessBalanceException(int x) {
System.out.println("Balance is less :" + amt);
}
}