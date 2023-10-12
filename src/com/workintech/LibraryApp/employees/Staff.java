package com.workintech.LibraryApp.employees;

import com.workintech.LibraryApp.enums.Role;
import com.workintech.LibraryApp.interfaces.ManageableItem;
import com.workintech.LibraryApp.services.LibraryItem;
import com.workintech.LibraryApp.model.User;

import java.util.Date;

public class Staff implements ManageableItem {
    private int id;
    private String fullName;
    private Role role;

    public Staff(int id, String fullName, Role role) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public void borrowItem(User user, LibraryItem item, Date dueDate) {

    }

    @Override
    public void returnItem(User user, LibraryItem item) {

    }

    @Override
    public boolean checkAvailability(LibraryItem item) {
        return false;
    }

    @Override
    public void addNewUser() {

    }
}
