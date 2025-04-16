package com.inheritance.overriding.internal;

public class SmartGlasses {
    private String brand;
    private boolean isARSupported;

    public SmartGlasses(String brand, boolean isARSupported) {
        System.out.println("Running the SmartGlasses const");
        this.brand = brand;
        this.isARSupported = isARSupported;
    }

    @Override
    public String toString() {
        return brand + "" + isARSupported;
    }

    public void glassesDisp() {
        System.out.println("Brand: " + this.brand + ", AR Supported: " + this.isARSupported);
    }

    // Uncomment if needed
    // public void useglasses() {
    //     System.out.println("Running the useglasses method in parent class");
    // }
}
