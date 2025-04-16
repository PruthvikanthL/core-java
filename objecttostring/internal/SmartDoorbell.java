package com.inheritance.overriding.internal;

public class SmartDoorbell {
    private   String brand;
    private   boolean hasCamera;

    public SmartDoorbell(String brand, boolean hasCamera) {
        System.out.println("Running the SmartDoorbell const");
        this.brand = brand;
        this.hasCamera = hasCamera;
    }

    @Override
    public String toString() {
        return brand + hasCamera;
    }

    public void doorbelldisp() {
        System.out.println("Brand: " + this.brand + ", Has Camera: " + this.hasCamera);
    }

//    public void usedoorbell() {
//        System.out.println("Running the usedoorbell method in the parent class");
//    }
}
