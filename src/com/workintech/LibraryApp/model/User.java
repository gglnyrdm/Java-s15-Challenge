package com.workintech.LibraryApp.model;

import com.workintech.LibraryApp.services.LibraryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(fullName, user.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName);
    }
}
