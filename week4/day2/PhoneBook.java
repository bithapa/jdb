package week4.jdb.takeo.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Exercise 3:Create a simple phonebook using a map to store names and phone numbers.
 * Allow the user to add, search for, and remove entries.
 * */
public class PhoneBook {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("123-456-7890", "Alice");
        phoneBook.put("234-567-8901", "Bob");
        phoneBook.put("345-678-9012", "Charlie");
        phoneBook.put("456-789-0123", "David");
        phoneBook.put("567-890-1234", "Eve");


        // display the phone book
        displayPhoneBook(phoneBook);
        while (true) {
            System.out.println(
                            "\nTo ADD an entry ENTER 1\n" +
                            "To REMOVE an entry ENTER 2\n" +
                            "To SEARCH for entry ENTER 3\n" +
                            "To QUIT this program ENTER 0: "
            );


            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1 :
                    System.out.println("Enter the name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the phone number: ");
                    String phone = scanner.next();
                    if (phoneBook.containsKey(phone))
                        System.out.println("Phone book already has that phone number!");
                    else {
                        phoneBook.put(phone, name);
                        System.out.println("Your entry is added to the phone book. Here is the updated list:");
                        System.out.println("PHONE BOOK: ");
                        displayPhoneBook(phoneBook);
                    }
                    break;
                case 2:
                    System.out.println("Enter the phone number to remove it from phone book:");
                    String phoneRemove = scanner.nextLine();
                    phoneBook.remove(phoneRemove);
                    System.out.println("Your phone is removed from the phone book. Here is the updated list");
                    displayPhoneBook(phoneBook);
                    break;
                case 3:
                    System.out.println("Enter the phone number to look for:");
                    String phoneToLookFor = scanner.next();
                    scanner.nextLine();
                    if (phoneBook.containsKey(phoneToLookFor)){
                        System.out.println("Here is the entry you're looking for");
                        System.out.println("Name: " + phoneBook.get(phoneToLookFor));
                        System.out.println("Phone: " + phoneToLookFor);
                    }
                    else
                        System.out.println(phoneToLookFor + " is not in the phone book.");
                    break;
                case 0:
                    System.out.println("Goodbye!!");
                    return;
                default:
                    System.out.println("please enter valid number [1, 2, 3 or 0]");
            }
        }
    }

    private static void displayPhoneBook(HashMap<String, String> phoneBook) {
        System.out.println("PHONE BOOK:");
        for (Map.Entry<String, String> e : phoneBook.entrySet()){
            System.out.println(
                            "Name: " + e.getValue() +
                            "\nPhone: " + e.getKey()
            );
            System.out.println("------------------------------------");
        }
    }
}
