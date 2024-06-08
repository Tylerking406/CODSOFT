package CODSOFT;
/*
 * This is Task2 which allow yser to enter marks for subject and find the average of student
 */

import java.util.ArrayList;
import java.util.Scanner;

//********************************************************************************************** */
public class gradeCalc {

    public static void main(String[] args) {

        //scanner to handle user input
        Scanner input = new Scanner(System.in);

        //list to store subject marks
        ArrayList<String> subjectMarks = new ArrayList<>();

        //Assign element to list
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

        /*Grades
        Code 7 (A+): 80% - 100%
        Code 6 (A): 70% - 79%
        Code 5 (B): 60% - 69%
        Code 4 (C): 50% - 59%
        Code 3 (D): 40% - 49%
        Code 2 (E): 30% - 39%
        Code 1 (F): 0% - 29%
        */
        String[] grades = {"F","E","D","C","B","A","A+"};

        int grades_above_F_index= ((int)average_percentage/10)-2;
        String grade="";    //student grade
        if(average_percentage>= 30){
            grade = grades[grades_above_F_index];
        }
        else
            grade = grades[0];

     //********************************************************************************************** */
        System.out.printf("The sum = %d\nThe average percentage = %.2f\nThe grade of the student = %s",totalMark,average_percentage,grade);



       
    }

    
}
