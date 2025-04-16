package com.inheritance.overriding.internal;

public class Dehumidifier {
    private String brand;
    private int capacity;

    public Dehumidifier(String brand, int capacity) {
        System.out.println("Running the Dehumidifier const");
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return brand + " " + capacity + "L/day";
    }

    public void dehumidifierDisp() {
        System.out.println("Brand: " + this.brand + ", Capacity: " + this.capacity + "L/day");
    }

//    public void usemidifier() {
//        System.out.println("Running the usemidifier method in the parent class");
//    }
}
