package week4.jdb.takeo.day16;

import java.util.ArrayList;

public class MergeList {
    public static void main(String[] args) {
        ArrayList<Integer> intArray1 = new ArrayList<Integer>();
        for (int i =0; i <5; i++)
            intArray1.add(1);

        ArrayList<Integer> intArray2 = new ArrayList<Integer>();
        for (int i =0; i <10; i++)
            intArray2.add(0);

        ArrayList<Integer> intArrayMerged = new ArrayList<Integer>();

        /**
         Use addAll() method to merge lists
         * */

        intArrayMerged.addAll(intArray1);

        intArrayMerged.addAll(intArray2);

        System.out.println(intArrayMerged);
    }
}
