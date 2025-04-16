package com.inheritance.overriding.internal;

public class EllipticalTrainer {
    private int resistanceLevel;
    private String brand;

    public EllipticalTrainer() {
        System.out.println("Running the EllipticalTrainer const");
    }

    public void setEllipticalTrainer(int resistanceLevel, String brand) {
        this.resistanceLevel = resistanceLevel;
        this.brand = brand;
    }

    public String toString() {
        return resistanceLevel + " " + brand;
    }

    public void elliDisp() {
        System.out.println("Resistance Level is " + this.resistanceLevel + " Brand is " + this.brand);
    }

//    public void useelli() {
//        System.out.println("Running the useelli method in the EllipticalTrainer class");
//    }
}
