package com.inheritance.overriding.internal;

public class ElectricKettle {
    int capacity;
    String brand;

    public ElectricKettle(int capacity, String brand) {
        System.out.println("Running the ElectricKettle const");
        this.capacity = capacity;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return capacity + brand;
    }

    public void kettledisp() {
        System.out.println("Capacity: " + this.capacity + "Brand: " + this.brand);
    }

//    public void usekettle() {
//        System.out.println("Running the usekettle method in the parent class");
//    }
}
