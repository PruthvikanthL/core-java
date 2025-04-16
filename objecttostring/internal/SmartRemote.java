package com.inheritance.overriding.internal;

public class SmartRemote {
    private String brand;
    private String model;

    public SmartRemote() {
        System.out.println("Running the SmartRemote const");
    }

    public void setSmartRemote(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        return brand + " " + model;
    }

    public void remoteDisp() {
        System.out.println("Brand is " + this.brand + " Model is " + this.model);
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the SmartRemote class");
//    }
}
