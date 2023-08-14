package week2.jdb.takeo.day4;

import java.util.Scanner;

/**
 Exercise 2: Write a java program that takes the base and height of a triangle and return its area.(area of triangle = (base*height)/2)

 Ex :
 triArea(3, 2) ➞ 3
 * */
public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("length of base: ");
        System.out.println("length of height: ");

        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.println("the area of your triangle: " + base * height / 2);
    }
}
