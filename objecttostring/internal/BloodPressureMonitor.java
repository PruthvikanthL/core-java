package com.inheritance.overriding.internal;

public class BloodPressureMonitor {
    private String model;
    private int batteryLife;

    public BloodPressureMonitor() {
        System.out.println("Running the BloodPressureMonitor const");
    }

    public void setBloodPressureMonitor(String model, int batteryLife) {
        this.model = model;
        this.batteryLife = batteryLife;
    }

    public String toString() {
        return "Model: " + model + ", Battery Life: " + batteryLife + " hours";
    }

    public void monitorDisp() {
        System.out.println("Model: " + this.model + ", Battery Life: " + this.batteryLife + " hours");
    }

//    public void useblood() {
//        System.out.println("Running the useblood method in the superclass");
//    }
}
