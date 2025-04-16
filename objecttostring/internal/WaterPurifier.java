package com.inheritance.overriding.internal;

public class WaterPurifier {
    private String model;
    private int capacity;

    public WaterPurifier(String model, int capacity) {
        System.out.println("Running the WaterPurifier const");
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return model + " - Capacity: " + capacity + "L";
    }

    public void purifierDisp() {
        System.out.println("Model: " + this.model + ", Capacity: " + this.capacity + "L");
    }

//    public void usepurifier() {
//        System.out.println("Running the usepurifier method in the parent class");
//    }
}
