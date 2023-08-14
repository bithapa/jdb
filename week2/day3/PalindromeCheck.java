package week2.jdb.takeo.day3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 Exercise 4 : Write a Java Program to find whether a string or number is palindrome or not.
 If the original string is equal to a reversed string then the number is a palindrome, otherwise not.
 Ex : input : Deepak
 Output : this is not palindrome.
 * */
public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Enter something: ");
        Scanner scanner = new Scanner(System.in);
        String something = scanner.next();


        // Use two
        if (isPalindrome(something))
            System.out.println(something + " is a palindrome.");
        else
            System.out.println(something + " is NOT a palindrome.");
    }

    // function: Boolean isPalindrome(String)
    //
    // Use two pointers
    //      i: at index 0 and
    //      j: at last index
    //  For Loop: compare the chars pointed by these pointers using for loop
    //      if at any point if j > i
    //          then break the loop
    //      else
    //          if both chars are equal then
    //              increment i,
    //              decrement j
    //          else
    //              input is not palindrome
    //  End For Loop
    //  At this point the input is palindrome
    private static boolean isPalindrome(String something) {
        int j = something.length() - 1;
        for (int i = 0; i < something.length(); i++) {
            if (i > j) {
                break;
            }
            else{
                if (something.charAt(i) == something.charAt(j)){
                    j--;
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }


}
