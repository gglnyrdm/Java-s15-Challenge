package com.workintech.LibraryApp.services;

import com.workintech.LibraryApp.enums.BookCategory;

public class Book extends LibraryItem {
    private BookCategory category;
    private Author author;

    public Book(int id, String name, String description, int stock, boolean available, BookCategory category, Author author) {
        super(id, name, description, stock, available);
        this.category = category;
        this.author = author;
    }

    public BookCategory getCategory() {
        return category;
    }

    public Author getAuthor() {
        return author;
    }

    protected void setCategory(BookCategory category) {
        this.category = category;
    }

    protected void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Book ID: " + getId() + "\n");
        builder.append("Book Name: " + getName() + "\n");
        builder.append("Description: " + getDescription() + "\n");
        builder.append("Stock: " + getStock() + "\n");
        builder.append("Category: " + category.name() + "\n");
        builder.append("Author: " + author.getFullName() + "\n");
        builder.append("Available: " + (isAvailable() ? "Book is available" : "Book borrowed.") + "\n");
        return builder.toString();
    }
}
