package week2.jdb.takeo.day3;

import java.util.Scanner;

/**
 Exercise 2:In this challenge, a farmer is asking you to tell him how many legs can be counted among all his animals.
 The farmer breeds three species:

 chickens = 2 legs
 cows = 4 legs
 pigs = 4 legs
 The farmer has counted his animals, and he gives you a subtotal for each species.
 You have to implement a function that returns the total number of legs of all the animals.

 animals(2, 3, 5) ➞ 36
 * */
public class CuntLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens you have? ");
        int chickens = scanner.nextInt();

        System.out.println("How many pigs you have? ");
        int pigs = scanner.nextInt();

        System.out.println("How many cows you have? ");
        int cows = scanner.nextInt();

        System.out.println("The total number of your animal's legs is " + countAnimalsLegs(chickens, pigs, cows));
    }

    private static int countAnimalsLegs(int chickens, int pigs, int cows) {
        return chickens * 2 + pigs * 4 + cows * 4;
    }
}
