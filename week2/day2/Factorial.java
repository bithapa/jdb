package week2.jdb.takeo.day2;

import java.util.Scanner;

/**
 Exercise 1. Write a program in Java to find the factorial of a number.
 Factorial :  The product of all positive integers less than or equal to a given positive integer.
 Ex: 2! (2 Factorial) = 2*1 = 2
 3! = 3*2*1 = 6
 4! = 4*3*2*1 = 24
 Hint : Use for loop
 * */
public class Factorial {
    public static void main(String[] args) {
        // prompt the user for input
        System.out.println("Enter a number: ");

        // scanner object to get input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // declare variable to store the result
        long factorial = 1;

        // use for loop to calculate factorial
        for ( int i = number; i >= 1; i--) {
            factorial *= i;
        }

        // print the result
        System.out.println(number + "! = " + factorial);
    }
}
