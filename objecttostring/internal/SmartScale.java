package com.inheritance.overriding.internal;

public class SmartScale {
    private int maxWeight;
    private String model;

    public SmartScale() {
        System.out.println("Running the SmartScale const");
    }

    public void setSmartScale(int maxWeight, String model) {
        this.maxWeight = maxWeight;
        this.model = model;
    }

    public String toString() {
        return maxWeight + " " + model;
    }

    public void scaleDisp() {
        System.out.println("Max Weight is " + this.maxWeight + " Model is " + this.model);
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the SmartScale class");
//    }
}
