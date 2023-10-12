package com.workintech.LibraryApp.model;

import com.workintech.LibraryApp.services.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private List<LibraryItem> borrowedItems;

    public User(int id, String fullName, String email, String phone, LibraryItem borrowedItem) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.borrowedItems = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public String getFullName() {
        return fullName;
    }
    public boolean canBorrowMoreItems(){
        return borrowedItems.size() < 6;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", borrowedItems=" + borrowedItems +
                '}';
    }
}
