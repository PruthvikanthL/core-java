package com.inheritance.overriding.internal;

public class DigitalMicroscope {
    private String model;
    private int magnification;

    public DigitalMicroscope() {
        System.out.println("Running the DigitalMicroscope const");
    }

    public void setDigitalMicroscope(String model, int magnification) {
        this.model = model;
        this.magnification = magnification;
    }

    public String toString() {
        return model + " with " + magnification + "x magnification";
    }

    public void microscopeDisp() {
        System.out.println("Model: " + this.model + " Magnification: " + this.magnification + "x");
    }

//    public void usedigital() {
//        System.out.println("Running the usedigital method from DigitalMicroscope class");
//    }
}
