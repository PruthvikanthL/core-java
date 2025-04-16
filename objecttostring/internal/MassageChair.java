package com.inheritance.overriding.internal;

public class MassageChair {
    private String model;
    private int massageModes;

    public MassageChair() {
        System.out.println("Running the MassageChair const");
    }

    public void setMassageChair(String model, int massageModes) {
        this.model = model;
        this.massageModes = massageModes;
    }

    public String toString() {
        return model + " " + massageModes;
    }

    public void massDisp() {
        System.out.println("Model is " + this.model + " Massage Modes are " + this.massageModes);
    }

//    public void usemass() {
//        System.out.println("Running the usemass method in the MassageChair class");
//    }
}
