import java.util.Random;
import java.util.Scanner;

/**
 * numberGame
 */

public class numberGame {

    public static void main(String[] args) {
        
        //Allow user to input a number
        System.out.print("Enter your guess: ");
        Scanner input = new Scanner(System.in);
        int guess= input.nextInt();

        //generate random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1; //0 to 99 shifted by 1

        while(guess != randomNumber){
            if (guess> randomNumber) {
                System.out.println("The guess is too high");

                System.out.println("Enter your guess again:");
                guess= input.nextInt();
            }
    
            else if( guess < randomNumber){
                System.out.println("The guess is too low");
                System.out.println("Enter your guess again:");
                guess= input.nextInt();
            }
            else{
                System.out.println("The guess is correct!!");
                System.out.println("Enter your guess again:");
                guess= input.nextInt();
    
            }
        }


    }
}