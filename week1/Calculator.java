package day3.jdb.takeo.assignments;

import java.util.Objects;
import java.util.Scanner;

/*
 * Exercise 6: Design a calculator which perform a set of operations dynamically.
 * Scenario: Design a Calculator class. Take input from user like :
 *           Enter first number = 5
 *           Enter Second number = 5
 *           Enter Operation you want to perform = +
 *
 * Output of Program will be like this :
 *
 *           Output: 5+5 = 10;
 *
 * Hint :   take input by using Scanner class
 *          take operation(+,-,*,/) as String input from the console
 *          use if else cases to compare operation with constant String like : final String SUM = "+";
 *          similar for other
 *          then inside the 'if' do the required operation
 *          print the output.
 * */
public class Calculator {

    public static void main(String[] args) {
        // scanner object
        Scanner scanner = new Scanner(System.in);

        // variable to store the inputs, operation, and result
        double var1, var2, result;
        String operation;

        // get the inputs
        System.out.println("Please enter your 1st number, 2nd number, and the operation you'd like to perform (press ENTER after each input13): ");
        var1 = scanner.nextDouble();
        var2 = scanner.nextDouble();
        operation = scanner.next();

        System.out.println("String: " + operation);
        // calculate the result
        switch (operation) {
            case "+" -> {
                result = var1 + var2;
                System.out.println("The sum of your numbers is " + result);
            }
            case "-" -> {
                result = var1 - var2;
                System.out.println("The subtraction of your numbers is " + result);
            }
            case "*" -> {
                result = var1 * var2;
                System.out.println("The product of your numbers is " + result);
            }
            case "/" -> {
                result = var1 / var2;
                System.out.println("The division of your numbers is " + result);
            }
        }
    }
}
