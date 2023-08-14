package week4.jdb.takeo.day18;

import java.util.HashMap;

/**
 * Given a list of integers and a target sum, find two numbers in the list that add up to the target sum.
 * */
public class TargetSum {
    public static void main(String[] args) {
        int[] list = {4, 5, 2, 7, 12};
        int targetSum = 2;
        int[] result = findTwoNumSum(list, targetSum);

        if (result == null )
            System.out.println("Numbers don't exist!");
        else
            System.out.println(
                    "The numbers are " +
                     list[result[0]] + " & " + list[result[1]]
            );
    }
    private static int[] findTwoNumSum(int[] list, int targetSum) {
        /**
         A hashmap of < list[index] , index >
         * */
        HashMap<Integer, Integer> listMap = new HashMap<>();

        for (int index = 0; index < list.length; index++) {
            if (listMap.containsKey( targetSum - list[index] )) {
                return new int[] { index, listMap.get(targetSum -list[index]) };
            }
            listMap.put( list[index], index );
        }
        return null;
    }
}
