package com.workintech.LibraryApp.services;

import java.util.Set;

public class Author {
    private int id;
    private String fullName;
    private Set<Book> books;

    public Author(int id, String fullName, Set<Book> books) {
        this.id = id;
        this.fullName = fullName;
        this.books = books;
    }

    public String getFullName() {
        return fullName;
    }

    protected void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }
}
