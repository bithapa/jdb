package week2.jdb.takeo.day2;
/**

 EvenOddChecker

 Create a Java program that takes an integer array as input and prints whether each element
 in the array is even or odd.

 Here are the steps to follow:

    Create a class named EvenOddChecker.

    Declare a static method named checkEvenOdd that takes an integer array as an argument.

    Inside the checkEvenOdd method, use a loop to iterate through the elements of the array.

    For each element, use an if-else statement or a switch statement to check if it is even or odd.

    Print the result for each element, stating whether it is even or odd.

    In the main method, create an integer array with some sample elements and call the checkEvenOdd method,
    passing the array as an argument.
 * */
public class EvenOddChecker {
    public static void main(String[] args) {
        int[] elements = {-141327, -3, -2, -1, 0, 1, 2, 3, 4, 5, 246423};

        // call the function
        checkEvenOdd(elements);

    }

    // function:    checkEvenOdd(int[])
    //
    // pseudocode:
    //  for each element
    //      if element is divisible by 2
    //          it's even
    //      else
    //          it's odd
    private static void checkEvenOdd(int[] elements) {
        for (int element: elements) {
            if (element % 2 == 0)
                System.out.println(element + ": Even");
            else
                System.out.println(element + ": Odd");
        }
    }
}
