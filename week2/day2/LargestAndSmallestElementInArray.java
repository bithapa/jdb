package week2.jdb.takeo.day2;
/**
 Exercise 3. Write a program in Java to find the largest and smallest elements in an array.
 Ex : input = {1,9,5,7,8};
 output = largest number = 9 & smallest number = 1
 Hint : use for loop and array here. take first element as largest and smallest and then inside loop compare and
 if largest or smaller than set that value to respective largest or smallest.
 * */
public class LargestAndSmallestElementInArray {
    public static void main(String[] args) {
        int[] elements = {12, -23, 453,4, 2, 13,-134, 143, 1, 23, 3411, -12, -3};

        // declare variables to store the max and min numbers
        // initialized them to the first element of array
        int max = elements[0];
        int min = elements[0];

        // run a for loop
        // for each element in array
        //      if the element is greater than max,
        //          max = that element
        //      if the element is less than min,
        //          min = that element
        for (int i = 1; i < elements.length; i++){
            if (elements[i] > max)
                max = elements[i];
            if (elements[i] < min)
                min = elements[i];
        }

        // display the output
        System.out.println("\nMax: " + max + "\nMin: " + min);


    }
}
