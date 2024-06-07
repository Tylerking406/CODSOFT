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
        System.out.println(randomNumber);
        
        //Allow user to input a number
        System.out.println("###Welcome to the Number Game, you start this round with "+attempts+" attempts###");
        System.out.print("Enter your guess: ");
        int guess= input.nextInt();
        Round(guess, randomNumber);
        
        System.out.println("Do you want to continue(yes/no)?");
        String choice = input.next().toLowerCase(); //store yes or no
        boolean flag =stringToBoolean(choice);

        while (flag) {
            randomNumber = random.nextInt(100)+1; //new random for next round
            System.out.println(randomNumber);
            System.out.print("Enter your guess: ");
            guess= input.nextInt();
            Round(guess, randomNumber);

            System.out.println("Do you want to continue(yes/no)?");
            choice= input.next().toLowerCase(); //store yes or no
             flag =stringToBoolean(choice);
             System.out.println(flag);

             if (flag ==false) {
                //give user score
                //System.exit(0);
                break;
             }
             
        }



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

    public static boolean stringToBoolean(String flag){
        boolean asBool;
        switch (flag) {
            case "yes":
                asBool = true;
                break;
            
            case "no":
            asBool = false;
            break;
        
            default:
                asBool = false;
                break;
        }
        return asBool;
    }
}