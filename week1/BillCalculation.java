package day2.jdb.takeo.assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
* Total Bill Calculation
* Scenario: You are developing a restaurant bill calculation application.
* You need to implement a feature that calculates the total bill amount, including tax and tip.
* Task: Write a program that calculates the total bill amount by adding the bill amount, tax and tip.
* */
public class BillCalculation {
    public static void main(String[] args) {
        // scanner object
        Scanner scanner = new Scanner(System.in);

        // vars to store price, tip, and total bill
        double price, tip, totalBill;

        // prompt the user to input price and tip
        System.out.println("Please enter the total price and tip amount: ");

        // use the scanner object for input
        price = scanner.nextDouble();
        tip = scanner.nextDouble();

        // calculate the total bill
        totalBill =  calculateTotalBill(price, tip);

        // format the total bill
        String formattedTotalBill = formatCurrency(totalBill);
        // display the total bill with proper format
        System.out.println("Your total bill after tax and tip is " + formattedTotalBill + "$.");
    }

    /*
    * function: calculateTotalBill()
    *
    * input:    price -> double
    *           tip -> double
    * return: totalBill -> double
    *
    * adds 13% to the price and tip to the price after tax, returns total
    * */
    static double calculateTotalBill(double price, double tip) {
        return price * 1.13 + tip;
    }

    /*
    * function: formatCurrency()
    *
    * input:    amount -> double
    * return:   formattedAmount -> double
    *
    * Formats the given amount as a currency in string with 2 decimal places
    * */

    static String formatCurrency(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format(amount);
    }
}
