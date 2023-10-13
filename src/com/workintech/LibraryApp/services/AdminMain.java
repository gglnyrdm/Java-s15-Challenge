package com.workintech.LibraryApp.services;

import com.workintech.LibraryApp.employees.Staff;
import com.workintech.LibraryApp.enums.BookCategory;
import com.workintech.LibraryApp.enums.ItemType;
import com.workintech.LibraryApp.enums.MagazineCategory;
import com.workintech.LibraryApp.enums.Role;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class AdminMain {
    public static void main(String[] args) {
        Map<Integer,Book> books = new HashMap<>();
        Map<Integer,Magazine> magazines = new HashMap<>();
        Map<Integer,Author> authors = new HashMap<>();
        Library library = new Library(books,magazines,authors);

        Staff admin = new Admin(1,"Yetkili Kisi",Role.ADMIN,library);

        Author author = new Author(1,"Test Yazar", new HashSet<Book>());
        LibraryItem book = new Book(1, "Test kitap", "test açıklama", 10,true,BookCategory.ROMANCE,author);
        ((Admin)admin).addItem(book);

        LibraryItem magazine = new Magazine(1,"Test dergi","lorem ipsum",3,true, MagazineCategory.BUSINESS,"yayinevi");
        ((Admin)admin).addItem(magazine);

        /*Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Library Management System\n"
                        +"1. Add Item\n"
                        +"2. Delete Book\n"
                        +"3. Delete Magazine\n"
                        +"4. Update Item\n"
                        +"5. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1;
                    System.out.println("Enter item type (1 for Book, 2 for Magazine): ");
                    int itemTypeChoice = scanner.nextInt();
                    ItemType itemType = (itemTypeChoice == 1) ? ItemType.BOOK : ItemType.MAGAZINE;
            }
        }*/

    }
}
