package com.inheritance.overriding.internal;

public class Iron {
    private   int weight;
    private   String brand;

    public Iron(int weight, String brand) {
        System.out.println("Running the Iron const");
        this.weight = weight;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return weight + brand;
    }

    public void irondisp() {
        System.out.println("Weight: " + this.weight + ", Brand: " + this.brand);
    }

//    public void useiron() {
//        System.out.println("Running the useiron method in the parent class");
//    }
}
