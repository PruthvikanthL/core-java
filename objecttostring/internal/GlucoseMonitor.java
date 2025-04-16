package com.inheritance.overriding.internal;

public class GlucoseMonitor {
    private String model;
    private int batteryLife;

    public GlucoseMonitor() {
        System.out.println("Running the GlucoseMonitor const");
    }

    public void setGlucoseMonitor(String model, int batteryLife) {
        this.model = model;
        this.batteryLife = batteryLife;
    }

    public String toString() {
        return "Model: " + model + ", Battery Life: " + batteryLife + " hours";
    }

    public void monitorDisp() {
        System.out.println("Model: " + this.model + ", Battery Life: " + this.batteryLife + " hours");
    }

//    public void useglu() {
//        System.out.println("Running the useglu method in the super class");
//    }
}
