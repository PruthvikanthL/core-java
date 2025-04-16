package com.inheritance.overriding.internal;

public class ECGMonitor {
    private String model;
    private int batteryLife;

    public ECGMonitor() {
        System.out.println("Running the ECGMonitor const");
    }

    public void setECGMonitor(String model, int batteryLife) {
        this.model = model;
        this.batteryLife = batteryLife;
    }

    public String toString() {
        return "Model: " + model + ", Battery Life: " + batteryLife + " hours";
    }

    public void monitorDisp() {
        System.out.println("Model: " + this.model + ", Battery Life: " + this.batteryLife + " hours");
    }

//    public void useecg() {
//        System.out.println("Running the useecg method in the superclass");
//    }
}
