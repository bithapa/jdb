package week3.jdb.takeo;
/**
 Exercise 2: Write a program in java to find SmallestPositiveInt in an array.
 Ex: {-2,0,3,4,1,9}  -> output will be 1
 * */
public class SmallestPositiveInt {
    public static void main(String[] args) {
        int[] arr = {12,-25,6,14,6,234,543,-234,-42,634,6,-76,-254,454,4,452,-56,254,52,46355,3,5};
        System.out.println("The smallest positive integer is: " + findSmallestPositiveInt(arr));
    }

    private static int findSmallestPositiveInt(int[] arr) {
        int smallestPositiveInt = arr[0];
        for (int num : arr) {
            if ( num > 0 && num < smallestPositiveInt)
                smallestPositiveInt  = num;
        }
        return smallestPositiveInt;
    }
}
