package week4.jdb.takeo.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        System.out.println("Enter a word (all lower case): ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        HashMap<Character, Integer> charFrequency =  new HashMap<>();

        for (int i =0; i < string.length(); i++) {
            if (charFrequency.containsKey(string.charAt(i)))
                charFrequency.put(string.charAt(i), charFrequency.get(string.charAt(i)) + 1);
            else
                charFrequency.put(string.charAt(i), 1);
        }

        for (Map.Entry<Character, Integer> e : charFrequency.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
