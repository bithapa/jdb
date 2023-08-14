package week3.jdb.takeo;

import java.util.Scanner;

/**
 Exercise 1 : Task
 Your local library needs your help!
 Given the expected and actual return dates for a library book,
 create a program that calculates the fine (if any). The fee structure is as follows:

 If the book is returned on or before the expected return date, no fine will be charged (i.e.: 0).
 If the book is returned after the expected return day but still within the same calendar month and year
    as the expected return date, . fine = 15$ per day after return date
 If the book is returned after the expected return month but still within the same calendar year
    as the expected return date, the . fine = 500$ per month after return month
 If the book is returned after the calendar year in which it was expected, there is a fixed fine  = 1000$

 Ex : d1,m1,y1 = 12 02 2014  -- returned date
 d2,m2,y2 = 12 02 2014  -- due date
 output -- fine = 0

 d1,m1,y1 = 12 02 2014  -- returned date
 d2,m2,y2 = 12 02 2015  -- due date
 output -- fine = 1000$

 Input Format

 The first line contains 3 space-separated integers denoting the respective dd, mm, and yyyy
    on which the book was actually returned.
 The second line contains 3 space-separated integers denoting the respective dd, mm , and yyyy
    on which the book was expected to be returned (due date).

 STDIN       Function
 -----       --------
 9 6 2015    day = 9, month = 6, year = 2015 (date returned)
 6 6 2015    day = 6, month = 6, year = 2015 (date due)
 * */
public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date returned: ");
        String returnedDate = scanner.nextLine();

        System.out.println("Enter the due date: ");
        String dueDate = scanner.nextLine();

        System.out.println("Total fine: " + calculateLibraryFine(returnedDate, dueDate) + "$");
    }

    private static int calculateLibraryFine(String returnedDate, String dueDate) {
        // ["DD", "MM", "YYYY"]
        String[] rDateString = returnedDate.split(" ");
        int[] rDate = new int[3];
        for (int i = 0; i < 3; i++) {
            rDate[i] = Integer.parseInt(rDateString[i]);
        }

        String[] dDateString = dueDate.split(" ");
        int[] dDate = new int[3];
        for (int i = 0; i < 3; i++) {
            dDate[i] = Integer.parseInt(dDateString[i]);
        }
        // check whether the book was returned on the same year
        if (rDate[2] != dDate[2]){
            return 1000;
        }
        // check whether the book was returned on the same year but different month
        else if (rDate[1] > dDate[1]){
            return (rDate[1] - dDate[1]) * 500;
        }
        // book returned on the same month
        else {
            if ((rDate[0] <= dDate[0]))
                return 0;
            else
                return (rDate[0] - dDate[0]) * 15;
        }
    }
}
