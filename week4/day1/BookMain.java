package com.aseem.week4.day1;

import java.util.ArrayList;
//Create a custom class Book with the following attributes: title (String), author (String), and yearPublished (int).
// Implement a Java program that uses an ArrayList to store a list of books and performs the following tasks:
//
//Create and add several book objects to the ArrayList.
//Find and print all books published after a given year (e.g., 2000).
public class BookMain {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "J. K. Rowling", 1994));
        books.add(new Book("Lord of the Rings", "John. R. R. Tolkien", 1992));
        books.add(new Book("Red Rising", "Pierce Brown", 2014));

        printBooksAfterYear(books, 2000);
    }

    public static void printBooksAfterYear(ArrayList<Book> books, int year) {
        for (Book book : books) {
            if(book.getYearPublished() > year) {
                System.out.println(book.getTitle());
            }
        }
    }
}
