package com.workintech.LibraryApp.model;

import com.workintech.LibraryApp.services.LibraryItem;

public class User {
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private LibraryItem borrowedItem;

    public User(int id, String fullName, String email, String phone, LibraryItem borrowedItem) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.borrowedItem = borrowedItem;
    }

    public String getFullName() {
        return fullName;
    }
}
