package com.workintech.LibraryApp.model;

import com.workintech.LibraryApp.employees.Staff;

import java.time.LocalDate;


public class Invoice {
    private int id;
    private LibraryItem item;
    private User fullName;
    private Staff issuedBy;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private double amount;

    public Invoice(int id, LibraryItem item, User fullName, Staff issuedBy, LocalDate issueDate, LocalDate dueDate, double amount) {
        this.id = id;
        this.item = item;
        this.fullName = fullName;
        this.issuedBy = issuedBy;
        this.issueDate = issueDate;
        this.dueDate = issueDate.plusDays(20);
        this.amount = amount;
    }
}
