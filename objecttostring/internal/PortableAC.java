package com.inheritance.overriding.internal;

public class PortableAC {
    private  String brand;
    private  int coolingCapacity;

    public PortableAC(String brand, int coolingCapacity) {
        System.out.println("Running the PortableAC const");
        this.brand = brand;
        this.coolingCapacity = coolingCapacity;
    }

    @Override
    public String toString() {
        return brand + " " + coolingCapacity + " BTU";
    }

    public void portableACDisp() {
        System.out.println("Brand: " + this.brand + ", Cooling Capacity: " + this.coolingCapacity + " BTU");
    }

//    public void useportable() {
//        System.out.println("Running the useportable method in the superclass");
//    }
}
