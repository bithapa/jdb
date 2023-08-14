package week2.jdb.takeo.day2;

import java.util.Scanner;

/**
 Exercise 2. Write a program in Java to reverse a string without using any inbuilt function.
 Ex : input string = deepak
 output string = kapeed
 Hint : use for loop ,starting from length of string and decrease loop.
 */
public class ReverseString {
    public static void main(String[] args) {
        // prompt the user for the input
        System.out.println("Enter your String: ");

        // Use Scanner object to get the input
        // declare a variable to store the String input
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        // declare a var to store the result
        String reversedStr = "";

        // use for loop
        // starting from the end of string
        // for each char
        //      append that char to the result string
        for (int i = str.length()-1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        System.out.println("Reversed String: " + reversedStr);
    }
}
