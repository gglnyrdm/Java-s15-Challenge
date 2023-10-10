package com.workintech.LibraryApp.employees;

import com.workintech.LibraryApp.enums.Role;
import com.workintech.LibraryApp.model.LibraryItem;

public class Admin extends Staff{
    public Admin(int id, String fullName, Role role) {
        super(id, fullName, role);
    }
    public void addItem(LibraryItem item){}
    public void deleteItem(int itemId){}
    public void updateItem(int itemId, LibraryItem updatedItem){}
}
