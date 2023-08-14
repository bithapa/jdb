package week2.jdb.takeo.day3;

import java.util.Scanner;

/**
 Exercise 5 :
 Fibonacci series is a series of numbers where after the initial two numbers,
 every occurring number is the sum of two preceding numbers.

 Ex : 0,1,1,2,3,5,8,13,21………
 * */
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println("First " + N + " Fibonacci numbers are: ");
        long[] fibo = new long[N];

        // initialize the first two elements of fibo series
        fibo[0] = 0;
        fibo[1] = 1;

        // start with the third element of fibonacci series
        //      each element is the sum of previous two elements
        for (int i = 2; i < N; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for ( long f : fibo){
            System.out.print(f + " ");
        }
    }
}
