package com.workintech.LibraryApp.model;

import com.workintech.LibraryApp.enums.MagazineCategory;

public class Magazine extends LibraryItem{
    private MagazineCategory category;
    private String publisher;

    public Magazine(int id, String name, String description, int stock, boolean available, MagazineCategory magazineCategory, String publisher) {
        super(id, name, description, stock, available);
        this.category = magazineCategory;
        this.publisher = publisher;
    }

    @Override
    public String displayInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("Magazine ID: " + getId() + "\n");
        builder.append("Magazine Name: " + getName() + "\n");
        builder.append("Description: " + getDescription() + "\n");
        builder.append("Stock: " + getStock() + "\n");
        builder.append("Category: " + category + "\n");
        builder.append("Publisher: " + publisher + "\n");
        builder.append("Available: " + (isAvailable() ? "Book is available" : "Book borrowed.") + "\n");
        return builder.toString();
    }
}