package week2.jdb.takeo.day4;

import java.util.Scanner;

/**
 Exercise 1: Write a java program that takes an integer hours and converts it to seconds.

 Ex :
 convert(5) ➞ 18000
 * */
public class HourToSeconds {
    public static void main(String[] args) {
        System.out.println("Please enter number of hours in Integer: ");
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        System.out.println(hours + " hours is " + hours * 60 * 60 + " seconds");
    }
}
