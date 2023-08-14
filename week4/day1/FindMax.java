/**
 Exercise 1: Write a Java program that finds the maximum element in an ArrayList of integers.
 * */
package week4.jdb.takeo.day16;
import java.util.ArrayList;
import java.util.Iterator;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        int[] arr = {12,-25,6,14,6,234,543,-234,-42,634,6,-76,99999,-254,454,4,452,-56,254,52,46355,3,5};
        for (int i : arr)
        {
            intArray.add(i);
        }

        System.out.println("The maximum element in the array list: " + getMaxElement(intArray));
    }

    private static int getMaxElement(ArrayList<Integer> intArray) {
        int max = intArray.get(0);
        Iterator<Integer> iterator = intArray.iterator();
        while(iterator.hasNext()) {
            int current = iterator.next();
            if (max < current)
                max = current;
        }
        return max;
    }
}



