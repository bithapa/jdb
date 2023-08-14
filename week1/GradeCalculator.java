package day5.jdb.takeo.assignments;

import java.util.Scanner;

/***********************************************************************

        Exercise 2: Grade Calculator

        Write a Java program that calculates the grade based on
        the marks obtained by a student in an exam.
        The program should follow the standard grading system:
        A (90-100),
        B (80-89),
        C (70-79),
        D (60-69),
        F (below 60).

        Instructions:

        Use the Scanner class to take input from the user for the marks obtained.
        Determine the grade based on the marks using if-else statements.
        Display the calculated grade to the user.

        Ex: Enter the marks obtained: 85
        Grade: B
 ************************************************************************/
public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your mark: ");

        // get the input
        Scanner scanner = new Scanner(System.in);
        double mark = scanner.nextDouble();

        // to store the grade
        char grade;

        if (mark < 60)
            grade = 'F';
        else if (mark < 70)
            grade = 'D';
        else if (mark < 80)
            grade = 'C';
        else if (mark < 90)
            grade = 'B';
        else
            grade = 'A';

        System.out.println("Your grade is " + grade + ".");
    }
}
