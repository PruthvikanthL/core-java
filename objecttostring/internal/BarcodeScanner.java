package com.inheritance.overriding.internal;

public class BarcodeScanner {
    private String brand;
    private boolean isWireless;

    public BarcodeScanner(String brand, boolean isWireless) {
        System.out.println("Running the BarcodeScanner const");
        this.brand = brand;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return brand + " " + isWireless;
    }

    public void scannerDisp() {
        System.out.println("Brand: " + this.brand + ", Wireless: " + this.isWireless);
    }

    // Uncomment if needed
    // public void usebar() {
    //     System.out.println("Running the usebar method in the parent class");
    // }
}
