package day5.jdb.takeo.assignments;

import java.util.Scanner;

/****
 * Exercise 1: Simple Interest Calculator
 *-
 * Write a Java program that calculates the simple interest
 * based on the principal amount, rate of interest, and time period provided by the user.
 *---
 * Instructions:
 *-
 * Use the Scanner class to take input from the user for
 * the principal amount, rate of interest, and time period (in years).
 * Calculate the simple interest using the formula:
 *      Simple Interest = (Principal * Rate * Time) / 100.
 * Display the calculated simple interest to the user.
 *---
 * Ex: Enter the principal amount: 5000
 *     Enter the rate of interest: 8.5
 *     Enter the time period (in years): 2
 *     Simple Interest: 850.0
 ****/

public class InterestCalculator {
    public static void main(String[] args) {
        // prompt the user to enter the principal amount, interest and period
        System.out.println(
                "Please enter the principal amount, interest rate, and period " +
                "\n(press ENTER after each): ");

        Scanner scanner = new Scanner(System.in);

        // get the input
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double period = scanner.nextDouble();

        // calculate and display the interest
        System.out.println("Your interest is " + principal * rate * period / 100);
    }
}
