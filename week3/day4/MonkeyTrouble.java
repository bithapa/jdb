package week3.jdb.takeo;

import java.util.Scanner;

/**
 Exercise 1: We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

 monkeyTrouble(true, true) → true
 monkeyTrouble(false, false) → true
 monkeyTrouble(true, false) → false
 **/
public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is monkey A smiling (enter yes or no):");
        String isMonkeyASmiling = scanner.next();

        System.out.println("Is monkey B smiling (enter yes or no):");
        String isMonkeyBSmiling = scanner.next();

        if (getMonkeyTroubleStatus(isMonkeyASmiling, isMonkeyBSmiling)) {
            System.out.println("\nWe are in trouble!");
        }
        else
            System.out.println("\nWe are NOT in trouble!");
    }

    private static boolean getMonkeyTroubleStatus(String isMonkeyASmiling, String isMonkeyBSmiling) {
        return isMonkeyASmiling.equals("yes") && isMonkeyBSmiling.equals("yes") ||
                isMonkeyASmiling.equals("no") && isMonkeyBSmiling.equals("no");
    }

}
