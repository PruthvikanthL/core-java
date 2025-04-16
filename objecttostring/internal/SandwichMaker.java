package com.inheritance.overriding.internal;

public class SandwichMaker {
    private String model;
    private int slices;

    public SandwichMaker() {
        System.out.println("Running the SandwichMaker const");
    }

    public void setSandwichMaker(String model, int slices) {
        this.model = model;
        this.slices = slices;
    }

    public String toString() {
        return model + " " + slices;
    }

    public void sandDisp() {
        System.out.println("Model is " + this.model + " Slices is " + this.slices);
    }

//    public void usesand() {
//        System.out.println("Running the sand method in the SandwichMaker class");
//    }
}
