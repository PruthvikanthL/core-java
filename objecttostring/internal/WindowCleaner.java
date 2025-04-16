package com.inheritance.overriding.internal;

public class WindowCleaner {
    private String model;
    private int power;

    public WindowCleaner() {
        System.out.println("Running the WindowCleaner const");
    }

    public void setWindowCleaner(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public String toString() {
        return "Model: " + model + ", Power: " + power + "W";
    }

    public void cleanerDetails() {
        System.out.println("Model: " + this.model + ", Power: " + this.power + "W");
    }

//    public void usewindow() {
//        System.out.println("Running the usewindow method in the superclass");
//    }
}
