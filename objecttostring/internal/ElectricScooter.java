package com.inheritance.overriding.internal;

public class ElectricScooter {
    private  String model;
    private  int batteryCapacity;

    public ElectricScooter(String model, int batteryCapacity) {
        System.out.println("Running the ElectricScooter const");
        this.model = model;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return model + " " + batteryCapacity + " mAh";
    }

    public void scooterDisp() {
        System.out.println("Model: " + this.model + ", Battery Capacity: " + this.batteryCapacity + " mAh");
    }

//    public void usescooter() {
//        System.out.println("Running the usescooter method in the parent class");
//    }
}
