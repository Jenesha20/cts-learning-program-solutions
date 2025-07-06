package org.example.repository;

public class BookRepository {
    public String getBookInfo(String isbn) {
        return "Book information for ISBN: " + isbn;
    }
}