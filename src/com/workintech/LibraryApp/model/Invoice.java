package com.workintech.LibraryApp.model;

import com.workintech.LibraryApp.employees.Staff;
import com.workintech.LibraryApp.services.LibraryItem;

import java.time.LocalDate;
import java.util.Date;


public class Invoice {
    private static int id;
    private LibraryItem item;
    private User fullName;
    private Staff issuedBy;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private double amount;

    public Invoice(int id, LibraryItem item, User fullName, Staff issuedBy, LocalDate issueDate, Date dueDate, double amount) {
        this.id = generateInvoiceId();
        this.item = item;
        this.fullName = fullName;
        this.issuedBy = issuedBy;
        this.issueDate = issueDate;
        this.dueDate = issueDate.plusDays(20);
        this.amount = amount;
    }
    public static int generateInvoiceId(){
        return id++;
    }

    public static int getId() {
        return id;
    }

    public LibraryItem getItem() {
        return item;
    }

    public User getFullName() {
        return fullName;
    }

    public Staff getIssuedBy() {
        return issuedBy;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getAmount() {
        return amount;
    }
    public double calculateAmount(){
        return 10.00;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "item=" + item +
                ", fullName=" + fullName +
                ", issuedBy=" + issuedBy +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", amount=" + amount +
                '}';
    }
}
