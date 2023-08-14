package day5.jdb.takeo.assignments;

import java.util.Scanner;

/************************************************************************
        Exercise 3: Day of the Week

        Write a Java program that takes a number representing a day of the week
        (1 for Sunday, 2 for Monday, etc.) and displays the corresponding day's name.

        Instructions:

        Use the Scanner class to take input from the user for the number representing
        the day of the week.
        Implement a switch statement to display the corresponding day's name.
        Display the day's name to the user.

        Ex : Enter a number (1-7) representing the day of the week: 3
        Day of the week: Tuesday

 **************************************************************************/
public class DayOfTheWeek {
    public static void main(String[] args) {
        // prompt the user
        System.out.println("Enter the number (1-7) representing the day of the week: ");

        // get the input
        Scanner getDay = new Scanner(System.in);
        int dayAsNum = getDay.nextInt();

        // validate the input
        do {
            System.out.println("Please enter valid digit between 1 and 7: ");
            dayAsNum = getDay.nextInt();
        }while(dayAsNum < 1 || dayAsNum > 7);


        String day;
        switch (dayAsNum) {
            case 1 -> day = "Monday";
            case 2 -> day = "Tuesday";
            case 3 -> day = "Wednesday";
            case 4 -> day = "Thursday";
            case 5 -> day = "Friday";
            case 6 -> day = "Saturday";
            default -> day = "Sunday";
        }

        // display the result
        System.out.println("day of the week: " + day);

    }
}
