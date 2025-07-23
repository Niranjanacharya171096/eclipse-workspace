package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(5);
//        System.out.println(number);
    }

//    public void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//    }
//    
//    public int getNoOfGuesses() {
//        return noOfGuesses;
//    }

   
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    
    boolean isCorrectNumber(){
        noOfGuesses++;
//        if(noOfGuesses < 3) {
        	if (inputNumber==number){
                System.out.format("Yes! You guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
                return true;
            }
            else if(inputNumber<number){
                System.out.println("Too low...");
            }
            else if(inputNumber>number){
                System.out.println("Too high...");
            }
//       } else {
        if(noOfGuesses == 3) {
        	System.out.println("3 Attempts over! You are failed...Number is: " + number);	
        	return true;
        }
    	return false;
    }

}
public class CWH_50_ex3sol {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        
        boolean b= false;
//        System.out.println(g.number);
        while(!b){
        	g.takeUserInput();
        	b = g.isCorrectNumber();
        }
        System.out.println("\n.................GAME OVER...............");// + g.noOfGuesses);	
    }
}
