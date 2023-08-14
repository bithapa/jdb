package day5.jdb.takeo.assignments;

import java.util.Scanner;

/**************************************************************************

 Exercise 4: Power Calculation

 Write a Java program that calculates the power of a given number raised to an exponent
 provided by the user.

 Instructions:

 Use the Scanner class to take input from the user for the base number and the exponent.
 Use a loop to calculate the power of the number raised to the exponent.
 Display the result to the user.

 Ex: Enter the base number: 2
 Enter the exponent: 5
 2^5 = 32

 // is there a method to check whether the input given by the user is an integer or not
 **************************************************************************/
public class PowerCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.println("Enter the exponent: ");
        int exponent = scanner.nextInt();

        long powerCalc = base;
        for(int i = 1; i < exponent; i++) {
            powerCalc *= base;
        }

        System.out.println(base + "^" + exponent + " = " + powerCalc);
    }
}
