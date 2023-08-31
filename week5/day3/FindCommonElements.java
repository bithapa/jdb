package week5.jdb.takeo.day3;
/*
* Exercise 2 : Write a program that takes two lists of integers as input and finds the common elements between them.
    Ex: List<Integer> list1 = List.of(1,4,6,3,7,8);
    List<Integer> list1 = List.of(2,5,8,2,5,6);

    output : common elements in two list = 6,8
* */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,4,6,3,7,8);
        List<Integer> list2 = List.of(2,5,8,2,5,6);

        List<Integer> commonElements = findCommonElements(list1, list2);

        System.out.println("Common elements are: ");
        for (int element: commonElements)
            System.out.print(element + " ");
    }

    private static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        // convert the list into sets
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        // use retainALL() method to find the common elements
        set1.retainAll(set2);

        return new ArrayList<>(set1);
    }
}
