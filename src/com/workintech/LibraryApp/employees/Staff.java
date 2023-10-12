package com.workintech.LibraryApp.employees;

import com.workintech.LibraryApp.enums.Role;
import com.workintech.LibraryApp.interfaces.ManageableItem;
import com.workintech.LibraryApp.model.Invoice;
import com.workintech.LibraryApp.services.LibraryItem;
import com.workintech.LibraryApp.model.User;

import java.time.LocalDate;
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
        if (user.canBorrowMoreItems()){
            user.getBorrowedItems().add(item);
            double amount = item.calculateAmount();
            Invoice invoice = new Invoice(Invoice.generateInvoiceId(),item,user,this, LocalDate.now(),dueDate,amount);
            System.out.println("Item borrowed successfully.\n" + invoice);
        }else {
            System.out.println("You have reached the maximum limit of borrowed items (5 items).");
        }
    }

    @Override
    public void returnItem(User user, LibraryItem item) {
        user.getBorrowedItems().remove(item);
        System.out.println("Item returned successfully.");
    }

    @Override
    public boolean checkAvailability(LibraryItem item) {
        return item.isAvailable();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", role=" + role +
                '}';
    }
}
