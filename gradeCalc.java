package CODSOFT;
/*
 * This is Task2 which allow yser to enter marks for subject and find the average of student
 */

import java.util.ArrayList;
import java.util.Scanner;

public class gradeCalc {

    public static void main(String[] args) {

        //scanner to handle user input
        Scanner input = new Scanner(System.in);

        //list to store subject marks
        ArrayList<String> subjectMarks = new ArrayList<>();
        String userInput = "";
        while (true) {
            System.out.print("Enter the Marks for a subject or done: ");
            userInput = input.nextLine().toLowerCase();
            if (userInput.equals("done"))
                break; 
            subjectMarks.add(userInput);  //add subject to the list
        }

        input.close();

       
        //Finding the sum
        int totalMark=0;
        for (String marksString : subjectMarks) {
            totalMark += Integer.parseInt(marksString);
        }

        double average_percentage =totalMark/subjectMarks.size();
        System.out.printf("The sum is: "+ totalMark);



       
    }

    
}
