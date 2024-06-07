package CODSOFT;
import java.util.Random;
import java.util.Scanner;

/**
 * numberGame
 */

public class numberGame {

    static Scanner input = new Scanner(System.in);
   
     //generate random number between 1 and 100
     static Random random = new Random();
     static int randomNumber = random.nextInt(100)+1; //0 to 99 shifted by 1

     static int attempts = 10; //try agains


    public static void main(String[] args) {
       
        
        //Allow user to input a number
        System.out.println("###Welcome to the Number Game, you start this round with 5 attempts###");
        System.out.print("Enter your guess: ");
        int guess= input.nextInt();
        Round(guess, randomNumber);
    
        


    } //end of main

    /* Method to handle user guess due to the random number */
    public static void Round(int guess,int randomNumber ){
       // int attempts = 5;
        while(guess != randomNumber && (attempts>1)){
            attempts--;  //decrement attempt
            if (guess> randomNumber) {
                System.out.println("The guess is too high,you have "+attempts+" atempts remaing\n please try again:");
                guess= input.nextInt();
            }

            else if( guess < randomNumber){
                System.out.println("The guess is too low,you have "+attempts+" atempts remaing\nplease try again:");
                guess= input.nextInt();
            }

        }   
        
        if (guess == randomNumber) 
            System.out.println("The guess is correct!!");
        else
            System.out.println("You run out of attempts");
    }
}