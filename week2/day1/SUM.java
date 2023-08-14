package week2.jdb.takeo.day1;

import java.util.Scanner;

/**
 Create a program that calculates the total sum of integer array given by the user
 * */
public class SUM {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // scanner object to get input
        Scanner scanner = new Scanner(System.in);

        // prompt the user for size
        System.out.println("Please enter the size of your array: ");

        // get the size
        int size = scanner.nextInt();

        // initialized the array and total sum
        int[] arr = new int[size];
        int sum = 0;


        // get the inputs from user
        System.out.println("please enter your " + size + " elements: ");

        // initialize array and calculate sum
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        // print the elements
        System.out.print("The elements you entered are:");
        for ( int i : arr)
            System.out.print(" " + arr[i]);

        // print sum
        System.out.println("\nYour total sum is " + sum);

        scanner.close();
    }
}
