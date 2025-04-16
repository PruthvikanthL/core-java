package com.inheritance.overriding.internal;

public class SteamMop {
    private String model;
    private  int waterTankCapacity;

    public SteamMop(String model, int waterTankCapacity) {
        System.out.println("Running the SteamMop const");
        this.model = model;
        this.waterTankCapacity = waterTankCapacity;
    }

    @Override
    public String toString() {
        return model + " " + waterTankCapacity;
    }

    public void mopDisp() {
        System.out.println("Model: " + this.model + ", Water Tank Capacity: " + this.waterTankCapacity + " liters");
    }

//    public void usemop() {
//        System.out.println("Running the usemop method in the parent class");
//    }
}
