package week2.jdb.takeo.day2;

import java.util.Scanner;

/**
 Exercise 1: StudentGrades

 Create a Java program that takes input from the user for the grades of five students
 and calculates their average grade.
 Then, based on the average grade, it provides a corresponding grade letter and status (pass/fail) for each student.

 Here are the steps to follow:
    Create a class named StudentGrades.

    Declare a static array to hold the grades of five students.
    The array should be of type int and named grades.

    Implement a static method named getAverageGrade that
    calculates and returns the average grade of the five students.

    Implement a static method named getGradeLetter that
    takes the average grade as an argument and
    returns the corresponding grade letter based on the following scale:

    90 or above: 'A'

    80 to 89: 'B'

    70 to 79: 'C'

    60 to 69: 'D'

    Below 60: 'E'

    Implement a static method named isPassing that takes the average grade as an argument and
    returns true if the average grade is 60 or above, and false otherwise.

    In the main method, use a Scanner to take input from the user for the grades of five students
    and store them in the grades array.

    Call the getAverageGrade method to calculate the average grade.

    Call the getGradeLetter method to get the corresponding grade letter.

    Call the isPassing method to check if the student has passed or failed.

    Print the average grade, grade letter, and pass/fail status for each student.
 * */
public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM = 5;
        int[] grades = new int[NUM];

        // prompt the user for input
        System.out.println("Please enter the grades of " + NUM + " students: ");
        for (int i = 0; i < NUM; i++)
            grades[i] = scanner.nextInt();


        // display average grade
        System.out.println("The average grade is: " + getAverageGrade(grades));

        // display grade and pass/fail  for each student
        // vars to store letter grade and pass/fail
        char letterGrade;
        String passFailStatus;

        // loop through each grade and display the corresponding grade/status
        for (int grade : grades) {
            letterGrade = getGradeLetter(grade);

            if (isPassing(grade))
                passFailStatus = "PASS";
            else
                passFailStatus = "FAIL";
            System.out.println(grade + ": " + letterGrade + " / " + passFailStatus);
        }
    }

    private static boolean isPassing(int grade) {
        if (grade < 60)
            return false;
        return true;
    }

    private static char getGradeLetter(int grade) {
        char letterGrade;
        if (grade < 60)
            letterGrade = 'F';
        else if (grade < 70)
            letterGrade = 'D';
        else if (grade < 80)
            letterGrade = 'C';
        else if (grade < 90)
            letterGrade = 'B';
        else
            letterGrade = 'A';
        return letterGrade;
    }

    private static int getAverageGrade(int[] grades) {
        int sum = 0;
        for(int grade: grades)
            sum += grade;
        return sum/grades.length;
    }
}
