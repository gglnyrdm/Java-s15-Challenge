package com.workintech.LibraryApp.services;

import java.util.Map;

public class Library {
    private Map<Integer, Book> books;
    private Map<Integer, Magazine> magazines;

    public Library(Map<Integer, Book> books, Map<Integer, Magazine> magazines) {
        this.books = books;
        this.magazines = magazines;
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }

    public Map<Integer, Magazine> getMagazines() {
        return magazines;
    }
}
