package week2.jdb.takeo.day2;
import java.util.Scanner;
/**
 * Create a Java program that takes an array of integers as input from the user,
 * calculates the sum and average of the elements, and prints the results.
 * */
public class ArraySumAverage {
    public static void main(String[] args) {
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
        for ( int element : arr)
            System.out.print(" " + element);

        // print sum & average
        System.out.println("\nYour total sum is " + sum);
        System.out.println("\nThe average is:  " + sum/size);

        scanner.close();
    }
}
