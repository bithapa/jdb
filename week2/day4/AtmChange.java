package week2.jdb.takeo.day4;

import java.util.Scanner;

/**
 Exercise 4: An ATM gives money in denominations of 2000,500, 200, 100, 5 /- . Take an amount as input, print how many notes of each denomination will be released.Check First amount cannot be less than 100 and must be multiple of 5.
 Ex:
 Enter the amount to withdraw:
 2500
 Denominations:
 2000 : 1
 500 : 1
 100 : 0
 * **/
public class AtmChange {
    public static void main(String[] args) {
        System.out.println("Enter the amount in multiple of 5: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int[] denominations = {2000, 500, 200, 100, 5};
        int[] notesCount = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            notesCount[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        System.out.println("Notes of each denomination to be released:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + ": " + notesCount[i] + " notes");
        }

    }
}
