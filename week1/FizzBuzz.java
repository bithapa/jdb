package day4.jdb.takeo;

import java.util.Scanner;

/**
 * Title: "FizzBuzz Game"
 * Description:
 * You have been asked to create a simple Java program that plays the FizzBuzz game.
 * The rules of the FizzBuzz game are as follows:
 * For numbers from 1 to N (inclusive),
 *      if the number is divisible by 3, print "Fizz".
 *      If the number is divisible by 5, print "Buzz".
 *      If the number is divisible by both 3 and 5, print "FizzBuzz".
 * Otherwise, print the number itself.
 *--
 * You can only use loops, if-else conditions, and logical operators in your solution.
 * No inbuilt libraries, regex, or wrapper classes are allowed.
 * The input N will be a positive integer greater than 0.
 *--
 * Hint : First ask user to input a limit.
 *        Let it be 15
 *        Then use loop to iterate from 1 to 15.
 *        Inside loop check if number divisible by 3 or not using %(moulus operator).Print Fizz
 *        Similar for 5. Print Buzz
 *        Then use logical ||/&& operator to check for 3 and 5. Print FizBuzz.
 * else print number in loop.
 *--
 * Output should be like this:
 *--
 * 1
 * 2
 * Fizz
 * 4
 * Buzz
 * Fizz
 * 7
 * 8
 * Fizz
 * Buzz
 * 11
 * Fizz
 * 13
 * 14
 * FizzBuzz
 * */
public class FizzBuzz {
    public static void main(String[] args) {
        // get the limit from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();

        // loop until the limit
        // if the number is divisible by 3 & 5
        //      print FizzBuzz
        // if the number is divisible by 3
        //      print Fizz
        // if the number is divisible by 5
        //      print Buzz

        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
