package week2.jdb.takeo.day2;

import java.util.Scanner;
/**
 * Create a Java program that takes a sentence as input from the user,
 * counts the number of vowels (a, e, i, o, u).
 * */
public class VowelCounter {
    public static void main(String[] args) {
        // scanner object to get input
        Scanner scanner = new Scanner(System.in);

        // prompt the user and get the input
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // vowel counter
        int count = 0;

        // run a for loop over the sentence and compare each character to vowels
        // if the character is vowel, increment count
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u')
                count++;
        }

        // print count
        System.out.println("Number of vowels in your sentence: " + count);

        scanner.close();
    }
}
