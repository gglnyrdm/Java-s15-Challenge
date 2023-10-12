package com.workintech.LibraryApp.services;

import com.workintech.LibraryApp.employees.Staff;
import com.workintech.LibraryApp.enums.BookCategory;
import com.workintech.LibraryApp.enums.MagazineCategory;
import com.workintech.LibraryApp.enums.Role;

import java.util.Map;
import java.util.Scanner;

public class Admin extends Staff {
    private Library library;
    public Admin(int id, String fullName) {
        super(id, fullName, Role.ADMIN);
    }

    public Admin(int id, String fullName, Role role, Library library) {
        super(id, fullName, role);
        this.library = library;
    }

    private boolean checkRole(){
        return getRole() == Role.ADMIN;
    }
    public void addItem(LibraryItem item){
        if (checkRole()) {
            if (item instanceof Book){
                library.getBooks().put(item.getId(), (Book) item);
            } else if (item instanceof Magazine){
                library.getMagazines().put(item.getId(), (Magazine) item);
            }else {
                System.out.println("Not a valid book or magazine.");
            }
        }else {
            System.out.println("Permission denied. You don't have sufficient privileges.");
        }

    }
    public void deleteBook(int bookId){
        if (checkRole()){
            if (library.getBooks().containsKey(bookId)){
                library.getBooks().remove(bookId);
                System.out.println("Book with ID " + bookId + " has been deleted.");
            }else {
                System.out.println("Book with ID " + bookId + " not found");
            }
        }else {
            System.out.println("Permission denied. You don't have sufficient privileges.");
        }
    }
    private void deleteMagazine(int magazineId){
        if (checkRole()){
            if (library.getMagazines().containsKey(magazineId)){
                library.getMagazines().remove(magazineId);
                System.out.println("Magazine with ID " + magazineId + " has been deleted.");
            }else {
                System.out.println("Magazine with ID " + magazineId + " not found");
            }
        }else {
            System.out.println("Permission denied. You don't have sufficient privileges.");
        }
    }

    private void updateItem(int itemId, String newName, String newDescription, int newStock, boolean newAvailability, BookCategory newBookCategory, MagazineCategory newMagazineCategory,String newAuthorName, String newPublisher){
        if (library.getBooks().containsKey(itemId)) {
            Map<Integer,Book> books = library.getBooks();

            Book bookToUpdate = books.get(itemId);
            bookToUpdate.setName(newName);
            bookToUpdate.setDescription(newDescription);
            bookToUpdate.setStock(newStock);
            bookToUpdate.setAvailable(newAvailability);
            bookToUpdate.setCategory(newBookCategory);

            if (newAuthorName != null && !newAuthorName.trim().isEmpty()) {
                Author author = bookToUpdate.getAuthor();
                author.setFullName(newAuthorName);
            }
            System.out.println("Book updated: " + bookToUpdate);
        } else if (library.getMagazines().containsKey(itemId)){
            Map<Integer,Magazine> magazines = library.getMagazines();

            Magazine magazineToUpdate = magazines.get(itemId);
            magazineToUpdate.setName(newName);
            magazineToUpdate.setDescription(newDescription);
            magazineToUpdate.setStock(newStock);
            magazineToUpdate.setAvailable(newAvailability);
            magazineToUpdate.setCategory(newMagazineCategory);
            magazineToUpdate.setPublisher(newPublisher);

            System.out.println("Magazine updated: " +magazineToUpdate);
        }else {
            System.out.println("Item with ID not found.");
        }
    }

}
