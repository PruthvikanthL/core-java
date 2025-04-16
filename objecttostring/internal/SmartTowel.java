package com.inheritance.overriding.internal;

public class SmartTowel {
    private String fabricType;
    private String brand;

    public SmartTowel() {
        System.out.println("Running the SmartTowel const");
    }

    public void setSmartTowel(String fabricType, String brand) {
        this.fabricType = fabricType;
        this.brand = brand;
    }

    public String toString() {
        return "Fabric Type: " + fabricType + ", Brand: " + brand;
    }

    public void towelDetails() {
        System.out.println("Fabric Type: " + this.fabricType + ", Brand: " + this.brand);
    }

//    public void usetowel() {
//        System.out.println("Running the usetowel method in the super class");
//    }
}
