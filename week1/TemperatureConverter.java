package day2.jdb.takeo;

import java.util.Scanner;

/**
 * Exercise 1: Temperature Conversion
 * Scenario: You are building a weather application, and you need to implement
 * a feature that converts temperature values from Celsius to Fahrenheit.
 * Given : You can take temperature of your city in Celsius.
 * Task: Write a program that converts Celsius to Fahrenheit using the formula (Celsius * 9/5) + 32,
 * and prints the converted temperature.
 *  use proper data type for this as we can have decimal value there.
 * */
public class TemperatureConverter {
    public static void main(String[] args) {
        // scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt the user for input
        System.out.println("Please enter the temperature in Celsius: ");

        // var to store the temperature
        double temperature;

        // get the input using scanner object
        temperature = scanner.nextDouble();

        // display the temperature in Fahrenheit
        System.out.println(temperature + " degrees C is equivalent to " + convertCToF(temperature) + " degrees F.");
    }

    /*
     * function: convertCToF()
     *
     * given the input parameter as celsius in double
     * converts into fahrenheit and returns it
     * */
    static double convertCToF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
