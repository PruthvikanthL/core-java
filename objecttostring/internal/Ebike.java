package com.inheritance.overriding.internal;

public class Ebike {
    private int batteryCapacity;
    private String model;

    public Ebike(int batteryCapacity, String model) {
        System.out.println("Running the Ebike const");
        this.batteryCapacity = batteryCapacity;
        this.model = model;
    }

    @Override
    public String toString() {
        return batteryCapacity + " " + model;
    }

    public void ebikedisp() {
        System.out.println("Battery Capacity: " + this.batteryCapacity + ", Model: " + this.model);
    }

//    public void useebike() {
//        System.out.println("Running the usebike method in the parent class");
//    }
}
