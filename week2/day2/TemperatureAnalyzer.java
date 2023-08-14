package week2.jdb.takeo.day2;
/**
 * TemperatureAnalyzer

 * Create a Java program that takes an array of temperature values as input
 * and performs some basic analysis on the data.

 * Here are the steps to follow:

 * Create a class named TemperatureAnalyzer.

 * Declare a static method named findMaxTemperature that takes an integer array (temperatures)
    as an argument and returns the maximum temperature value in the array.

 * Declare a static method named findMinTemperature that takes the same integer array (temperatures)
 * as an argument and returns the minimum temperature value in the array.

 * Declare a static method named findAverageTemperature that takes the same integer array (temperatures)
 * as an argument and returns the average temperature value as a double.

 * In the main method, create an integer array with some sample temperature values.

 * Call the findMaxTemperature, findMinTemperature, and findAverageTemperature methods,
 * passing the array as an argument.

 * Print the maximum, minimum, and average temperatures.
 * */
public class TemperatureAnalyzer {
    public static void main(String[] args) {

        int[] temperature = {18, 32, 75, -2, 0, 80, 40, 88, 2, 72, 60, -10};
        System.out.println("Max temperature: " + findMaxTemperature(temperature));
        System.out.println("Min temperature: " + findMinTemperature(temperature));
        System.out.println("Average temperature: " + findAverageTemperature(temperature));
    }


    // function:    findMaxTemperature()
    // input:       int[] -> array of temperatures
    // return:      int -> max temperature
    //
    // start with maxTemp as the temperature at index 0
    // then compare maxTemp to each element in the array
    // if bigger element is found then replace the maxTemp with it
    static int findMaxTemperature(int[] arr){
        int maxTemp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxTemp)
                maxTemp = arr[i];
        }
        return maxTemp;
    }

    static int findMinTemperature(int[] arr){
        int minTemp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minTemp)
                minTemp = arr[i];
        }
        return minTemp;
    }

    //
    static int findAverageTemperature(int[] arr){
        int sum = 0;
        for (int temp : arr)
            sum += temp;
        return sum / arr.length;
    }
}
