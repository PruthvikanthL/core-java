package com.inheritance.overriding.internal;

public class BluetoothTracker {
    private  String model;
    private  int range;

    public BluetoothTracker(String model, int range) {
        System.out.println("Running the BluetoothTracker const");
        this.model = model;
        this.range = range;
    }

    @Override
    public String toString() {
        return model + " " + range + " meters";
    }

    public void trackerDisp() {
        System.out.println("Model: " + this.model + ", Range: " + this.range + " meters");
    }

//    public void useblue() {
//        System.out.println("Running the useblue method in the parent class");
//    }
}
