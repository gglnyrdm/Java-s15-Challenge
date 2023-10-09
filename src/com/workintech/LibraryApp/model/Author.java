package com.workintech.LibraryApp.model;

import java.util.List;

public class Author {
    private int id;
    private String fullName;
    private List<Book> books;

    public Author(int id, String fullName, List<Book> books) {
        this.id = id;
        this.fullName = fullName;
        this.books = books;
    }

    public String getFullName() {
        return fullName;
    }
}
