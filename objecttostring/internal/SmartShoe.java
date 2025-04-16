package com.inheritance.overriding.internal;

public class SmartShoe {
    private String brand;
    private String size;

    public SmartShoe() {
        System.out.println("Running the SmartShoe const in the super class");
    }

    public void setSmartShoe(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public String toString() {
        return "Brand: " + brand + ", Size: " + size;
    }

    public void shoeDetails() {
        System.out.println("Brand: " + this.brand + ", Size: " + this.size);
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the super class");
//    }
}
