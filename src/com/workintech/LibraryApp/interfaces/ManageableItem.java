package com.workintech.LibraryApp.interfaces;

import com.workintech.LibraryApp.services.LibraryItem;
import com.workintech.LibraryApp.model.User;

import java.util.Date;

public interface ManageableItem {
    void borrowItem(User user, LibraryItem item, Date dueDate);
    void returnItem(User user, LibraryItem item);
    boolean checkAvailability(LibraryItem item);

}
