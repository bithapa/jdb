package week4.jdb.takeo.day18;

import java.util.*;

/**
 * Exercise 2: Write a Java program that takes a list of integers, removes duplicate values, and prints the result using a set.
 * */
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();

        // generate 20 random numbers between 1 (inclusive) and 10 (inclusive)
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            integerList.add(random.nextInt(10) + 1);
        }
        System.out.println("List before removing the duplicates:");
        for (Integer i : integerList) {
            System.out.print(" " + i);
        }

        /**
         * Use HashSet to create a set of unique values
         * A list can be used directly to initialize a hash set
         * */
        Set<Integer> uniqueIntegerSet = new HashSet<>(integerList);
        System.out.println("\nList after removing the duplicates:");
        for (Integer i : uniqueIntegerSet) {
            System.out.print(" " + i);
        }
    }
}
