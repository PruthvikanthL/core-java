package com.inheritance.overriding.internal;

public class FitnessTracker {
    private   String brand;
    private   int stepsCount;

    public FitnessTracker(String brand, int stepsCount) {
        System.out.println("Running the FitnessTracker const");
        this.brand = brand;
        this.stepsCount = stepsCount;
    }

    @Override
    public String toString() {
        return brand + stepsCount;
    }

    public void trackerdisp() {
        System.out.println("Brand: " + this.brand + ", Steps Count: " + this.stepsCount);
    }

//    public void usetracker() {
//        System.out.println("Running the usetracker method in the parent class");
//    }
}
