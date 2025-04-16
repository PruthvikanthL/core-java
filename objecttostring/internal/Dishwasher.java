package com.inheritance.overriding.internal;

public class Dishwasher {
    private   String model;
    private   int capacity;

    public Dishwasher(String model, int capacity) {
        System.out.println("Running the Dishwasher const");
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return model + " " + capacity;
    }

    public void dishwasherDisp() {
        System.out.println("Model: " + this.model + ", Capacity: " + this.capacity + " liters");
    }

//    public void usedishwasher() {
//        System.out.println("Running the usedishwasher method in parent class");
//    }
}
