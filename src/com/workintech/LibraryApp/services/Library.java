package com.workintech.LibraryApp.services;

import com.workintech.LibraryApp.enums.ItemType;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
    private Map<Integer, Book> books;
    private Map<Integer, Magazine> magazines;
    private Map<Integer, Author> authors;

    public Library(Map<Integer, Book> books, Map<Integer, Magazine> magazines,Map<Integer, Author> authors) {
        this.books = books;
        this.magazines = magazines;
        this.authors = authors;
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }

    public Map<Integer, Magazine> getMagazines() {
        return magazines;
    }
    public LibraryItem getItemById(int itemId, ItemType itemType){
        if (itemType == ItemType.BOOK){
            return books.get(itemId);
        } else if (itemType == ItemType.MAGAZINE) {
            return magazines.get(itemId);
        }
        return null;
    }
    public LibraryItem getItemByName(String itemName, ItemType itemType){
        if (itemType == ItemType.BOOK){
            for (Book book : books.values()){
                if (book.getName().trim().toLowerCase().equals(itemName)){
                    return book;
                }
            }
        } else if (itemType == ItemType.MAGAZINE) {
            for (Magazine magazine : magazines.values()){
                if (magazine.getName().trim().toLowerCase().equals(itemName)){
                    return magazine;
                }
            }
        }
        return null;
    }
    public List<LibraryItem> getItemsByCategory(ItemType itemType, String category){
        Stream<? extends LibraryItem> itemStream;
        if (itemType == ItemType.BOOK){
            itemStream = books.values().stream().filter(item -> item instanceof Book && ((Book) item).getCategory().name().equalsIgnoreCase(category));
        } else if (itemType == ItemType.MAGAZINE) {
            itemStream = magazines.values().stream().filter(item -> item instanceof Magazine &&((Magazine) item).getCategory().name().equalsIgnoreCase(category));
        }else {
            return new ArrayList<>();
        }
        return itemStream.collect(Collectors.toList());
    }
    public Set<Book> getBooksByAuthorName(String authorName){
        for (Author author : authors.values()){
            if (author.getFullName().equalsIgnoreCase(authorName)){
                return author.getBooks();
            }
        }
        return Collections.emptySet();
    }
}
