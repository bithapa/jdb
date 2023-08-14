package week2.jdb.takeo.day3;

import java.util.Scanner;

/**
 Exercise 5 :
 Fibonacci series is a series of numbers where after the initial two numbers,
 every occurring number is the sum of two preceding numbers.

 Ex : 0,1,1,2,3,5,8,13,21………
 * */
public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println("First " + N + " Fibonacci numbers are: ");
        for ( int i = 0; i < N; i++) {
            System.out.print(" " + getNthFibonacciNum(i+1));;
        }

    }

    private static long getNthFibonacciNum(int i) {
        if (i == 1)
            return 0;
        else if ( i == 2)
            return 1;
        else
            return getNthFibonacciNum(i - 1 ) + getNthFibonacciNum(i - 2);
    }
}
