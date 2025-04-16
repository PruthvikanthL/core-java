package com.inheritance.overriding.internal;

public class AirPurifier {
    private String brand;
    private int filterLevel;

    public AirPurifier(String brand, int filterLevel) {
        System.out.println("Running the AirPurifier const");
        this.brand = brand;
        this.filterLevel = filterLevel;
    }

    @Override
    public String toString() {
        return brand + " - Filter Level: " + filterLevel;
    }

    public void airPurifierDisp() {
        System.out.println("Brand: " + this.brand + ", Filter Level: " + this.filterLevel);
    }

//    public void useair() {
//        System.out.println("Running the useair method in the superclass");
//    }
}
