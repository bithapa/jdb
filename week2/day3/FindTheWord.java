package week2.jdb.takeo.day3;

import java.util.Scanner;

/**
 Exercise 1:Find the word
 Starting with an input string of words, find the second-to-last word of the string.
 For example, an input of “I love Codecademy” should return “love.”

 To make your program more challenging, allow for a second numerical input, n,
 that results in returning the nth word of a string.
 So, for the string “I can program in Java” and n = 3, the output should be the third word, “program.”
 * */
public class FindTheWord {
    public static void main(String[] args) {
        System.out.println("Please enter the sentence followed by a number: ");

        // Use the Scanner class to get the input
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int N = scanner.nextInt();

        // change the given sentence into an array of words
        String[] words = sentence.split(" ");

        System.out.println("The word you looking for: " + words[N]);
    }
}
