package day2.jdb.takeo.assignments;

/*
* Exercise 2: Currency Converter
* Scenario: You are developing a currency converter application, and you need to
* implement a feature that converts a given amount in one currency to another currency.
* Given : USD value = 10
* Task: Write a program that converts currency to another currency based on the exchange rate.
* The exchange rate should be stored as a constant variable. Print the converted amount.
**/

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt the user for input in usd
        System.out.println("Please enter the currency in USD: ");

        // var to store the currency
        double usd;

        // get the input and store in var using scanner object
        usd = scanner.nextDouble();

        // convert
        double npr = convertUsdToNpr(usd);
        // Format and display the currency in NPR using the method
        System.out.println(usd + "$ is equivalent to " + formatCurrency(npr)  + " Nepalese rupees.");
    }


    /*
    * function: convertUSDToNpr()
    * input: usd -> double
    * return: npr -> double
    *
    * converts usd to npr
    * exchange rate: 1 USD = 131.30 NPR
    * */
    static double convertUsdToNpr(double usd) {
        return usd * 131.30;
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
