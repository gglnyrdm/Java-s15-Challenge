package com.workintech.LibraryApp.services;

import com.workintech.LibraryApp.enums.ItemType;
import com.workintech.LibraryApp.enums.MagazineCategory;

public class Magazine extends LibraryItem {
    private MagazineCategory category;
    private String publisher;

    public Magazine(int id, String name, String description, int stock, boolean available, MagazineCategory magazineCategory, String publisher) {
        super(id, name, description, stock, available, ItemType.MAGAZINE);
        this.category = magazineCategory;
        this.publisher = publisher;
    }

    public MagazineCategory getCategory() {
        return category;
    }

    public String getPublisher() {
        return publisher;
    }

    protected void setCategory(MagazineCategory category) {
        this.category = category;
    }

    protected void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Magazine ID: " + getId() + "\n");
        builder.append("Magazine Name: " + getName() + "\n");
        builder.append("Description: " + getDescription() + "\n");
        builder.append("Stock: " + getStock() + "\n");
        builder.append("Category: " + category.name() + "\n");
        builder.append("Publisher: " + publisher + "\n");
        builder.append("Available: " + (isAvailable() ? "Book is available" : "Book borrowed.") + "\n");
        return builder.toString();
    }
}
