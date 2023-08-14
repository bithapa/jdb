package week3.jdb.takeo;

import java.util.Scanner;

/**
 Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
 and a boolean indicating if we are on vacation, return a string of the form "7:00"
 indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
 and on the weekend it should be "10:00". Unless we are on vacation --
 then on weekdays it should be "10:00" and weekends it should be "off".

 alarmClock(1, false) → "7:00"
 alarmClock(5, false) → "7:00"
 alarmClock(0, false) → "10:00"
 * */
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the week day (0...6):");
        int dayOfTheWeek = scanner.nextInt();
        System.out.println("Are you on vacation? Enter 'yes' or 'no':");
        String onVacation = scanner.next();

        while ( dayOfTheWeek < 0 || dayOfTheWeek > 6){
            System.out.println("Please enter the days between 0 to 6: ");
            dayOfTheWeek = scanner.nextInt();
        }

        System.out.println("Your alarm is: " + getAlarmTime(dayOfTheWeek, onVacation));

    }

    private static String getAlarmTime(int dayOfTheWeek, String onVacation) {
        String weekday = "07:00";
        String weekend = "10:00";
        String vacationOnWeekday = "10:00";
        String vacationOnWeekend = "off";

        switch (dayOfTheWeek) {
            case 1, 2, 3, 4, 5:
                if (onVacation.equals("yes"))
                    return vacationOnWeekday;
                else
                    return weekday;
            default:
                if (onVacation.equals("yes"))
                    return vacationOnWeekend;
                else
                    return weekend;
        }
    }
}
