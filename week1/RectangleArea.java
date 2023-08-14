package day2.jdb.takeo.assignments;
/**
 * Exercise 5: Calculate Area of a Rectangle
 * Scenario: You are designing a floor planning tool, and
 * you need to calculate the area of a rectangle-shaped room.
 * Given : Take length as 20 and breadth as 40.
 * Task: Write a program that calculates rectangle area. Print the calculated area.
 * */
public class RectangleArea {
    public static void main(String[] args) {
        // length and breadth
        int length = 20;
        int breadth = 40;

        // var to store area
        int area;

        // calculate the area
        area = length * breadth;

        // Display the area
        System.out.println("The area of rectangle is " + area);
    }
}
