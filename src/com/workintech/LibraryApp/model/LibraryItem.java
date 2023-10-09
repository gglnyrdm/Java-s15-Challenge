package com.workintech.LibraryApp.model;

public abstract class LibraryItem {
    private int id;
    private String name;
    private String description;
    private int stock;
    private boolean available;

    public LibraryItem(int id, String name, String description, int stock, boolean available) {
        this.id = id;
        this.name = name;
        this.description = description;
        checkStock(stock);
        this.available = stock >=1;
    }
    private void checkStock(int stock){
        if (stock<0){
            this.stock=stock;
            System.out.println("Stock value cannot be less than 1.");
        }else {
            this.stock=stock;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        if (stock > 0){
            this.available = available;
        }
    }
    public abstract String displayInfo();
}
