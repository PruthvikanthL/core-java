package com.inheritance.overriding.internal;

public class SmartNotebook {
    private String brand;
    private int storage;

    public SmartNotebook() {
        System.out.println("Running the SmartNotebook const");
    }

    public void setSmartNotebook(String brand, int storage) {
        this.brand = brand;
        this.storage = storage;
    }

    public String toString() {
        return "Brand: " + brand + ", Storage: " + storage + "GB";
    }

    public void notebookDisp() {
        System.out.println("Brand: " + this.brand + ", Storage: " + this.storage + "GB");
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the superclass");
//    }
}
