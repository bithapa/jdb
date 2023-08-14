package day2.jdb.takeo.assignments;
/**
 * Exercise 4: Student Grading
 * Scenario: You are developing a student grading application for a teacher.
 * You need to implement a feature that calculates the average grade of students in a class.
 * Given : Grades for Five Students as : 8,9,5,4,8
 * Task: Write a program that calculates their average grade. Print the average grade.
 * **/
public class StudentGrading {
    public static void main(String[] args) {
        int[] studentGrades = {8,9,5,4,8};

        // var to store the total grade
        int total = 0;

        // calculate the total
        for (int studentGrade : studentGrades) {
            total += studentGrade;
        }

        // calculate the average
        int averageGrade = total / studentGrades.length;

        // display the average total
        System.out.println("The average grade is " + averageGrade);
    }
}
