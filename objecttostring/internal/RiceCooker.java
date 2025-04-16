package com.inheritance.overriding.internal;

public class RiceCooker {
    private int capacity;
    private String brand;

    public RiceCooker() {
        System.out.println("Running the RiceCooker const");
    }

    public void setRiceCooker(int capacity, String brand) {
        this.capacity = capacity;
        this.brand = brand;
    }

    public String toString() {
        return capacity + " " + brand;
    }

    public void riceDisp() {
        System.out.println("Capacity is " + this.capacity + " Brand is " + this.brand);
    }

//    public void userice() {
//        System.out.println("Running the userice method in the RiceCooker class");
//    }
}
