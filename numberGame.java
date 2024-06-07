package CODSOFT;
import java.util.Random;
import java.util.Scanner;

/**
 * numberGame
 */

public class numberGame {

    public static void main(String[] args) {
        
        //Allow user to input a number
        System.out.println("###Welcome to the Number Game, you start this round with 5 attempts###");
        System.out.print("Enter your guess: ");
        try (Scanner input = new Scanner(System.in)) {
            int guess= input.nextInt();

            //generate random number between 1 and 100
            Random random = new Random();
            int randomNumber = random.nextInt(100)+1; //0 to 99 shifted by 1

            int attempts = 5; //try agains

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
}