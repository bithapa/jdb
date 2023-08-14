/**
 * Exercise 1: Write a Java program that takes a sentence as input and prints the frequency of each word using a map.
 * */
package week4.jdb.takeo.day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class WordFrequency {
    public static void main(String[] args) {

        HashMap<String, Integer> wordFrequency =new HashMap<>();

        System.out.println("Enter a sentence: ");
        // I am a sick man... I am a spiteful man. I am an unattractive man.
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        // convert the sentence into an array of string words
        String[] words = sentence.split("\\s+");

        for (String word: words){
            // remove non letter characters, convert each words into small case
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (word.isEmpty()) {
                continue;
            }
            else if (!wordFrequency.containsKey(word)) {
                wordFrequency.put(word, 1);
            }
            else{
                wordFrequency.put(word, wordFrequency.get(word)+1);
            }


            // The above block of if/else can be replaced with following

//            if (!word.isEmpty()) {
//                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
//            }
        }

        System.out.println("Word Frequencies:");
        for ( Map.Entry<String, Integer> entry : wordFrequency.entrySet() ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }




    }
}
