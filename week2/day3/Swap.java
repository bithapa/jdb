package week2.jdb.takeo.day3;

/**
 Exercise 3: Write a Java Program to swap two numbers using the third variable.4
 Ex : x = 4 and y = 7
 after swapping x = 7 , y = 4.
 * */
public class Swap {
    public static void main(String[] args) {
        int x = 100;
        int y = -100;

        int temp = x;
        x = y;
        y = temp;
        System.out.println("\nx = " + x + " / y = " + y);
    }
}
