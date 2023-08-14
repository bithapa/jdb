package day5.jdb.takeo.assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

/**************************************************************************

 Exercise 5: BMI(Body Mass Index) Calculator

 Write a Java program that calculates the Body Mass Index (BMI) of a person
 based on their weight and height.

 Instructions:

 Use the Scanner class to take input from the user for their
        weight in kilograms and height in meters.
 Create a method that takes the input weight and height as arguments and
 calculates the BMI using the formula: BMI = weight / (height * height).

 Ex:  Enter your weight (kg): 70
 Enter your height (m): 1.75
 Your BMI: 22.86
************************************/
 public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height (meters): ");
        double height = scanner.nextDouble();

        System.out.println("Your BMI: " + calculateBMI(weight, height));
    }

    private static String calculateBMI(double weight, double height) {
        double bmi =  weight / (height * height);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format(bmi);
    }
}
