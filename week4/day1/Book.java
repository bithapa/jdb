package week4.jdb.takeo.day16;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Harry Potter", "J.K. Rowling", 2006));
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        bookList.add(new Book("1984", "George Orwell", 1949));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        bookList.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        bookList.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        bookList.add(new Book("Brave New World", "Aldous Huxley", 1932));
        bookList.add(new Book("Moby-Dick", "Herman Melville", 1851));
        bookList.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        bookList.add(new Book("Jane Eyre", "Charlotte Brontë", 1847));
        bookList.add(new Book("Frankenstein", "Mary Shelley", 1818));

        System.out.println("After what year would you like the list of books? ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        System.out.println("Here are the list of books you are looking for: ");
        printAllBooks(year, bookList);

    }

    private static void printAllBooks(int year, ArrayList<Book> bookList) {
        for (Book book : bookList)
            if (book.getYearPublished() > year)
                System.out.println(book.getTitle());
    }


}
