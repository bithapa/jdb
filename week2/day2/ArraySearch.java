package week2.jdb.takeo.day2;

import java.util.Scanner;

/**
 * Create a Java program that takes an array of integers as input from the user
 * and a target integer to search for in the array.
 * The program should check if the target integer is present in the array
 * and print its index if found or a message indicating that the target is not in the array.
 * */
public class ArraySearch {
    public static void main(String[] args) {
        // scanner object to get input
        Scanner scanner = new Scanner(System.in);

        // prompt the user for size
        System.out.println("Please enter the size of your array: ");

        // get the size
        int size = scanner.nextInt();

        // initialized the array
        int[] arr = new int[size];

        // get the inputs from user
        System.out.println("please enter your " + size + " elements: ");

        // initialize array
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // print the elements
        System.out.print("The elements you entered are:");
        for ( int val : arr)
            System.out.print(" " + val);

        // get the target
        System.out.println("\n\nPlease enter the element you want to search: ");
        int element = scanner.nextInt();

        // search the element and store index
        int index = size;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                index = i;
                break;
            }
        }

        // at this point if index is still size then element is not found
        // if the element is found index must be within 0 to size-1
        if (index == size)
            System.out.println("Your element is not in the array");
        else
            System.out.println("The element " + element + " is at index " + index);

        scanner.close();
    }
}
